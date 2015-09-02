package be.unamur.coreal.util

import be.unamur.coreal.coreAL.Attribute
import be.unamur.coreal.coreAL.BooleanType
import be.unamur.coreal.coreAL.Class
import be.unamur.coreal.coreAL.CollectionType
import be.unamur.coreal.coreAL.Enumeration
import be.unamur.coreal.coreAL.Feature
import be.unamur.coreal.coreAL.IntegerType
import be.unamur.coreal.coreAL.Metamodel
import be.unamur.coreal.coreAL.Multiplicity
import be.unamur.coreal.coreAL.Operation
import be.unamur.coreal.coreAL.PrimitiveType
import be.unamur.coreal.coreAL.RealType
import be.unamur.coreal.coreAL.Reference
import be.unamur.coreal.coreAL.StringType
import be.unamur.coreal.coreAL.Type
import be.unamur.coreal.coreAL.TypeReference
import be.unamur.coreal.typing.CoreALTypeProvider
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.xbase.XBlockExpression

import static extension org.eclipse.xtext.EcoreUtil2.*

class CoreALModelUtil {
		def static enumerations(Metamodel MM) {
		MM.types.filter(typeof(Enumeration))
	}

	def static classes(Metamodel MM) {
		MM.types.filter(typeof(Class))
	}

	def static properties(Class c) {
		c.attributes + c.references
	}

	def static attributes(Class c) {
		c.features.filter(typeof(Attribute))
	}

	def static references(Class c) {
		c.features.filter(typeof(Reference))
	}

	def static operations(Class c) {
		c.features.filter(typeof(Operation))
	}

	def static containingClass(EObject e) {
		e.getContainerOfType(typeof(Class))
	}

	def static containingBlock(EObject e) {
		e.getContainerOfType(typeof(XBlockExpression))
	}

	def static containingMetamodel(EObject e) {
		e.getContainerOfType(typeof(Metamodel))
	}

	def static containingOperation(EObject e) {
		e.getContainerOfType(typeof(Operation))
	}

	def static containingEnumeration(EObject e) {
		e.getContainerOfType(typeof(Enumeration))
	}

	def static containingDeclaration(Multiplicity m){
		m.getContainerOfType(typeof(Feature))
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
	
	
	def static typeOf(PrimitiveType ptype){
		switch(ptype){
			IntegerType: CoreALTypeProvider.integerType
			StringType: CoreALTypeProvider.stringType
			RealType: CoreALTypeProvider.realType
			BooleanType: CoreALTypeProvider.booleanType
		}
	}
	
	def static typeOf(TypeReference t){
		var Type result
		if(t.ref != null)
			result = t.ref 
		if(t.kind != null)
			result = t.kind.typeOf 
		return result	
	}

	def static typeOf(CollectionType ctype){
		return typeOf(ctype.type)
	}
}