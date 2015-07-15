/**
 */
package be.unamur.xtext.coreAl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.unamur.xtext.coreAl.Multiplicity#getLowerbound <em>Lowerbound</em>}</li>
 *   <li>{@link be.unamur.xtext.coreAl.Multiplicity#getUpperbound <em>Upperbound</em>}</li>
 * </ul>
 *
 * @see be.unamur.xtext.coreAl.CoreAlPackage#getMultiplicity()
 * @model
 * @generated
 */
public interface Multiplicity extends EObject
{
  /**
   * Returns the value of the '<em><b>Lowerbound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lowerbound</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lowerbound</em>' attribute.
   * @see #setLowerbound(int)
   * @see be.unamur.xtext.coreAl.CoreAlPackage#getMultiplicity_Lowerbound()
   * @model
   * @generated
   */
  int getLowerbound();

  /**
   * Sets the value of the '{@link be.unamur.xtext.coreAl.Multiplicity#getLowerbound <em>Lowerbound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lowerbound</em>' attribute.
   * @see #getLowerbound()
   * @generated
   */
  void setLowerbound(int value);

  /**
   * Returns the value of the '<em><b>Upperbound</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Upperbound</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Upperbound</em>' attribute.
   * @see #setUpperbound(String)
   * @see be.unamur.xtext.coreAl.CoreAlPackage#getMultiplicity_Upperbound()
   * @model
   * @generated
   */
  String getUpperbound();

  /**
   * Sets the value of the '{@link be.unamur.xtext.coreAl.Multiplicity#getUpperbound <em>Upperbound</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Upperbound</em>' attribute.
   * @see #getUpperbound()
   * @generated
   */
  void setUpperbound(String value);

} // Multiplicity
