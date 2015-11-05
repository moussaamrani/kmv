package be.unamur.coreal.generator

import be.unamur.coreal.coreAL.ConditionalStmt
import be.unamur.coreal.coreAL.Operation
import be.unamur.coreal.coreAL.RepeatLoopStmt
import be.unamur.coreal.coreAL.ReturnStmt
import be.unamur.coreal.coreAL.Statement
import be.unamur.coreal.coreAL.VariableDeclaration
import be.unamur.coreal.coreAL.WhileLoopStmt
import be.unamur.coreal.util.CoreALModelUtil
import com.google.common.collect.HashBiMap
import java.util.HashMap
import java.util.List
import java.util.Map

class OperationBodyNumberer implements Iterable<Map.Entry<Integer, Statement>> {
	extension CoreALModelUtil calu = new CoreALModelUtil

	public static final Integer BOT = -1
	private Operation operation
	protected HashBiMap<Integer, Statement> rank = HashBiMap.create
	private HashMap<Integer, Pair<Integer, Integer>> next = new HashMap<Integer, Pair<Integer, Integer>>


	/**
	 * Basic constructor in charge of calling suboperations
	 */
	new(Operation operation) {
		this.operation = operation
		operation.numbering
		computeNext
	}

	public def Statement getStatement(int i){
		if(!rank.keySet.contains(i))
			return null
		return rank.get(i)
	}

	public def Pair<Integer, Integer> getNext(int i){
		if(!rank.keySet.contains(i))
			throw new IllegalArgumentException("Statement number not found.")
		if(!next.keySet.contains(i))
			return Pair.of(i+1, BOT)
		else
			return next.get(i)
	}

	/**
	 * Wrapper method 
	 */
	private def void numbering(Operation op) {
		number(op.body.statements, 1)
	}

	/**
	 * 
	 */
	private def int number(List<Statement> statements, int first) {
		var index = first
		for (stmt : statements) {
			switch (stmt) {
				
				VariableDeclaration:{}
				ConditionalStmt: {
					rank.put(index, stmt)
					index++
					var int n = number(stmt.then.statements, index)
					if (stmt.^else != null) {
						index = number(stmt.^else.statements, n)
					} else {
						index = n
					}
				}
				WhileLoopStmt: {
					rank.put(index, stmt)
					index++
					index = number(stmt.body.statements, index)
				}
				RepeatLoopStmt: {
					index = number(stmt.body.statements, index)
					rank.put(index, stmt)
					index++
				}
				default: {
					rank.put(index, stmt)
					index++
				}
			}
		}
		return index
	}

	/**
	 * 
	 */
	private def computeNext() {		
		val inverse = rank.inverse
		val bcIterator = CoreALModelUtil.branchingStatementIterator(operation)
		while(bcIterator.hasNext) {
			val stmt = bcIterator.next
			val stmtKey = inverse.get(stmt)
			if (stmtKey != null) {
				switch (stmt) {
					ReturnStmt:
						next.put(stmtKey, Pair.of(BOT, BOT))
					ConditionalStmt: {
						val nextStmt = stmt.nextStatement
						val nextStmtKey = if(nextStmt == null) -1 else inverse.get(nextStmt) 
						val firstThenKey = inverse.get(stmt.then.statements.get(0))
						next.put(inverse.get(stmt.then.statements.last), Pair.of(nextStmtKey, BOT))
						if (stmt.^else == null)
							next.put(stmtKey, Pair.of(firstThenKey, nextStmtKey))
						else {
							next.put(stmtKey, Pair.of(firstThenKey, inverse.get(stmt.^else.statements.get(0))))
							next.put(inverse.get(stmt.^else.statements.last), Pair.of(nextStmtKey, BOT))
						}
					}
				}
			}
		}
	}
	
	override iterator() {
		return new OperationBodyIterator(this)
	}
	
	public def iteratorCF(){
		return next.entrySet.iterator
	}
	
	override toString() {
		var result = "-------RANK------\n"
		var iterator = this.iterator
		while(iterator.hasNext){
			var entry = iterator.next
			result += "K: " + entry.key + " |-> V: " + entry.value.eClass.name + "\n"
		}
		result += "-------NEXT------\n"
		for(Map.Entry<Integer, Pair<Integer, Integer>> entry : next.entrySet){
			result += "K: " + entry.key + " |-> V: " + entry.value + "\n"
		}
		return result
	}

	public static def print(Pair<Integer, Integer> pair){
		return "< " + pair.key.toString + pair.value.toString + " >"
	}

}