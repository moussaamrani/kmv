package be.unamur.coreal.util

import be.unamur.coreal.coreAL.Attribute
import be.unamur.coreal.coreAL.Bag
import be.unamur.coreal.coreAL.Block
import be.unamur.coreal.coreAL.Body
import be.unamur.coreal.coreAL.BooleanType
import be.unamur.coreal.coreAL.BranchingStmt
import be.unamur.coreal.coreAL.Class
import be.unamur.coreal.coreAL.CollectionType
import be.unamur.coreal.coreAL.ConditionalBlock
import be.unamur.coreal.coreAL.Enumeration
import be.unamur.coreal.coreAL.Feature
import be.unamur.coreal.coreAL.IntegerType
import be.unamur.coreal.coreAL.Metamodel
import be.unamur.coreal.coreAL.Multiplicity
import be.unamur.coreal.coreAL.Operation
import be.unamur.coreal.coreAL.OrderedSet
import be.unamur.coreal.coreAL.PrimitiveType
import be.unamur.coreal.coreAL.RealType
import be.unamur.coreal.coreAL.Reference
import be.unamur.coreal.coreAL.ReturnType
import be.unamur.coreal.coreAL.Sequence
import be.unamur.coreal.coreAL.Set
import be.unamur.coreal.coreAL.Statement
import be.unamur.coreal.coreAL.StringType
import be.unamur.coreal.coreAL.Type
import be.unamur.coreal.coreAL.TypeReference
import be.unamur.coreal.coreAL.VariableDeclaration
import be.unamur.coreal.coreAL.VoidType
import be.unamur.coreal.typing.CoreALTypeProvider
import java.util.List
import org.eclipse.emf.ecore.EObject

import static extension org.eclipse.xtext.EcoreUtil2.*

class CoreALModelUtil {

	def static attributes(Class c) {
		c.features.filter(typeof(Attribute))
	}

	def static classes(Metamodel MM) {
		MM.types.filter(typeof(Class))
	}

	def static declarations(Operation op){
		op.body.statements.filter(typeof(VariableDeclaration))
	}

	def static enumerations(Metamodel MM) {
		MM.types.filter(typeof(Enumeration))
	}

	def static operations(Class c) {
		c.features.filter(typeof(Operation))
	}

	def static properties(Class c) {
		c.attributes + c.references
	}

	def static references(Class c) {
		c.features.filter(typeof(Reference))
	}

	def static containingBlock(Statement stmt){
		stmt.getContainerOfType(typeof(Block))
	}

	def static containingClass(EObject e) {
		e.getContainerOfType(typeof(Class))
	}

	def static containingDeclaration(Multiplicity m) {
		m.getContainerOfType(typeof(Feature))
	}

	def static containingEnumeration(EObject e) {
		e.getContainerOfType(typeof(Enumeration))
	}

	def static containingMetamodel(EObject e) {
		e.getContainerOfType(typeof(Metamodel))
	}

	def static containingOperation(EObject e) {
		e.getContainerOfType(typeof(Operation))
	}

	def static isLastStatementInBlock(Statement stmt, Block block){
		return (block.statements.last == stmt)
	}

	def static branchingStatementIterator(Operation op){
		return op.getAllContents(true).filter(typeof(BranchingStmt))
	}

	def Statement nextStatement(Statement stmt){
		return nextStatement(stmt, stmt.containingBlock)
	}

	def dispatch Statement nextStatement(Statement stmt, ConditionalBlock block){
		if(stmt.isLastStatementInBlock(block)){
			val containingStmt = block.getContainerOfType(typeof(BranchingStmt))
			return nextStatement(containingStmt, containingStmt.containingBlock)
		}else
			return block.statements.get(block.statements.indexOf(stmt)+1)
	}

	def dispatch Statement nextStatement(Statement stmt, Body block){
		if(stmt.isLastStatementInBlock(block))
			return null
		else
			return block.statements.get(block.statements.indexOf(stmt)+1)
	}
	
	def static nestedBranchingStatements(Operation operation){
		operation.body.statements.typeSelect(typeof(BranchingStmt))
	}
	
	
	def static classHierarchy(Class c) {
		val visited = <Class>newArrayList()
		var current = c.superClass
		while (current != null && !visited.contains(current)) {
			visited.add(current)
			current = current.superClass
		}
		return visited
	}

	def static Type typeOf(PrimitiveType ptype) {
		switch (ptype) {
			IntegerType: CoreALTypeProvider.integerType
			StringType: CoreALTypeProvider.stringType
			RealType: CoreALTypeProvider.realType
			BooleanType: CoreALTypeProvider.booleanType
		}
	}

	def static Type typeOf(TypeReference t) {
		var Type result
		if (t.ref != null)
			result = t.ref
		if (t.kind != null)
			result = typeOf(t.kind)
		return result
	}

	def static Type typeOf(CollectionType ctype) {
		return typeOf(ctype.type)
	}

	def static Type typeOf(ReturnType rtype) {
		if (rtype instanceof VoidType)
			return CoreALTypeProvider.Void
		else
			return typeOf((rtype as CollectionType).type)
	}

	/**
	 * Returns true iff <code>ctype</code> defines an unique 
	 * collection value
	 */
	def static isUnique(CollectionType ctype) {
		val coll = ctype.collection
		if (coll == null)
			return true
		else
			switch (coll) {
				Bag: return false
				Set: return true
				Sequence: return false
				OrderedSet: return true
			}
	}

	/**
	 * Returns true iff <code>rtype</code> defines an unique 
	 * collection value
	 */
	def static isUnique(ReturnType rtype) {
		switch (rtype) {
			VoidType: true
			CollectionType: rtype.isUnique
		}
	}

	/**
	 * Returns true iff <code>ctype</code> defines an ordered 
	 * collection value
	 */
	def static isOrdered(CollectionType ctype) {
		val coll = ctype.collection
		if (coll == null)
			return false
		else
			switch (coll) {
				Bag: return false
				Set: return false
				Sequence: return true
				OrderedSet: return true
			}
	}

	/**
	 * Returns true iff <code>ctype</code> defines an ordered 
	 * collection value
	 */
	def static isOrdered(ReturnType rtype) {
		switch (rtype) {
			VoidType: true
			CollectionType: rtype.isUnique
		}
	}

	/**
	 * Returns the lowerbound in <code>ctype</code>,
	 * or the default value -1 if none is provided
	 */
	def static int lowerbound(CollectionType ctype) {
		if (ctype.multiplicity == null)
			return 1
		else
			return ctype.multiplicity.lowerbound
	}

	/**
	 * Returns the upperbound in <code>ctype</code>,
	 * or the default value -1 if none is provided
	 */
	def static int upperbound(CollectionType ctype) {
		if (ctype.multiplicity == null)
			return 1
		else if (ctype.multiplicity.upperbound.isIsWildcard)
			return -1
		else
			return ctype.multiplicity.upperbound.value
	}

	/**
	 * Returns the lowerbound in <code>ctype</code>,
	 * or the default value -1 if none is provided
	 */
	def static int lowerbound(ReturnType rtype) {
		switch (rtype) {
			VoidType: 1
			CollectionType: rtype.lowerbound
		}
	}

	/**
	 * Returns the upperbound in <code>ctype</code>,
	 * or the default value -1 if none is provided
	 */
	def static int upperbound(ReturnType rtype) {
		switch (rtype) {
			VoidType: 1
			CollectionType: rtype.upperbound
		}
	}

}