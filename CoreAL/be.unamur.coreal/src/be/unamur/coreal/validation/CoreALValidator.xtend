/*
 * generated by Xtext
 */
package be.unamur.coreal.validation

import be.unamur.coreal.coreAL.AtCollectionFeature
import be.unamur.coreal.coreAL.Attribute
import be.unamur.coreal.coreAL.Class
import be.unamur.coreal.coreAL.CoreALPackage
import be.unamur.coreal.coreAL.EnumLiteral
import be.unamur.coreal.coreAL.Enumeration
import be.unamur.coreal.coreAL.Feature
import be.unamur.coreal.coreAL.FeatureSelection
import be.unamur.coreal.coreAL.Operation
import be.unamur.coreal.coreAL.Reference
import be.unamur.coreal.coreAL.StructuralProperty
import be.unamur.coreal.coreAL.Variable
import be.unamur.coreal.scoping.CoreALIndex
import com.google.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.CheckType

import static extension be.unamur.coreal.util.CoreALModelUtil.*
import static extension org.eclipse.xtext.EcoreUtil2.*

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class CoreALValidator extends AbstractCoreALValidator {
	@Inject extension CoreALIndex
	@Inject extension IQualifiedNameProvider

	public static val HIERARCHY_CYCLE = "HIERARCHY_CYCLE_DETECTED"
	public static val DUPLICATE_CLASS = "DUPLICATE_CLASS" 
	public static val DUPLICATE_ELEMENT = "DUPLICATE_ELEMENT" 
	public static val WRONG_TYPE = "WRONG_TYPE"
	public static val PROPERTY_SELECTION_ON_METHOD = "FIELD_SELECTION_ON_METHOD"
	public static val WRONG_SUPER_USAGE = "WRONG_SUPER_USAGE"

	@Check
	def void checkClassHierarchy(Class c) {
		if (c.classHierarchy.contains(c)) {
			error("Cycle in hierarchy of Class '" + c.name + "'",
				CoreALPackage::eINSTANCE.class_SuperClass,
				HIERARCHY_CYCLE,
				c.superClass.name)
		}
	}

	@Check
	def void checkNoDuplicateClass(Class c){
		if(c.containingMetamodel.classes.exists[it != c && it.name == c.name])
			error("Duplicate Class '" + c.name + "'",
				CoreALPackage::eINSTANCE.type_Name,
				DUPLICATE_ELEMENT)
	}

	@Check(CheckType::NORMAL)
	def checkDuplicateClassesInFiles(Class c) {
		val className = c.fullyQualifiedName
		c.getVisibleClassesDescriptions.forEach[
			desc |
			if (desc.qualifiedName == className && 
					desc.EObjectOrProxy != c && 
					desc.EObjectURI.trimFragment != c.eResource.URI) {
				error(
					"The type " + c.name + " is already defined in another file. Check imports...",
					CoreALPackage.Literals.TYPE__NAME,
					DUPLICATE_CLASS)
				return
			}
		]
	}

	@Check
	def void checkNoDuplicateProperty(StructuralProperty p){ 
		if(p.containingClass.properties.exists[
			it != p && 
			it.name == p.name])
			error("Duplicate Structural Property '" + p.collectionType + "'",
				CoreALPackage::eINSTANCE.feature_Name,
				DUPLICATE_ELEMENT)
	}
	
	@Check
	def void checkNoDuplicateOperation(Operation op){
		val duplicate = op.containingClass.features.findFirst[
			it != op && 
			it.eClass == op.eClass 
			&& it.name == op.name] 
		if(duplicate != null)
			error("Duplicate Operation '" + op.name + "'",
				CoreALPackage::eINSTANCE.feature_Name,
				DUPLICATE_ELEMENT)
	}
		
	@Check
	def void checkNoDuplicateEnumeration(Enumeration e){
		if(e.containingMetamodel.enumerations.exists[it != e && it.name == e.name])
			error("Duplicate Enumeration '" + e.name + "'",
				CoreALPackage::eINSTANCE.type_Name,
				DUPLICATE_ELEMENT
			)
	}
	
	@Check
	def void checkNoDuplicateEnumerationLiteral(EnumLiteral lit) {
		if (lit.containingEnumeration.literals.exists[it != lit && it.name == lit.name])
			error("Duplicate EEnumeration Literal '" + lit.name + "'",
					CoreALPackage::eINSTANCE.enumLiteral_Name,
					DUPLICATE_ELEMENT)
	}
	
	@Check
	def void checkNoDuplicateVariable(Variable variable){
		val duplicate = variable.containingOperation.body.
			getAllContentsOfType(typeof(Variable)).findFirst[it != variable && it.name == variable.name]
		if(duplicate != null)
			error("Duplicate variable declaration '" + variable.name + "'",
				CoreALPackage::eINSTANCE.local_Name)
	}
	
	@Check
	def void checkCorrectPropertyType(Feature feature){
		switch(feature){
			Attribute: if(!(feature.collectionType.type.kind != null || feature.collectionType.type.ref instanceof Enumeration))
							error("Wrong Type for Attribute '" + feature.name + "'. Should be an enumeration or a primitive type",
								CoreALPackage::eINSTANCE.feature_Name,
								WRONG_TYPE)
			Reference: if(!(feature.collectionType.type.kind == null && feature.collectionType.type.ref instanceof Class))
							error("Wrong Type for Reference '" + feature.name + "'. Should be a Class",
								CoreALPackage::eINSTANCE.feature_Name,
								WRONG_TYPE)
		}
	}
	
	@Check
	def void checkFeatureSelection(FeatureSelection sel){
		val feature = sel
		if(feature != null){
			if(feature.coll != null && !sel.methodinvocation){
				error("Collection Operation invocation without correct parentheses",
					CoreALPackage::eINSTANCE.featureSelection_Methodinvocation,
					PROPERTY_SELECTION_ON_METHOD)
			}
			if(feature.coll != null && feature.coll instanceof AtCollectionFeature && sel.args.empty)
				error("Collection Operation 'at' invocation without index parameter",
					CoreALPackage::eINSTANCE.featureSelection_Methodinvocation,
					PROPERTY_SELECTION_ON_METHOD)
			if(feature.feature != null && feature.feature instanceof StructuralProperty && sel.methodinvocation)
				error("Operation invocation on Property '" + feature.feature.name + "'",
					CoreALPackage::eINSTANCE.featureSelection_Feature,
					PROPERTY_SELECTION_ON_METHOD)
			
			if(feature.feature != null && feature.feature instanceof Operation && !sel.methodinvocation)
				error("Property selection on the Operation '" + feature.feature.name + "'",
					CoreALPackage::eINSTANCE.featureSelection_Methodinvocation,
					PROPERTY_SELECTION_ON_METHOD)
		}
	}

}
