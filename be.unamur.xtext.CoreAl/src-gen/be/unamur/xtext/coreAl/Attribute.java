/**
 */
package be.unamur.xtext.coreAl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.unamur.xtext.coreAl.Attribute#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see be.unamur.xtext.coreAl.CoreAlPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends StructuralProperty
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(CollectionType)
   * @see be.unamur.xtext.coreAl.CoreAlPackage#getAttribute_Type()
   * @model containment="true"
   * @generated
   */
  CollectionType getType();

  /**
   * Sets the value of the '{@link be.unamur.xtext.coreAl.Attribute#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(CollectionType value);

} // Attribute
