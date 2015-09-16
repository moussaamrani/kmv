package be.unamur.coreal.typing

import be.unamur.coreal.coreAL.AddCollectionFeature
import be.unamur.coreal.coreAL.AdditiveExpression
import be.unamur.coreal.coreAL.AndExpression
import be.unamur.coreal.coreAL.AssignmentExpression
import be.unamur.coreal.coreAL.AtCollectionFeature
import be.unamur.coreal.coreAL.BooleanLiteral
import be.unamur.coreal.coreAL.Class
import be.unamur.coreal.coreAL.CollectionLiteral
import be.unamur.coreal.coreAL.CollectionType
import be.unamur.coreal.coreAL.ComparativeExpression
import be.unamur.coreal.coreAL.CoreALFactory
import be.unamur.coreal.coreAL.CoreALPackage
import be.unamur.coreal.coreAL.DelCollectionFeature
import be.unamur.coreal.coreAL.EnumerationLiteral
import be.unamur.coreal.coreAL.EqualityExpression
import be.unamur.coreal.coreAL.Expression
import be.unamur.coreal.coreAL.InstanceofExpression
import be.unamur.coreal.coreAL.IntegerLiteral
import be.unamur.coreal.coreAL.IsEmptyCollectionFeature
import be.unamur.coreal.coreAL.LocalReference
import be.unamur.coreal.coreAL.MemberSelection
import be.unamur.coreal.coreAL.MultiplicativeExpression
import be.unamur.coreal.coreAL.NewInstanceExpression
import be.unamur.coreal.coreAL.NullLiteral
import be.unamur.coreal.coreAL.Operation
import be.unamur.coreal.coreAL.OrExpression
import be.unamur.coreal.coreAL.Parameter
import be.unamur.coreal.coreAL.ReturnStmt
import be.unamur.coreal.coreAL.SelfExpression
import be.unamur.coreal.coreAL.SizeCollectionFeature
import be.unamur.coreal.coreAL.StringLiteral
import be.unamur.coreal.coreAL.StructuralProperty
import be.unamur.coreal.coreAL.SuperExpression
import be.unamur.coreal.coreAL.Type
import be.unamur.coreal.coreAL.UnaryExpression
import be.unamur.coreal.coreAL.VoidType
import be.unamur.coreal.lib.CoreALLib
import com.google.inject.Inject

import static extension be.unamur.coreal.util.CoreALModelUtil.*
import be.unamur.coreal.coreAL.WhileLoopStmt
import be.unamur.coreal.coreAL.BranchingStmt

class CoreALTypeProvider {
	@Inject extension CoreALLib

	public static val stringType  = CoreALFactory::eINSTANCE.createClass => [name = "String"]
	public static val integerType = CoreALFactory::eINSTANCE.createClass => [name = "Integer"]
	public static val realType    = CoreALFactory::eINSTANCE.createClass => [name = "Real"]
	public static val booleanType = CoreALFactory::eINSTANCE.createClass => [name = "Boolean"]
	public static val nullType    = CoreALFactory::eINSTANCE.createClass => [name = "Null"]

	val ep = CoreALPackage::eINSTANCE

	def Type typeFor(Expression e) {
		switch (e) {
			SelfExpression:
				return e.containingClass
			SuperExpression:
				return e.containingClass.superclassOrObject
			LocalReference:
				return e.ref.collectionType.typeOf
			NewInstanceExpression:
				return e.type
			NullLiteral:
				return nullType
			StringLiteral:
				return stringType
			BooleanLiteral:
				return booleanType
			IntegerLiteral:
				return integerType
			CollectionLiteral:
				return typeFor(e.elements.head)
			EnumerationLiteral:
				return e.enumeration
			OrExpression,
			AndExpression,
			EqualityExpression,
			InstanceofExpression,
			ComparativeExpression:
				return booleanType
			AdditiveExpression,
			MultiplicativeExpression:
				return integerType
			UnaryExpression:
				if (e.op == "+" || e.op == "-") {
					return integerType
				} else {
					return booleanType
				}
			MemberSelection:
				if(e.coll !=null && e.member == null){
					switch(e.coll){
						AddCollectionFeature,
						DelCollectionFeature: return nullType
						IsEmptyCollectionFeature: return booleanType
						SizeCollectionFeature: return integerType
						AtCollectionFeature: return e.receiver.typeFor
					}
				}else if (e.coll == null && e.member != null)
					return e.member.typeOf
		}
	}

	def expectedType(Expression exp){
		val container = exp.eContainer
		val feature   = exp.eContainingFeature
		switch(container){
			AssignmentExpression case feature == ep.assignmentExpression_Right:
				container.left.typeFor
			BranchingStmt case feature == ep.branchingStmt_Expression:
				booleanType
			ReturnStmt case feature == ep.returnStmt_Expression:
				container.containingOperation.typeOf
			MemberSelection case feature == ep.memberSelection_Args:
				try{
					(container.member as Operation).parameters.get(container.args.indexOf(exp)).typeOf
				}catch(Throwable t){
					null
				}
		}
	}

	def dispatch Type typeOf(Operation op) {
		switch (op.type) {
			VoidType: return nullType
			CollectionType: return (op.type as CollectionType).typeOf
		}
	}

	def dispatch Type typeOf(StructuralProperty prop) {
		return prop.collectionType.typeOf
	}

	def dispatch Type typeOf(Parameter param) {
		return param.collectionType.typeOf
	}

	def isPrimitiveType(Type c) {
		c instanceof Class && (c as Class).eResource == null
	}
	
	def isCollection(CollectionType ctype){
		ctype.multiplicity.upperbound.isWildcard ||
		ctype.multiplicity.upperbound.value > 1  ||
		ctype.collection != null
	}
}