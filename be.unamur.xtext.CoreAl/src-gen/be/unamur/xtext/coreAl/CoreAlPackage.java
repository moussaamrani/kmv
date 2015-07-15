/**
 */
package be.unamur.xtext.coreAl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see be.unamur.xtext.coreAl.CoreAlFactory
 * @model kind="package"
 * @generated
 */
public interface CoreAlPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "coreAl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.unamur.be/xtext/CoreAl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "coreAl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CoreAlPackage eINSTANCE = be.unamur.xtext.coreAl.impl.CoreAlPackageImpl.init();

  /**
   * The meta object id for the '{@link be.unamur.xtext.coreAl.impl.MetamodelImpl <em>Metamodel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.unamur.xtext.coreAl.impl.MetamodelImpl
   * @see be.unamur.xtext.coreAl.impl.CoreAlPackageImpl#getMetamodel()
   * @generated
   */
  int METAMODEL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAMODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAMODEL__IMPORTS = 1;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAMODEL__TYPES = 2;

  /**
   * The number of structural features of the '<em>Metamodel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METAMODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link be.unamur.xtext.coreAl.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.unamur.xtext.coreAl.impl.TypeImpl
   * @see be.unamur.xtext.coreAl.impl.CoreAlPackageImpl#getType()
   * @generated
   */
  int TYPE = 1;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link be.unamur.xtext.coreAl.impl.EnumerationImpl <em>Enumeration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.unamur.xtext.coreAl.impl.EnumerationImpl
   * @see be.unamur.xtext.coreAl.impl.CoreAlPackageImpl#getEnumeration()
   * @generated
   */
  int ENUMERATION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION__NAME = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Literals</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION__LITERALS = TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Enumeration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENUMERATION_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link be.unamur.xtext.coreAl.impl.ClassImpl <em>Class</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.unamur.xtext.coreAl.impl.ClassImpl
   * @see be.unamur.xtext.coreAl.impl.CoreAlPackageImpl#getClass_()
   * @generated
   */
  int CLASS = 3;

  /**
   * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__IS_ABSTRACT = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__NAME = TYPE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Super</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__SUPER = TYPE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Features</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS__FEATURES = TYPE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Class</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLASS_FEATURE_COUNT = TYPE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link be.unamur.xtext.coreAl.impl.FeatureImpl <em>Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.unamur.xtext.coreAl.impl.FeatureImpl
   * @see be.unamur.xtext.coreAl.impl.CoreAlPackageImpl#getFeature()
   * @generated
   */
  int FEATURE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE__NAME = 0;

  /**
   * The number of structural features of the '<em>Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FEATURE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link be.unamur.xtext.coreAl.impl.StructuralPropertyImpl <em>Structural Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.unamur.xtext.coreAl.impl.StructuralPropertyImpl
   * @see be.unamur.xtext.coreAl.impl.CoreAlPackageImpl#getStructuralProperty()
   * @generated
   */
  int STRUCTURAL_PROPERTY = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURAL_PROPERTY__NAME = FEATURE__NAME;

  /**
   * The number of structural features of the '<em>Structural Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRUCTURAL_PROPERTY_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link be.unamur.xtext.coreAl.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.unamur.xtext.coreAl.impl.AttributeImpl
   * @see be.unamur.xtext.coreAl.impl.CoreAlPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = STRUCTURAL_PROPERTY__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = STRUCTURAL_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = STRUCTURAL_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link be.unamur.xtext.coreAl.impl.ReferenceImpl <em>Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.unamur.xtext.coreAl.impl.ReferenceImpl
   * @see be.unamur.xtext.coreAl.impl.CoreAlPackageImpl#getReference()
   * @generated
   */
  int REFERENCE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__NAME = STRUCTURAL_PROPERTY__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__TYPE = STRUCTURAL_PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Opposite</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__OPPOSITE = STRUCTURAL_PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_FEATURE_COUNT = STRUCTURAL_PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link be.unamur.xtext.coreAl.impl.OperationImpl <em>Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.unamur.xtext.coreAl.impl.OperationImpl
   * @see be.unamur.xtext.coreAl.impl.CoreAlPackageImpl#getOperation()
   * @generated
   */
  int OPERATION = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__NAME = FEATURE__NAME;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__PARAMETERS = FEATURE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__TYPE = FEATURE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__STATEMENTS = FEATURE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION__IS_ABSTRACT = FEATURE_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPERATION_FEATURE_COUNT = FEATURE_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link be.unamur.xtext.coreAl.impl.ParameterImpl <em>Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.unamur.xtext.coreAl.impl.ParameterImpl
   * @see be.unamur.xtext.coreAl.impl.CoreAlPackageImpl#getParameter()
   * @generated
   */
  int PARAMETER = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER__TYPE = 1;

  /**
   * The number of structural features of the '<em>Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link be.unamur.xtext.coreAl.impl.ReturnTypeImpl <em>Return Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.unamur.xtext.coreAl.impl.ReturnTypeImpl
   * @see be.unamur.xtext.coreAl.impl.CoreAlPackageImpl#getReturnType()
   * @generated
   */
  int RETURN_TYPE = 10;

  /**
   * The number of structural features of the '<em>Return Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURN_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link be.unamur.xtext.coreAl.impl.CollectionTypeImpl <em>Collection Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.unamur.xtext.coreAl.impl.CollectionTypeImpl
   * @see be.unamur.xtext.coreAl.impl.CoreAlPackageImpl#getCollectionType()
   * @generated
   */
  int COLLECTION_TYPE = 11;

  /**
   * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_TYPE__MULTIPLICITY = RETURN_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Collection Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_TYPE_FEATURE_COUNT = RETURN_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link be.unamur.xtext.coreAl.impl.ReferenceableTypeReferenceImpl <em>Referenceable Type Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.unamur.xtext.coreAl.impl.ReferenceableTypeReferenceImpl
   * @see be.unamur.xtext.coreAl.impl.CoreAlPackageImpl#getReferenceableTypeReference()
   * @generated
   */
  int REFERENCEABLE_TYPE_REFERENCE = 12;

  /**
   * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCEABLE_TYPE_REFERENCE__MULTIPLICITY = COLLECTION_TYPE__MULTIPLICITY;

  /**
   * The feature id for the '<em><b>Collection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCEABLE_TYPE_REFERENCE__COLLECTION = COLLECTION_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCEABLE_TYPE_REFERENCE__TYPE = COLLECTION_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Referenceable Type Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCEABLE_TYPE_REFERENCE_FEATURE_COUNT = COLLECTION_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link be.unamur.xtext.coreAl.impl.ReferenceableTypeImpl <em>Referenceable Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.unamur.xtext.coreAl.impl.ReferenceableTypeImpl
   * @see be.unamur.xtext.coreAl.impl.CoreAlPackageImpl#getReferenceableType()
   * @generated
   */
  int REFERENCEABLE_TYPE = 13;

  /**
   * The number of structural features of the '<em>Referenceable Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCEABLE_TYPE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link be.unamur.xtext.coreAl.impl.PrimitiveTypeReferenceImpl <em>Primitive Type Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.unamur.xtext.coreAl.impl.PrimitiveTypeReferenceImpl
   * @see be.unamur.xtext.coreAl.impl.CoreAlPackageImpl#getPrimitiveTypeReference()
   * @generated
   */
  int PRIMITIVE_TYPE_REFERENCE = 14;

  /**
   * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE_REFERENCE__MULTIPLICITY = COLLECTION_TYPE__MULTIPLICITY;

  /**
   * The feature id for the '<em><b>Collection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE_REFERENCE__COLLECTION = COLLECTION_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE_REFERENCE__TYPE = COLLECTION_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Primitive Type Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_TYPE_REFERENCE_FEATURE_COUNT = COLLECTION_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link be.unamur.xtext.coreAl.impl.MultiplicityImpl <em>Multiplicity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.unamur.xtext.coreAl.impl.MultiplicityImpl
   * @see be.unamur.xtext.coreAl.impl.CoreAlPackageImpl#getMultiplicity()
   * @generated
   */
  int MULTIPLICITY = 15;

  /**
   * The feature id for the '<em><b>Lowerbound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY__LOWERBOUND = 0;

  /**
   * The feature id for the '<em><b>Upperbound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY__UPPERBOUND = 1;

  /**
   * The number of structural features of the '<em>Multiplicity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MULTIPLICITY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link be.unamur.xtext.coreAl.PrimitiveType <em>Primitive Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.unamur.xtext.coreAl.PrimitiveType
   * @see be.unamur.xtext.coreAl.impl.CoreAlPackageImpl#getPrimitiveType()
   * @generated
   */
  int PRIMITIVE_TYPE = 16;

  /**
   * The meta object id for the '{@link be.unamur.xtext.coreAl.Collection <em>Collection</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see be.unamur.xtext.coreAl.Collection
   * @see be.unamur.xtext.coreAl.impl.CoreAlPackageImpl#getCollection()
   * @generated
   */
  int COLLECTION = 17;


  /**
   * Returns the meta object for class '{@link be.unamur.xtext.coreAl.Metamodel <em>Metamodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Metamodel</em>'.
   * @see be.unamur.xtext.coreAl.Metamodel
   * @generated
   */
  EClass getMetamodel();

  /**
   * Returns the meta object for the attribute '{@link be.unamur.xtext.coreAl.Metamodel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see be.unamur.xtext.coreAl.Metamodel#getName()
   * @see #getMetamodel()
   * @generated
   */
  EAttribute getMetamodel_Name();

  /**
   * Returns the meta object for the containment reference '{@link be.unamur.xtext.coreAl.Metamodel#getImports <em>Imports</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Imports</em>'.
   * @see be.unamur.xtext.coreAl.Metamodel#getImports()
   * @see #getMetamodel()
   * @generated
   */
  EReference getMetamodel_Imports();

  /**
   * Returns the meta object for the containment reference list '{@link be.unamur.xtext.coreAl.Metamodel#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see be.unamur.xtext.coreAl.Metamodel#getTypes()
   * @see #getMetamodel()
   * @generated
   */
  EReference getMetamodel_Types();

  /**
   * Returns the meta object for class '{@link be.unamur.xtext.coreAl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see be.unamur.xtext.coreAl.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for class '{@link be.unamur.xtext.coreAl.Enumeration <em>Enumeration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Enumeration</em>'.
   * @see be.unamur.xtext.coreAl.Enumeration
   * @generated
   */
  EClass getEnumeration();

  /**
   * Returns the meta object for the attribute '{@link be.unamur.xtext.coreAl.Enumeration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see be.unamur.xtext.coreAl.Enumeration#getName()
   * @see #getEnumeration()
   * @generated
   */
  EAttribute getEnumeration_Name();

  /**
   * Returns the meta object for the attribute list '{@link be.unamur.xtext.coreAl.Enumeration#getLiterals <em>Literals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Literals</em>'.
   * @see be.unamur.xtext.coreAl.Enumeration#getLiterals()
   * @see #getEnumeration()
   * @generated
   */
  EAttribute getEnumeration_Literals();

  /**
   * Returns the meta object for class '{@link be.unamur.xtext.coreAl.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Class</em>'.
   * @see be.unamur.xtext.coreAl.Class
   * @generated
   */
  EClass getClass_();

  /**
   * Returns the meta object for the attribute '{@link be.unamur.xtext.coreAl.Class#isIsAbstract <em>Is Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Abstract</em>'.
   * @see be.unamur.xtext.coreAl.Class#isIsAbstract()
   * @see #getClass_()
   * @generated
   */
  EAttribute getClass_IsAbstract();

  /**
   * Returns the meta object for the attribute '{@link be.unamur.xtext.coreAl.Class#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see be.unamur.xtext.coreAl.Class#getName()
   * @see #getClass_()
   * @generated
   */
  EAttribute getClass_Name();

  /**
   * Returns the meta object for the reference '{@link be.unamur.xtext.coreAl.Class#getSuper <em>Super</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Super</em>'.
   * @see be.unamur.xtext.coreAl.Class#getSuper()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Super();

  /**
   * Returns the meta object for the containment reference list '{@link be.unamur.xtext.coreAl.Class#getFeatures <em>Features</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Features</em>'.
   * @see be.unamur.xtext.coreAl.Class#getFeatures()
   * @see #getClass_()
   * @generated
   */
  EReference getClass_Features();

  /**
   * Returns the meta object for class '{@link be.unamur.xtext.coreAl.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Feature</em>'.
   * @see be.unamur.xtext.coreAl.Feature
   * @generated
   */
  EClass getFeature();

  /**
   * Returns the meta object for the attribute '{@link be.unamur.xtext.coreAl.Feature#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see be.unamur.xtext.coreAl.Feature#getName()
   * @see #getFeature()
   * @generated
   */
  EAttribute getFeature_Name();

  /**
   * Returns the meta object for class '{@link be.unamur.xtext.coreAl.StructuralProperty <em>Structural Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Structural Property</em>'.
   * @see be.unamur.xtext.coreAl.StructuralProperty
   * @generated
   */
  EClass getStructuralProperty();

  /**
   * Returns the meta object for class '{@link be.unamur.xtext.coreAl.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see be.unamur.xtext.coreAl.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the containment reference '{@link be.unamur.xtext.coreAl.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see be.unamur.xtext.coreAl.Attribute#getType()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Type();

  /**
   * Returns the meta object for class '{@link be.unamur.xtext.coreAl.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference</em>'.
   * @see be.unamur.xtext.coreAl.Reference
   * @generated
   */
  EClass getReference();

  /**
   * Returns the meta object for the containment reference '{@link be.unamur.xtext.coreAl.Reference#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see be.unamur.xtext.coreAl.Reference#getType()
   * @see #getReference()
   * @generated
   */
  EReference getReference_Type();

  /**
   * Returns the meta object for the reference '{@link be.unamur.xtext.coreAl.Reference#getOpposite <em>Opposite</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Opposite</em>'.
   * @see be.unamur.xtext.coreAl.Reference#getOpposite()
   * @see #getReference()
   * @generated
   */
  EReference getReference_Opposite();

  /**
   * Returns the meta object for class '{@link be.unamur.xtext.coreAl.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Operation</em>'.
   * @see be.unamur.xtext.coreAl.Operation
   * @generated
   */
  EClass getOperation();

  /**
   * Returns the meta object for the containment reference list '{@link be.unamur.xtext.coreAl.Operation#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see be.unamur.xtext.coreAl.Operation#getParameters()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link be.unamur.xtext.coreAl.Operation#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see be.unamur.xtext.coreAl.Operation#getType()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Type();

  /**
   * Returns the meta object for the containment reference list '{@link be.unamur.xtext.coreAl.Operation#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see be.unamur.xtext.coreAl.Operation#getStatements()
   * @see #getOperation()
   * @generated
   */
  EReference getOperation_Statements();

  /**
   * Returns the meta object for the attribute '{@link be.unamur.xtext.coreAl.Operation#isIsAbstract <em>Is Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Abstract</em>'.
   * @see be.unamur.xtext.coreAl.Operation#isIsAbstract()
   * @see #getOperation()
   * @generated
   */
  EAttribute getOperation_IsAbstract();

  /**
   * Returns the meta object for class '{@link be.unamur.xtext.coreAl.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter</em>'.
   * @see be.unamur.xtext.coreAl.Parameter
   * @generated
   */
  EClass getParameter();

  /**
   * Returns the meta object for the attribute '{@link be.unamur.xtext.coreAl.Parameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see be.unamur.xtext.coreAl.Parameter#getName()
   * @see #getParameter()
   * @generated
   */
  EAttribute getParameter_Name();

  /**
   * Returns the meta object for the containment reference '{@link be.unamur.xtext.coreAl.Parameter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see be.unamur.xtext.coreAl.Parameter#getType()
   * @see #getParameter()
   * @generated
   */
  EReference getParameter_Type();

  /**
   * Returns the meta object for class '{@link be.unamur.xtext.coreAl.ReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Return Type</em>'.
   * @see be.unamur.xtext.coreAl.ReturnType
   * @generated
   */
  EClass getReturnType();

  /**
   * Returns the meta object for class '{@link be.unamur.xtext.coreAl.CollectionType <em>Collection Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collection Type</em>'.
   * @see be.unamur.xtext.coreAl.CollectionType
   * @generated
   */
  EClass getCollectionType();

  /**
   * Returns the meta object for the attribute '{@link be.unamur.xtext.coreAl.CollectionType#isMultiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multiplicity</em>'.
   * @see be.unamur.xtext.coreAl.CollectionType#isMultiplicity()
   * @see #getCollectionType()
   * @generated
   */
  EAttribute getCollectionType_Multiplicity();

  /**
   * Returns the meta object for class '{@link be.unamur.xtext.coreAl.ReferenceableTypeReference <em>Referenceable Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Referenceable Type Reference</em>'.
   * @see be.unamur.xtext.coreAl.ReferenceableTypeReference
   * @generated
   */
  EClass getReferenceableTypeReference();

  /**
   * Returns the meta object for the attribute '{@link be.unamur.xtext.coreAl.ReferenceableTypeReference#isCollection <em>Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Collection</em>'.
   * @see be.unamur.xtext.coreAl.ReferenceableTypeReference#isCollection()
   * @see #getReferenceableTypeReference()
   * @generated
   */
  EAttribute getReferenceableTypeReference_Collection();

  /**
   * Returns the meta object for the reference '{@link be.unamur.xtext.coreAl.ReferenceableTypeReference#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see be.unamur.xtext.coreAl.ReferenceableTypeReference#getType()
   * @see #getReferenceableTypeReference()
   * @generated
   */
  EReference getReferenceableTypeReference_Type();

  /**
   * Returns the meta object for class '{@link be.unamur.xtext.coreAl.ReferenceableType <em>Referenceable Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Referenceable Type</em>'.
   * @see be.unamur.xtext.coreAl.ReferenceableType
   * @generated
   */
  EClass getReferenceableType();

  /**
   * Returns the meta object for class '{@link be.unamur.xtext.coreAl.PrimitiveTypeReference <em>Primitive Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive Type Reference</em>'.
   * @see be.unamur.xtext.coreAl.PrimitiveTypeReference
   * @generated
   */
  EClass getPrimitiveTypeReference();

  /**
   * Returns the meta object for the attribute '{@link be.unamur.xtext.coreAl.PrimitiveTypeReference#getCollection <em>Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Collection</em>'.
   * @see be.unamur.xtext.coreAl.PrimitiveTypeReference#getCollection()
   * @see #getPrimitiveTypeReference()
   * @generated
   */
  EAttribute getPrimitiveTypeReference_Collection();

  /**
   * Returns the meta object for the attribute '{@link be.unamur.xtext.coreAl.PrimitiveTypeReference#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see be.unamur.xtext.coreAl.PrimitiveTypeReference#getType()
   * @see #getPrimitiveTypeReference()
   * @generated
   */
  EAttribute getPrimitiveTypeReference_Type();

  /**
   * Returns the meta object for class '{@link be.unamur.xtext.coreAl.Multiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Multiplicity</em>'.
   * @see be.unamur.xtext.coreAl.Multiplicity
   * @generated
   */
  EClass getMultiplicity();

  /**
   * Returns the meta object for the attribute '{@link be.unamur.xtext.coreAl.Multiplicity#getLowerbound <em>Lowerbound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lowerbound</em>'.
   * @see be.unamur.xtext.coreAl.Multiplicity#getLowerbound()
   * @see #getMultiplicity()
   * @generated
   */
  EAttribute getMultiplicity_Lowerbound();

  /**
   * Returns the meta object for the attribute '{@link be.unamur.xtext.coreAl.Multiplicity#getUpperbound <em>Upperbound</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Upperbound</em>'.
   * @see be.unamur.xtext.coreAl.Multiplicity#getUpperbound()
   * @see #getMultiplicity()
   * @generated
   */
  EAttribute getMultiplicity_Upperbound();

  /**
   * Returns the meta object for enum '{@link be.unamur.xtext.coreAl.PrimitiveType <em>Primitive Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Primitive Type</em>'.
   * @see be.unamur.xtext.coreAl.PrimitiveType
   * @generated
   */
  EEnum getPrimitiveType();

  /**
   * Returns the meta object for enum '{@link be.unamur.xtext.coreAl.Collection <em>Collection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Collection</em>'.
   * @see be.unamur.xtext.coreAl.Collection
   * @generated
   */
  EEnum getCollection();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CoreAlFactory getCoreAlFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link be.unamur.xtext.coreAl.impl.MetamodelImpl <em>Metamodel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.unamur.xtext.coreAl.impl.MetamodelImpl
     * @see be.unamur.xtext.coreAl.impl.CoreAlPackageImpl#getMetamodel()
     * @generated
     */
    EClass METAMODEL = eINSTANCE.getMetamodel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute METAMODEL__NAME = eINSTANCE.getMetamodel_Name();

    /**
     * The meta object literal for the '<em><b>Imports</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METAMODEL__IMPORTS = eINSTANCE.getMetamodel_Imports();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METAMODEL__TYPES = eINSTANCE.getMetamodel_Types();

    /**
     * The meta object literal for the '{@link be.unamur.xtext.coreAl.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.unamur.xtext.coreAl.impl.TypeImpl
     * @see be.unamur.xtext.coreAl.impl.CoreAlPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '{@link be.unamur.xtext.coreAl.impl.EnumerationImpl <em>Enumeration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.unamur.xtext.coreAl.impl.EnumerationImpl
     * @see be.unamur.xtext.coreAl.impl.CoreAlPackageImpl#getEnumeration()
     * @generated
     */
    EClass ENUMERATION = eINSTANCE.getEnumeration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUMERATION__NAME = eINSTANCE.getEnumeration_Name();

    /**
     * The meta object literal for the '<em><b>Literals</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENUMERATION__LITERALS = eINSTANCE.getEnumeration_Literals();

    /**
     * The meta object literal for the '{@link be.unamur.xtext.coreAl.impl.ClassImpl <em>Class</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.unamur.xtext.coreAl.impl.ClassImpl
     * @see be.unamur.xtext.coreAl.impl.CoreAlPackageImpl#getClass_()
     * @generated
     */
    EClass CLASS = eINSTANCE.getClass_();

    /**
     * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS__IS_ABSTRACT = eINSTANCE.getClass_IsAbstract();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLASS__NAME = eINSTANCE.getClass_Name();

    /**
     * The meta object literal for the '<em><b>Super</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__SUPER = eINSTANCE.getClass_Super();

    /**
     * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CLASS__FEATURES = eINSTANCE.getClass_Features();

    /**
     * The meta object literal for the '{@link be.unamur.xtext.coreAl.impl.FeatureImpl <em>Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.unamur.xtext.coreAl.impl.FeatureImpl
     * @see be.unamur.xtext.coreAl.impl.CoreAlPackageImpl#getFeature()
     * @generated
     */
    EClass FEATURE = eINSTANCE.getFeature();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FEATURE__NAME = eINSTANCE.getFeature_Name();

    /**
     * The meta object literal for the '{@link be.unamur.xtext.coreAl.impl.StructuralPropertyImpl <em>Structural Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.unamur.xtext.coreAl.impl.StructuralPropertyImpl
     * @see be.unamur.xtext.coreAl.impl.CoreAlPackageImpl#getStructuralProperty()
     * @generated
     */
    EClass STRUCTURAL_PROPERTY = eINSTANCE.getStructuralProperty();

    /**
     * The meta object literal for the '{@link be.unamur.xtext.coreAl.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.unamur.xtext.coreAl.impl.AttributeImpl
     * @see be.unamur.xtext.coreAl.impl.CoreAlPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

    /**
     * The meta object literal for the '{@link be.unamur.xtext.coreAl.impl.ReferenceImpl <em>Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.unamur.xtext.coreAl.impl.ReferenceImpl
     * @see be.unamur.xtext.coreAl.impl.CoreAlPackageImpl#getReference()
     * @generated
     */
    EClass REFERENCE = eINSTANCE.getReference();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE__TYPE = eINSTANCE.getReference_Type();

    /**
     * The meta object literal for the '<em><b>Opposite</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE__OPPOSITE = eINSTANCE.getReference_Opposite();

    /**
     * The meta object literal for the '{@link be.unamur.xtext.coreAl.impl.OperationImpl <em>Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.unamur.xtext.coreAl.impl.OperationImpl
     * @see be.unamur.xtext.coreAl.impl.CoreAlPackageImpl#getOperation()
     * @generated
     */
    EClass OPERATION = eINSTANCE.getOperation();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__PARAMETERS = eINSTANCE.getOperation_Parameters();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__TYPE = eINSTANCE.getOperation_Type();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OPERATION__STATEMENTS = eINSTANCE.getOperation_Statements();

    /**
     * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPERATION__IS_ABSTRACT = eINSTANCE.getOperation_IsAbstract();

    /**
     * The meta object literal for the '{@link be.unamur.xtext.coreAl.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.unamur.xtext.coreAl.impl.ParameterImpl
     * @see be.unamur.xtext.coreAl.impl.CoreAlPackageImpl#getParameter()
     * @generated
     */
    EClass PARAMETER = eINSTANCE.getParameter();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARAMETER__TYPE = eINSTANCE.getParameter_Type();

    /**
     * The meta object literal for the '{@link be.unamur.xtext.coreAl.impl.ReturnTypeImpl <em>Return Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.unamur.xtext.coreAl.impl.ReturnTypeImpl
     * @see be.unamur.xtext.coreAl.impl.CoreAlPackageImpl#getReturnType()
     * @generated
     */
    EClass RETURN_TYPE = eINSTANCE.getReturnType();

    /**
     * The meta object literal for the '{@link be.unamur.xtext.coreAl.impl.CollectionTypeImpl <em>Collection Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.unamur.xtext.coreAl.impl.CollectionTypeImpl
     * @see be.unamur.xtext.coreAl.impl.CoreAlPackageImpl#getCollectionType()
     * @generated
     */
    EClass COLLECTION_TYPE = eINSTANCE.getCollectionType();

    /**
     * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLLECTION_TYPE__MULTIPLICITY = eINSTANCE.getCollectionType_Multiplicity();

    /**
     * The meta object literal for the '{@link be.unamur.xtext.coreAl.impl.ReferenceableTypeReferenceImpl <em>Referenceable Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.unamur.xtext.coreAl.impl.ReferenceableTypeReferenceImpl
     * @see be.unamur.xtext.coreAl.impl.CoreAlPackageImpl#getReferenceableTypeReference()
     * @generated
     */
    EClass REFERENCEABLE_TYPE_REFERENCE = eINSTANCE.getReferenceableTypeReference();

    /**
     * The meta object literal for the '<em><b>Collection</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCEABLE_TYPE_REFERENCE__COLLECTION = eINSTANCE.getReferenceableTypeReference_Collection();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCEABLE_TYPE_REFERENCE__TYPE = eINSTANCE.getReferenceableTypeReference_Type();

    /**
     * The meta object literal for the '{@link be.unamur.xtext.coreAl.impl.ReferenceableTypeImpl <em>Referenceable Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.unamur.xtext.coreAl.impl.ReferenceableTypeImpl
     * @see be.unamur.xtext.coreAl.impl.CoreAlPackageImpl#getReferenceableType()
     * @generated
     */
    EClass REFERENCEABLE_TYPE = eINSTANCE.getReferenceableType();

    /**
     * The meta object literal for the '{@link be.unamur.xtext.coreAl.impl.PrimitiveTypeReferenceImpl <em>Primitive Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.unamur.xtext.coreAl.impl.PrimitiveTypeReferenceImpl
     * @see be.unamur.xtext.coreAl.impl.CoreAlPackageImpl#getPrimitiveTypeReference()
     * @generated
     */
    EClass PRIMITIVE_TYPE_REFERENCE = eINSTANCE.getPrimitiveTypeReference();

    /**
     * The meta object literal for the '<em><b>Collection</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMITIVE_TYPE_REFERENCE__COLLECTION = eINSTANCE.getPrimitiveTypeReference_Collection();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMITIVE_TYPE_REFERENCE__TYPE = eINSTANCE.getPrimitiveTypeReference_Type();

    /**
     * The meta object literal for the '{@link be.unamur.xtext.coreAl.impl.MultiplicityImpl <em>Multiplicity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.unamur.xtext.coreAl.impl.MultiplicityImpl
     * @see be.unamur.xtext.coreAl.impl.CoreAlPackageImpl#getMultiplicity()
     * @generated
     */
    EClass MULTIPLICITY = eINSTANCE.getMultiplicity();

    /**
     * The meta object literal for the '<em><b>Lowerbound</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTIPLICITY__LOWERBOUND = eINSTANCE.getMultiplicity_Lowerbound();

    /**
     * The meta object literal for the '<em><b>Upperbound</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MULTIPLICITY__UPPERBOUND = eINSTANCE.getMultiplicity_Upperbound();

    /**
     * The meta object literal for the '{@link be.unamur.xtext.coreAl.PrimitiveType <em>Primitive Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.unamur.xtext.coreAl.PrimitiveType
     * @see be.unamur.xtext.coreAl.impl.CoreAlPackageImpl#getPrimitiveType()
     * @generated
     */
    EEnum PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

    /**
     * The meta object literal for the '{@link be.unamur.xtext.coreAl.Collection <em>Collection</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see be.unamur.xtext.coreAl.Collection
     * @see be.unamur.xtext.coreAl.impl.CoreAlPackageImpl#getCollection()
     * @generated
     */
    EEnum COLLECTION = eINSTANCE.getCollection();

  }

} //CoreAlPackage
