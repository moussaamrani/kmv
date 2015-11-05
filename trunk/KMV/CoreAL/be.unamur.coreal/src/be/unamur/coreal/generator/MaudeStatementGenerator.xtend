package be.unamur.coreal.generator

import be.unamur.coreal.coreAL.BranchingStmt
import be.unamur.coreal.coreAL.ExpressionStmt
import be.unamur.coreal.coreAL.ReturnStmt

import static be.unamur.coreal.generator.MaudeConstants.*

class MaudeStatementGenerator {
	
	extension MaudeExpressionGenerator meg = new MaudeExpressionGenerator
	
	def dispatch CharSequence generate(BranchingStmt stmt){
		return IFF + " (" + meg.generate(stmt.expression) + ")"	
	}	
	
	def dispatch CharSequence generate(ReturnStmt stmt){
		return RETURN + "( " + meg.generate(stmt.expression) + " )"
	}
		
	def dispatch CharSequence generate(ExpressionStmt stmt){
		return meg.generate(stmt)
	}
}