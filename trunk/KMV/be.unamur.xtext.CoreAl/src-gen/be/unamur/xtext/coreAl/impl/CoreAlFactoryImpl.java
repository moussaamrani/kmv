/**
 */
package be.unamur.xtext.coreAl.impl;

import be.unamur.xtext.coreAl.Attribute;
import be.unamur.xtext.coreAl.Collection;
import be.unamur.xtext.coreAl.CollectionType;
import be.unamur.xtext.coreAl.CoreAlFactory;
import be.unamur.xtext.coreAl.CoreAlPackage;
import be.unamur.xtext.coreAl.Enumeration;
import be.unamur.xtext.coreAl.Feature;
import be.unamur.xtext.coreAl.Metamodel;
import be.unamur.xtext.coreAl.Multiplicity;
import be.unamur.xtext.coreAl.Operation;
import be.unamur.xtext.coreAl.Parameter;
import be.unamur.xtext.coreAl.PrimitiveType;
import be.unamur.xtext.coreAl.PrimitiveTypeReference;
import be.unamur.xtext.coreAl.Reference;
import be.unamur.xtext.coreAl.ReferenceableType;
import be.unamur.xtext.coreAl.ReferenceableTypeReference;
import be.unamur.xtext.coreAl.ReturnType;
import be.unamur.xtext.coreAl.StructuralProperty;
import be.unamur.xtext.coreAl.Type;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CoreAlFactoryImpl extends EFactoryImpl implements CoreAlFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static CoreAlFactory init()
  {
    try
    {
      CoreAlFactory theCoreAlFactory = (CoreAlFactory)EPackage.Registry.INSTANCE.getEFactory(CoreAlPackage.eNS_URI);
      if (theCoreAlFactory != null)
      {
        return theCoreAlFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new CoreAlFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CoreAlFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case CoreAlPackage.METAMODEL: return createMetamodel();
      case CoreAlPackage.TYPE: return createType();
      case CoreAlPackage.ENUMERATION: return createEnumeration();
      case CoreAlPackage.CLASS: return createClass();
      case CoreAlPackage.FEATURE: return createFeature();
      case CoreAlPackage.STRUCTURAL_PROPERTY: return createStructuralProperty();
      case CoreAlPackage.ATTRIBUTE: return createAttribute();
      case CoreAlPackage.REFERENCE: return createReference();
      case CoreAlPackage.OPERATION: return createOperation();
      case CoreAlPackage.PARAMETER: return createParameter();
      case CoreAlPackage.RETURN_TYPE: return createReturnType();
      case CoreAlPackage.COLLECTION_TYPE: return createCollectionType();
      case CoreAlPackage.REFERENCEABLE_TYPE_REFERENCE: return createReferenceableTypeReference();
      case CoreAlPackage.REFERENCEABLE_TYPE: return createReferenceableType();
      case CoreAlPackage.PRIMITIVE_TYPE_REFERENCE: return createPrimitiveTypeReference();
      case CoreAlPackage.MULTIPLICITY: return createMultiplicity();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case CoreAlPackage.PRIMITIVE_TYPE:
        return createPrimitiveTypeFromString(eDataType, initialValue);
      case CoreAlPackage.COLLECTION:
        return createCollectionFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case CoreAlPackage.PRIMITIVE_TYPE:
        return convertPrimitiveTypeToString(eDataType, instanceValue);
      case CoreAlPackage.COLLECTION:
        return convertCollectionToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Metamodel createMetamodel()
  {
    MetamodelImpl metamodel = new MetamodelImpl();
    return metamodel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Enumeration createEnumeration()
  {
    EnumerationImpl enumeration = new EnumerationImpl();
    return enumeration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public be.unamur.xtext.coreAl.Class createClass()
  {
    ClassImpl class_ = new ClassImpl();
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature createFeature()
  {
    FeatureImpl feature = new FeatureImpl();
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StructuralProperty createStructuralProperty()
  {
    StructuralPropertyImpl structuralProperty = new StructuralPropertyImpl();
    return structuralProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reference createReference()
  {
    ReferenceImpl reference = new ReferenceImpl();
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturnType createReturnType()
  {
    ReturnTypeImpl returnType = new ReturnTypeImpl();
    return returnType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CollectionType createCollectionType()
  {
    CollectionTypeImpl collectionType = new CollectionTypeImpl();
    return collectionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceableTypeReference createReferenceableTypeReference()
  {
    ReferenceableTypeReferenceImpl referenceableTypeReference = new ReferenceableTypeReferenceImpl();
    return referenceableTypeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceableType createReferenceableType()
  {
    ReferenceableTypeImpl referenceableType = new ReferenceableTypeImpl();
    return referenceableType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveTypeReference createPrimitiveTypeReference()
  {
    PrimitiveTypeReferenceImpl primitiveTypeReference = new PrimitiveTypeReferenceImpl();
    return primitiveTypeReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Multiplicity createMultiplicity()
  {
    MultiplicityImpl multiplicity = new MultiplicityImpl();
    return multiplicity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrimitiveType createPrimitiveTypeFromString(EDataType eDataType, String initialValue)
  {
    PrimitiveType result = PrimitiveType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertPrimitiveTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Collection createCollectionFromString(EDataType eDataType, String initialValue)
  {
    Collection result = Collection.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertCollectionToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CoreAlPackage getCoreAlPackage()
  {
    return (CoreAlPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static CoreAlPackage getPackage()
  {
    return CoreAlPackage.eINSTANCE;
  }

} //CoreAlFactoryImpl
