package be.unamur.coreal.typing

import be.unamur.coreal.coreAL.AddCollectionFeature
import be.unamur.coreal.coreAL.AdditiveExpression
import be.unamur.coreal.coreAL.AndExpression
import be.unamur.coreal.coreAL.AtCollectionFeature
import be.unamur.coreal.coreAL.BooleanLiteral
import be.unamur.coreal.coreAL.BooleanType
import be.unamur.coreal.coreAL.Class
import be.unamur.coreal.coreAL.CollectionLiteral
import be.unamur.coreal.coreAL.CollectionType
import be.unamur.coreal.coreAL.ComparativeExpression
import be.unamur.coreal.coreAL.CoreALFactory
import be.unamur.coreal.coreAL.DelCollectionFeature
import be.unamur.coreal.coreAL.Enumeration
import be.unamur.coreal.coreAL.EqualityExpression
import be.unamur.coreal.coreAL.Expression
import be.unamur.coreal.coreAL.Feature
import be.unamur.coreal.coreAL.FeatureSelection
import be.unamur.coreal.coreAL.InstanceofExpression
import be.unamur.coreal.coreAL.IntegerType
import be.unamur.coreal.coreAL.IsEmptyCollectionFeature
import be.unamur.coreal.coreAL.LocalReference
import be.unamur.coreal.coreAL.MultiplicativeExpression
import be.unamur.coreal.coreAL.NewInstanceExpression
import be.unamur.coreal.coreAL.NullLiteral
import be.unamur.coreal.coreAL.Operation
import be.unamur.coreal.coreAL.OrExpression
import be.unamur.coreal.coreAL.PrimitiveType
import be.unamur.coreal.coreAL.SelfExpression
import be.unamur.coreal.coreAL.SizeCollectionFeature
import be.unamur.coreal.coreAL.StringLiteral
import be.unamur.coreal.coreAL.StringType
import be.unamur.coreal.coreAL.StructuralProperty
import be.unamur.coreal.coreAL.SuperExpression
import be.unamur.coreal.coreAL.Type
import be.unamur.coreal.coreAL.TypeReference
import be.unamur.coreal.coreAL.UnaryExpression
import be.unamur.coreal.coreAL.VoidType
import be.unamur.coreal.lib.CoreALLib
import com.google.inject.Inject
import org.eclipse.internal.xtend.expression.ast.IntegerLiteral

import static extension be.unamur.coreal.util.CoreALModelUtil.*

class CoreALTypeProvider {
	@Inject extension CoreALLib
	
	public static val stringType = CoreALFactory::eINSTANCE.createClass => [name = "String"]
	public static val integerType = CoreALFactory::eINSTANCE.createClass => [name = "Integer"]
	public static val realType = CoreALFactory::eINSTANCE.createClass => [name = "Real"]
	public static val booleanType = CoreALFactory::eINSTANCE.createClass => [name = "Boolean"]
	public static val nullType = CoreALFactory::eINSTANCE.createClass => [name = "Null"]
	
	def Type typeFor(Expression e){
		switch(e){ 
			SelfExpression: e.containingClass
			SuperExpression: e.containingClass.superclassOrObject
			LocalReference: e.ref.collectionType.typeOf
			NewInstanceExpression: e.type
			NullLiteral: nullType
			StringLiteral: stringType
			BooleanLiteral: booleanType
			IntegerLiteral: integerType
//			EnumerationLiteral: Enumeration
			CollectionLiteral: typeFor(e.elements.head)
			
			OrExpression,
			AndExpression,
			EqualityExpression,
			InstanceofExpression,
			ComparativeExpression: booleanType
			AdditiveExpression,
			MultiplicativeExpression:integerType
			UnaryExpression: if(e.op=="+" || e.op=="-"){integerType}else{booleanType}
			
			FeatureSelection:
				if(e.coll != null){
					switch(e.coll){
						SizeCollectionFeature: integerType
						AddCollectionFeature,
						DelCollectionFeature: nullType
						IsEmptyCollectionFeature: booleanType
						AtCollectionFeature: typeFor(e.receiver)
					}
				}else{
					if(e.feature != null)
						e.feature.typeOf
				}
		}
	}

	def static Type typeOf(PrimitiveType ptype){
		switch(ptype){
			IntegerType: CoreALTypeProvider.integerType
			StringType: CoreALTypeProvider.stringType
			BooleanType: CoreALTypeProvider.booleanType
		}
	}

	def static Type typeOf(TypeReference t){
		var Type result
		if(t.ref != null)
			result = t.ref
		if(t.kind != null)
			result = t.kind.typeOf
		return result	
	}

	def static Type typeOf(CollectionType ctype){
		return typeOf(ctype.type)
	}	
	
	def static Type typeOf(Feature feature){
		switch(feature){
			Operation: switch(feature.type){
				VoidType: nullType
				CollectionType: (feature.type as CollectionType).typeOf
			}
			StructuralProperty: feature.collectionType.typeOf
		}
	}
	
	def isPrimitiveType(Type c){
		c instanceof Class && (c as Class).eResource == null
	}
}