package be.unamur.coreal.generator

import be.unamur.coreal.coreAL.AddCollectionFeature
import be.unamur.coreal.coreAL.AdditiveExpression
import be.unamur.coreal.coreAL.AndExpression
import be.unamur.coreal.coreAL.AsBag
import be.unamur.coreal.coreAL.AsOrderedSet
import be.unamur.coreal.coreAL.AsSequence
import be.unamur.coreal.coreAL.AsSet
import be.unamur.coreal.coreAL.AssignmentExpression
import be.unamur.coreal.coreAL.AtCollectionFeature
import be.unamur.coreal.coreAL.BagLiteral
import be.unamur.coreal.coreAL.BooleanLiteral
import be.unamur.coreal.coreAL.CollectionOperation
import be.unamur.coreal.coreAL.ComparativeExpression
import be.unamur.coreal.coreAL.Enumeration
import be.unamur.coreal.coreAL.EnumerationLiteral
import be.unamur.coreal.coreAL.EqualityExpression
import be.unamur.coreal.coreAL.Expression
import be.unamur.coreal.coreAL.InstanceofExpression
import be.unamur.coreal.coreAL.IntegerLiteral
import be.unamur.coreal.coreAL.IsEmptyCollectionFeature
import be.unamur.coreal.coreAL.ListLiteral
import be.unamur.coreal.coreAL.LocalReference
import be.unamur.coreal.coreAL.MemberSelection
import be.unamur.coreal.coreAL.MultiplicativeExpression
import be.unamur.coreal.coreAL.NewInstanceExpression
import be.unamur.coreal.coreAL.NullLiteral
import be.unamur.coreal.coreAL.OrExpression
import be.unamur.coreal.coreAL.OrderedSetLiteral
import be.unamur.coreal.coreAL.SelfExpression
import be.unamur.coreal.coreAL.SetLiteral
import be.unamur.coreal.coreAL.SizeCollectionFeature
import be.unamur.coreal.coreAL.StringLiteral
import be.unamur.coreal.coreAL.SuperExpression
import be.unamur.coreal.coreAL.UnaryExpression
import java.util.List

import static be.unamur.coreal.generator.MaudeConstants.*

class MaudeExpressionGenerator {
	extension MaudeNameProvider e = new MaudeNameProvider

	def dispatch CharSequence generate(AssignmentExpression stmt){
		return stmt.left.generate + ASSIGN + stmt.right.generate
	}

	def dispatch CharSequence generate(OrExpression e){
		return "(" + e.left.generate + ")" + OR + "(" + e.right.generate + ")"
	}

	def dispatch CharSequence generate(AndExpression e){
		return "(" + e.left.generate + ")" + AND + "(" + e.right.generate  + ")"		
	}

	def dispatch CharSequence generate(EqualityExpression e){
		return "(" + e.left.generate +  
			(if(e.op == "==") EQUALS else NOT_EQUALS)
			+ e.right.generate + ")"
	}

	def dispatch CharSequence generate(InstanceofExpression e){
		return e.expression + " . " + INSTANCEOF + "(" + e.type.maudeName + ")"
	}

	def dispatch CharSequence generate(ComparativeExpression e){
		return e.left.generate + " " + e.op + " " + e.right.generate
	}

	def dispatch CharSequence generate(AdditiveExpression e){
		return e.left.generate + " " + e.op + " " + e.right.generate 
	}

	def dispatch CharSequence generate(MultiplicativeExpression e){
		return e.left.generate + " " + e.op + " " + e.right.generate
	}

	def dispatch CharSequence generate(UnaryExpression e){
		val op = if(e.op == "+") "" else if(e.op == "- ") e.op else "not "
		return op + "( " + e.operand.generate + " )"
	}

	def dispatch CharSequence generate(MemberSelection e){
		return e.receiver.generate + 
			if(!e.isIsCollectionOperation)
				if(e.isMethodinvocation){
					DOT + '"' + e.member.name + '"' + 
					(if(e.args.empty) " <> " else " < " + e.args.generate + " > ")				
				}else
					DOT + e.member.maudeName
			else{
				ARROW + e.coll.generate + 
				if(e.args.empty)
					"()"
				else
					" ( " + e.args.generate + " )"
			} 
	}

	def dispatch CharSequence generate(List<Expression> exps){
		return exps.map[generate].join(" , ")
	}

	def dispatch CharSequence generate(CollectionOperation e){
		switch(e){
			SizeCollectionFeature   : SIZE
			AtCollectionFeature     : AT
			AddCollectionFeature    : ADD
			IsEmptyCollectionFeature: IS_EMPTY
			AsSequence              : ASSEQUENCE
			AsSet                   : ASSEQUENCE
			AsBag                   : ASSEQUENCE
			AsOrderedSet            : ASSEQUENCE
		}
	}

	def dispatch CharSequence generate(SelfExpression e){
		return SELF
	}

	def dispatch CharSequence generate(SuperExpression e){
		return SUPER 
	}

	def dispatch CharSequence generate(LocalReference e){
		return e.ref.maudeName
	}

	def dispatch CharSequence generate(NewInstanceExpression e){
		return "new( " + e.type.maudeName + " )" 
	}

	def dispatch CharSequence generate(BagLiteral e){
		return generateDefault
	}

	def dispatch CharSequence generate(SetLiteral e){
		return generateDefault
	}

	def dispatch CharSequence generate(ListLiteral e){
		return generateDefault
	}

	def dispatch CharSequence generate(OrderedSetLiteral e){
		return generateDefault
	}

	def dispatch CharSequence generate(IntegerLiteral e){
		return e.value.toString
	}

	def dispatch CharSequence generate(StringLiteral e){
		return '"' + e.value + '"'
	}

	def dispatch CharSequence generate(NullLiteral e){
		return NULL	
	}

	def dispatch CharSequence generate(EnumerationLiteral e){
		return e.literal.maudeName 
	}

	def dispatch CharSequence generate(BooleanLiteral e){
		if(e.isIsTrue) 
			return TRUE
		else
			return FALSE
	}
	
	def CharSequence generateDefault(){
		return "$$$$"
	}
}