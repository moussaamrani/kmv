/**
 */
package be.unamur.xtext.coreAl.util;

import be.unamur.xtext.coreAl.Attribute;
import be.unamur.xtext.coreAl.CollectionType;
import be.unamur.xtext.coreAl.CoreAlPackage;
import be.unamur.xtext.coreAl.Enumeration;
import be.unamur.xtext.coreAl.Feature;
import be.unamur.xtext.coreAl.Metamodel;
import be.unamur.xtext.coreAl.Multiplicity;
import be.unamur.xtext.coreAl.Operation;
import be.unamur.xtext.coreAl.Parameter;
import be.unamur.xtext.coreAl.PrimitiveTypeReference;
import be.unamur.xtext.coreAl.Reference;
import be.unamur.xtext.coreAl.ReferenceableType;
import be.unamur.xtext.coreAl.ReferenceableTypeReference;
import be.unamur.xtext.coreAl.ReturnType;
import be.unamur.xtext.coreAl.StructuralProperty;
import be.unamur.xtext.coreAl.Type;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see be.unamur.xtext.coreAl.CoreAlPackage
 * @generated
 */
public class CoreAlAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static CoreAlPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CoreAlAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = CoreAlPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CoreAlSwitch<Adapter> modelSwitch =
    new CoreAlSwitch<Adapter>()
    {
      @Override
      public Adapter caseMetamodel(Metamodel object)
      {
        return createMetamodelAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseEnumeration(Enumeration object)
      {
        return createEnumerationAdapter();
      }
      @Override
      public Adapter caseClass(be.unamur.xtext.coreAl.Class object)
      {
        return createClassAdapter();
      }
      @Override
      public Adapter caseFeature(Feature object)
      {
        return createFeatureAdapter();
      }
      @Override
      public Adapter caseStructuralProperty(StructuralProperty object)
      {
        return createStructuralPropertyAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseReference(Reference object)
      {
        return createReferenceAdapter();
      }
      @Override
      public Adapter caseOperation(Operation object)
      {
        return createOperationAdapter();
      }
      @Override
      public Adapter caseParameter(Parameter object)
      {
        return createParameterAdapter();
      }
      @Override
      public Adapter caseReturnType(ReturnType object)
      {
        return createReturnTypeAdapter();
      }
      @Override
      public Adapter caseCollectionType(CollectionType object)
      {
        return createCollectionTypeAdapter();
      }
      @Override
      public Adapter caseReferenceableTypeReference(ReferenceableTypeReference object)
      {
        return createReferenceableTypeReferenceAdapter();
      }
      @Override
      public Adapter caseReferenceableType(ReferenceableType object)
      {
        return createReferenceableTypeAdapter();
      }
      @Override
      public Adapter casePrimitiveTypeReference(PrimitiveTypeReference object)
      {
        return createPrimitiveTypeReferenceAdapter();
      }
      @Override
      public Adapter caseMultiplicity(Multiplicity object)
      {
        return createMultiplicityAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link be.unamur.xtext.coreAl.Metamodel <em>Metamodel</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see be.unamur.xtext.coreAl.Metamodel
   * @generated
   */
  public Adapter createMetamodelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link be.unamur.xtext.coreAl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see be.unamur.xtext.coreAl.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link be.unamur.xtext.coreAl.Enumeration <em>Enumeration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see be.unamur.xtext.coreAl.Enumeration
   * @generated
   */
  public Adapter createEnumerationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link be.unamur.xtext.coreAl.Class <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see be.unamur.xtext.coreAl.Class
   * @generated
   */
  public Adapter createClassAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link be.unamur.xtext.coreAl.Feature <em>Feature</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see be.unamur.xtext.coreAl.Feature
   * @generated
   */
  public Adapter createFeatureAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link be.unamur.xtext.coreAl.StructuralProperty <em>Structural Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see be.unamur.xtext.coreAl.StructuralProperty
   * @generated
   */
  public Adapter createStructuralPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link be.unamur.xtext.coreAl.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see be.unamur.xtext.coreAl.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link be.unamur.xtext.coreAl.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see be.unamur.xtext.coreAl.Reference
   * @generated
   */
  public Adapter createReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link be.unamur.xtext.coreAl.Operation <em>Operation</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see be.unamur.xtext.coreAl.Operation
   * @generated
   */
  public Adapter createOperationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link be.unamur.xtext.coreAl.Parameter <em>Parameter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see be.unamur.xtext.coreAl.Parameter
   * @generated
   */
  public Adapter createParameterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link be.unamur.xtext.coreAl.ReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see be.unamur.xtext.coreAl.ReturnType
   * @generated
   */
  public Adapter createReturnTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link be.unamur.xtext.coreAl.CollectionType <em>Collection Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see be.unamur.xtext.coreAl.CollectionType
   * @generated
   */
  public Adapter createCollectionTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link be.unamur.xtext.coreAl.ReferenceableTypeReference <em>Referenceable Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see be.unamur.xtext.coreAl.ReferenceableTypeReference
   * @generated
   */
  public Adapter createReferenceableTypeReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link be.unamur.xtext.coreAl.ReferenceableType <em>Referenceable Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see be.unamur.xtext.coreAl.ReferenceableType
   * @generated
   */
  public Adapter createReferenceableTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link be.unamur.xtext.coreAl.PrimitiveTypeReference <em>Primitive Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see be.unamur.xtext.coreAl.PrimitiveTypeReference
   * @generated
   */
  public Adapter createPrimitiveTypeReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link be.unamur.xtext.coreAl.Multiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see be.unamur.xtext.coreAl.Multiplicity
   * @generated
   */
  public Adapter createMultiplicityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //CoreAlAdapterFactory
