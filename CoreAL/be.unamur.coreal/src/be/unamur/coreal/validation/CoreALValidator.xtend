/*
 * generated by Xtext
 */
package be.unamur.coreal.validation

import be.unamur.coreal.coreAL.AtCollectionFeature
import be.unamur.coreal.coreAL.Attribute
import be.unamur.coreal.coreAL.Class
import be.unamur.coreal.coreAL.CollectionLiteral
import be.unamur.coreal.coreAL.CollectionType
import be.unamur.coreal.coreAL.CoreALPackage
import be.unamur.coreal.coreAL.EnumLiteral
import be.unamur.coreal.coreAL.Enumeration
import be.unamur.coreal.coreAL.Expression
import be.unamur.coreal.coreAL.Feature
import be.unamur.coreal.coreAL.MemberSelection
import be.unamur.coreal.coreAL.Operation
import be.unamur.coreal.coreAL.Parameter
import be.unamur.coreal.coreAL.Reference
import be.unamur.coreal.coreAL.ReturnStmt
import be.unamur.coreal.coreAL.SelfExpression
import be.unamur.coreal.coreAL.StructuralProperty
import be.unamur.coreal.coreAL.SuperExpression
import be.unamur.coreal.coreAL.VariableDeclaration
import be.unamur.coreal.coreAL.VoidType
import be.unamur.coreal.scoping.CoreALIndex
import be.unamur.coreal.typing.CoreALTypeConformance
import be.unamur.coreal.typing.CoreALTypeProvider
import com.google.inject.Inject
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.CheckType

import static extension be.unamur.coreal.util.CoreALModelUtil.*
import static extension org.eclipse.xtext.EcoreUtil2.*
import be.unamur.coreal.coreAL.ConditionalBlock

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class CoreALValidator extends AbstractCoreALValidator {
	@Inject extension CoreALIndex
	@Inject extension IQualifiedNameProvider
	@Inject extension CoreALTypeProvider
	@Inject extension CoreALTypeConformance

	public static val HIERARCHY_CYCLE = "HIERARCHY_CYCLE_DETECTED"
	public static val DUPLICATE_CLASS = "DUPLICATE_CLASS" 
	public static val DUPLICATE_ELEMENT = "DUPLICATE_ELEMENT" 
	public static val WRONG_TYPE = "WRONG_TYPE"
	public static val PROPERTY_SELECTION_ON_METHOD = "FIELD_SELECTION_ON_METHOD"
	public static val WRONG_SUPER_USAGE = "WRONG_SUPER_USAGE"
	public static val WRONG_SELF_USAGE = "WRONG_SELF_USAGE"
	public static val MULTIPLICITY_INCONSISTENCY="MULTIPLICITY_INCONSISTENCY"
	public static val INVALID_ABSTRACT_OPERATION = "INVALID_ABSTRACT_OPERATION"
	public static val ABSTRACT_OP_INSIDE_NONABSTRACT_CLASS = "ABSTRACT_OP_INSIDE_NONABSTRACT_CLASS" 
	public static val INCOMPATIBLE_TYPES = "INCOMPATIBLE_TYPES"	
	public static val OPPOSITE_INCONSISTENCY = "OPPOSITE_INCONSISTENCY"
	public static val DECLARATION_WITHIN_BLOCK = "DECLARATION_WITHIN_BLOCK"
	
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
					CoreALPackage::eINSTANCE.type_Name,
					DUPLICATE_CLASS)
			}
		]
	}

	@Check
	def void checkNoDuplicateProperty(StructuralProperty p){ 
		if(p.containingClass.properties.exists[
			it != p && 
			it.name == p.name])
			error("Duplicate structural property '" + p.name + "'",
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
			error("Duplicate operation '" + op.name + "'",
				CoreALPackage::eINSTANCE.feature_Name,
				DUPLICATE_ELEMENT)
	}
		
	@Check
	def void checkNoDuplicateEnumeration(Enumeration e){
		if(e.containingMetamodel.enumerations.exists[it != e && it.name == e.name])
			error("Duplicate enumeration '" + e.name + "'",
				CoreALPackage::eINSTANCE.type_Name,
				DUPLICATE_ELEMENT
			)
	}
	
	@Check
	def void checkNoDuplicateEnumerationLiteral(EnumLiteral lit) {
		if (lit.containingEnumeration.literals.exists[it != lit && it.name == lit.name])
			error("Duplicate enumeration literal '" + lit.name + "'",
					CoreALPackage::eINSTANCE.enumLiteral_Name,
					DUPLICATE_ELEMENT)
	}
	
	@Check
	def void checkNoDuplicateParameter(Parameter param){
		val duplicate = param.containingOperation.parameters.findFirst[it != param && it.name == param.name]
		if(duplicate != null)
			error("Duplicate parameter declaration '" + param.name + "'",
				CoreALPackage::eINSTANCE.local_Name,
				DUPLICATE_ELEMENT)
	}

	@Check
	def void checkNoDuplicateVariable(VariableDeclaration variable){
		val duplicate = variable.containingOperation.
			getAllContentsOfType(typeof(VariableDeclaration)).findFirst[it != variable && it.name == variable.name]
		if(duplicate != null)
			error("Duplicate variable declaration '" + variable.name + "'",
				CoreALPackage::eINSTANCE.local_Name,
				DUPLICATE_ELEMENT)
	}
	
	@Check
	def void checkCorrectPropertyType(Feature feature){
		switch(feature){
			Attribute: if(!(feature.collectionType.type.kind != null || feature.collectionType.type.ref instanceof Enumeration))
							error("Wrong type for Attribute '" + feature.name + "'. Should be an enumeration or a primitive type",
								CoreALPackage::eINSTANCE.feature_Name,
								WRONG_TYPE)
			Reference: if(!(feature.collectionType.type.kind == null && feature.collectionType.type.ref instanceof Class))
							error("Wrong type for Reference '" + feature.name + "'. Should be a Class",
								CoreALPackage::eINSTANCE.feature_Name,
								WRONG_TYPE)
		}
	}
	
	@Check
	def void checkMemberSelection(MemberSelection sel){
		if(sel != null){
//			if(sel.coll != null && !sel.methodinvocation){
//				error("Collection Operation invocation without correct parentheses",
//					CoreALPackage::eINSTANCE.memberSelection_Methodinvocation,
//					PROPERTY_SELECTION_ON_METHOD)
//			}
			if(sel.member != null && sel.member instanceof StructuralProperty && sel.methodinvocation)
				error("Operation invocation on Property '" + sel.member.name + "'",
					CoreALPackage::eINSTANCE.memberSelection_Member,
					PROPERTY_SELECTION_ON_METHOD)
			if(sel.member != null && sel.member instanceof Operation && !sel.methodinvocation)
				error("Property selection on the Operation '" + sel.member.name + "'",
					CoreALPackage::eINSTANCE.memberSelection_Methodinvocation,
					PROPERTY_SELECTION_ON_METHOD)
		}
	}

	@Check
	def void checkCollectionType(CollectionType ctype){
		val boundsCondition = !(ctype.multiplicity.upperbound.isIsWildcard) && 
			ctype.multiplicity.lowerbound > ctype.multiplicity.upperbound.value
		val boundsConsistentWithCollection = ctype.collection == null ||
			(ctype.multiplicity.upperbound.isIsWildcard || 
				ctype.multiplicity.upperbound.value > 1)
		if(boundsCondition)
			error("Multiplicity bounds not correct", 
				CoreALPackage::eINSTANCE.collectionType_Multiplicity,
				MULTIPLICITY_INCONSISTENCY)
		if(!boundsConsistentWithCollection)
			error("Multiplicity not consistent with collection declaration",
				CoreALPackage::eINSTANCE.collectionType_Multiplicity,
				MULTIPLICITY_INCONSISTENCY)	
	}

	@Check
	def void checkOppositeReferences(Reference ref){
		val ctype = ref.collectionType
		if(ref.opposite != null){
			val opp = ref.opposite
			if(opp.opposite == null || opp.opposite != ref)
				error("Reference '" + ref.name + "' is not declared as opposite of '" 
					+ opp.name + "' in '" + ctype.type.typeOf.name + "'",
					CoreALPackage::eINSTANCE.reference_Opposite,
					OPPOSITE_INCONSISTENCY)
			if(ref.isIsContainment && opp.isIsContainment)
				error("The containment reference '" + ref.name + "' cannot have a containment as opposite",
					CoreALPackage::eINSTANCE.reference_Opposite,
					OPPOSITE_INCONSISTENCY)
			if(opp.isIsContainment && ctype.multiplicity != null && (ctype.multiplicity.lowerbound != 0 || ctype.multiplicity.upperbound.value != 1 || ctype.multiplicity.upperbound.isWildcard))
				error("Multiplicity should be [0..1] since '" + ref.name + 
					"' is the opposite of the containment reference '" + opp.name + "' in '" + opp.collectionType.type.typeOf.name + "'",
					CoreALPackage::eINSTANCE.structuralProperty_CollectionType,
					OPPOSITE_INCONSISTENCY)
		}
	}

	@Check
	def void checkSuperAsReceiverOnly(SuperExpression e){
		if(e.eContainingFeature != CoreALPackage::eINSTANCE.memberSelection_Receiver)
			error("'super' can only be used as a selection receiver (e.g., super.toString())",
				null, WRONG_SUPER_USAGE)
	}

	@Check
	def void checkSelfAsReceiverOnly(SelfExpression e){
		if(e.eContainingFeature != CoreALPackage::eINSTANCE.memberSelection_Receiver)
			error("'self' can only be used as a selection receiver (e.g., super.toString())",
				null, WRONG_SELF_USAGE)
	}
	
	@Check
	def void checkAbstractOperationInAbstractClass(Operation op){
		if(op.isIsAbstract && op.body != null)
			error("Abstract operation '" + op.name + "' contains a body",
				CoreALPackage::eINSTANCE.operation_Body,
				INVALID_ABSTRACT_OPERATION)
		if(op.isIsAbstract && !op.containingClass.isIsAbstract)
			error("Abstract operation '" + op.name + 
				"' inside the non-abstract class '" + op.containingClass.name + "'",
				CoreALPackage::eINSTANCE.operation_IsAbstract,
				ABSTRACT_OP_INSIDE_NONABSTRACT_CLASS)	
	}
	
	@Check
	def void checkValidArgumentForCollectionOperation(MemberSelection sel){
		if(sel.coll != null && sel.coll instanceof AtCollectionFeature){
			if(sel.args == null)
				error("Collection operation 'at' should have one argument of type integer",
					CoreALPackage::eINSTANCE.memberSelection_Args,
					WRONG_TYPE)
			if(sel.args != null && sel.args.size > 1)
				error("Collection operation 'at' should have only one argument of type integer",
					CoreALPackage::eINSTANCE.memberSelection_Args,
					WRONG_TYPE)
			if(sel.args != null && sel.args.get(0).typeFor != CoreALTypeProvider.integerType)
				error("Collection operation 'at' should have an argument of type integer",
					CoreALPackage::eINSTANCE.memberSelection_Args,
					WRONG_TYPE)
		}
	}
	
	@Check
	def void checkCompatibleTypes(Expression exp) {
		val actualType   = exp.typeFor
		val expectedType = exp.expectedType
		if (expectedType == null || actualType == null)
			return; // nothing to check
		if (!actualType.isConformant(expectedType)) {
			error("Incompatible types. Expected '" + expectedType?.name
					+ "' but was '" + actualType?.name + "'", null,
					INCOMPATIBLE_TYPES);
		}
	}
	
	@Check
	def void checkCorrectReturnUse(ReturnStmt stmt){
		val returntype = stmt.containingOperation.type
		switch(returntype){
			VoidType:
				if(stmt.expression != null)
					error("Return statement should be empty within void return type operation '" + stmt.containingOperation.name + "'",
						CoreALPackage::eINSTANCE.returnStmt_Expression,
						WRONG_TYPE)
			CollectionType:
				if(stmt.expression == null)
					error("Return statement should not be empty within operation '" + stmt.containingOperation.name + "'",
						null,
						WRONG_TYPE)	
		}
	}
	
	@Check
	def void checkNoDeclarationOutsideOfOperationBlock(VariableDeclaration decl){
		if(decl.containingBlock instanceof ConditionalBlock)
			error("Variable declaration allowed only in operations' top-level block", 
				CoreALPackage::eINSTANCE.local_Name, 
				DECLARATION_WITHIN_BLOCK)
	}
	
	
	@Check
	def void checkCollectionLiteralWithSameType(CollectionLiteral lit){
		
	}
	
	
}
