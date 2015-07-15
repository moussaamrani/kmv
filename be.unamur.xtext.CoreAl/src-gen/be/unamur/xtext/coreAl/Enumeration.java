/**
 */
package be.unamur.xtext.coreAl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.unamur.xtext.coreAl.Enumeration#getName <em>Name</em>}</li>
 *   <li>{@link be.unamur.xtext.coreAl.Enumeration#getLiterals <em>Literals</em>}</li>
 * </ul>
 *
 * @see be.unamur.xtext.coreAl.CoreAlPackage#getEnumeration()
 * @model
 * @generated
 */
public interface Enumeration extends Type, ReferenceableType
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see be.unamur.xtext.coreAl.CoreAlPackage#getEnumeration_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link be.unamur.xtext.coreAl.Enumeration#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Literals</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literals</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literals</em>' attribute list.
   * @see be.unamur.xtext.coreAl.CoreAlPackage#getEnumeration_Literals()
   * @model unique="false"
   * @generated
   */
  EList<String> getLiterals();

} // Enumeration
