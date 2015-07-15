/**
 */
package be.unamur.xtext.coreAl.impl;

import be.unamur.xtext.coreAl.CoreAlPackage;
import be.unamur.xtext.coreAl.ReferenceableType;
import be.unamur.xtext.coreAl.ReferenceableTypeReference;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Referenceable Type Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.unamur.xtext.coreAl.impl.ReferenceableTypeReferenceImpl#isCollection <em>Collection</em>}</li>
 *   <li>{@link be.unamur.xtext.coreAl.impl.ReferenceableTypeReferenceImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferenceableTypeReferenceImpl extends CollectionTypeImpl implements ReferenceableTypeReference
{
  /**
   * The default value of the '{@link #isCollection() <em>Collection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCollection()
   * @generated
   * @ordered
   */
  protected static final boolean COLLECTION_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isCollection() <em>Collection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isCollection()
   * @generated
   * @ordered
   */
  protected boolean collection = COLLECTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected ReferenceableType type;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReferenceableTypeReferenceImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CoreAlPackage.Literals.REFERENCEABLE_TYPE_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isCollection()
  {
    return collection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCollection(boolean newCollection)
  {
    boolean oldCollection = collection;
    collection = newCollection;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoreAlPackage.REFERENCEABLE_TYPE_REFERENCE__COLLECTION, oldCollection, collection));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceableType getType()
  {
    if (type != null && type.eIsProxy())
    {
      InternalEObject oldType = (InternalEObject)type;
      type = (ReferenceableType)eResolveProxy(oldType);
      if (type != oldType)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, CoreAlPackage.REFERENCEABLE_TYPE_REFERENCE__TYPE, oldType, type));
      }
    }
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceableType basicGetType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(ReferenceableType newType)
  {
    ReferenceableType oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoreAlPackage.REFERENCEABLE_TYPE_REFERENCE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CoreAlPackage.REFERENCEABLE_TYPE_REFERENCE__COLLECTION:
        return isCollection();
      case CoreAlPackage.REFERENCEABLE_TYPE_REFERENCE__TYPE:
        if (resolve) return getType();
        return basicGetType();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CoreAlPackage.REFERENCEABLE_TYPE_REFERENCE__COLLECTION:
        setCollection((Boolean)newValue);
        return;
      case CoreAlPackage.REFERENCEABLE_TYPE_REFERENCE__TYPE:
        setType((ReferenceableType)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CoreAlPackage.REFERENCEABLE_TYPE_REFERENCE__COLLECTION:
        setCollection(COLLECTION_EDEFAULT);
        return;
      case CoreAlPackage.REFERENCEABLE_TYPE_REFERENCE__TYPE:
        setType((ReferenceableType)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CoreAlPackage.REFERENCEABLE_TYPE_REFERENCE__COLLECTION:
        return collection != COLLECTION_EDEFAULT;
      case CoreAlPackage.REFERENCEABLE_TYPE_REFERENCE__TYPE:
        return type != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (collection: ");
    result.append(collection);
    result.append(')');
    return result.toString();
  }

} //ReferenceableTypeReferenceImpl
