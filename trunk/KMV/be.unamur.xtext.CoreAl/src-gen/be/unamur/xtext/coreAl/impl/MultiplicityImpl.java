/**
 */
package be.unamur.xtext.coreAl.impl;

import be.unamur.xtext.coreAl.CoreAlPackage;
import be.unamur.xtext.coreAl.Multiplicity;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiplicity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link be.unamur.xtext.coreAl.impl.MultiplicityImpl#getLowerbound <em>Lowerbound</em>}</li>
 *   <li>{@link be.unamur.xtext.coreAl.impl.MultiplicityImpl#getUpperbound <em>Upperbound</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiplicityImpl extends MinimalEObjectImpl.Container implements Multiplicity
{
  /**
   * The default value of the '{@link #getLowerbound() <em>Lowerbound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLowerbound()
   * @generated
   * @ordered
   */
  protected static final int LOWERBOUND_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getLowerbound() <em>Lowerbound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLowerbound()
   * @generated
   * @ordered
   */
  protected int lowerbound = LOWERBOUND_EDEFAULT;

  /**
   * The default value of the '{@link #getUpperbound() <em>Upperbound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpperbound()
   * @generated
   * @ordered
   */
  protected static final String UPPERBOUND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUpperbound() <em>Upperbound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpperbound()
   * @generated
   * @ordered
   */
  protected String upperbound = UPPERBOUND_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MultiplicityImpl()
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
    return CoreAlPackage.Literals.MULTIPLICITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getLowerbound()
  {
    return lowerbound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLowerbound(int newLowerbound)
  {
    int oldLowerbound = lowerbound;
    lowerbound = newLowerbound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoreAlPackage.MULTIPLICITY__LOWERBOUND, oldLowerbound, lowerbound));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUpperbound()
  {
    return upperbound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUpperbound(String newUpperbound)
  {
    String oldUpperbound = upperbound;
    upperbound = newUpperbound;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, CoreAlPackage.MULTIPLICITY__UPPERBOUND, oldUpperbound, upperbound));
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
      case CoreAlPackage.MULTIPLICITY__LOWERBOUND:
        return getLowerbound();
      case CoreAlPackage.MULTIPLICITY__UPPERBOUND:
        return getUpperbound();
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
      case CoreAlPackage.MULTIPLICITY__LOWERBOUND:
        setLowerbound((Integer)newValue);
        return;
      case CoreAlPackage.MULTIPLICITY__UPPERBOUND:
        setUpperbound((String)newValue);
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
      case CoreAlPackage.MULTIPLICITY__LOWERBOUND:
        setLowerbound(LOWERBOUND_EDEFAULT);
        return;
      case CoreAlPackage.MULTIPLICITY__UPPERBOUND:
        setUpperbound(UPPERBOUND_EDEFAULT);
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
      case CoreAlPackage.MULTIPLICITY__LOWERBOUND:
        return lowerbound != LOWERBOUND_EDEFAULT;
      case CoreAlPackage.MULTIPLICITY__UPPERBOUND:
        return UPPERBOUND_EDEFAULT == null ? upperbound != null : !UPPERBOUND_EDEFAULT.equals(upperbound);
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
    result.append(" (lowerbound: ");
    result.append(lowerbound);
    result.append(", upperbound: ");
    result.append(upperbound);
    result.append(')');
    return result.toString();
  }

} //MultiplicityImpl
