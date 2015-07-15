/**
 */
package be.unamur.xtext.coreAl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.unamur.xtext.coreAl.Reference#getType <em>Type</em>}</li>
 *   <li>{@link be.unamur.xtext.coreAl.Reference#getOpposite <em>Opposite</em>}</li>
 * </ul>
 *
 * @see be.unamur.xtext.coreAl.CoreAlPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends StructuralProperty
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
   * @see #setType(ReferenceableTypeReference)
   * @see be.unamur.xtext.coreAl.CoreAlPackage#getReference_Type()
   * @model containment="true"
   * @generated
   */
  ReferenceableTypeReference getType();

  /**
   * Sets the value of the '{@link be.unamur.xtext.coreAl.Reference#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(ReferenceableTypeReference value);

  /**
   * Returns the value of the '<em><b>Opposite</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Opposite</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Opposite</em>' reference.
   * @see #setOpposite(Reference)
   * @see be.unamur.xtext.coreAl.CoreAlPackage#getReference_Opposite()
   * @model
   * @generated
   */
  Reference getOpposite();

  /**
   * Sets the value of the '{@link be.unamur.xtext.coreAl.Reference#getOpposite <em>Opposite</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opposite</em>' reference.
   * @see #getOpposite()
   * @generated
   */
  void setOpposite(Reference value);

} // Reference
