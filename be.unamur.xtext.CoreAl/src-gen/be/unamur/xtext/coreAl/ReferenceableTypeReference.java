/**
 */
package be.unamur.xtext.coreAl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Referenceable Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.unamur.xtext.coreAl.ReferenceableTypeReference#isCollection <em>Collection</em>}</li>
 *   <li>{@link be.unamur.xtext.coreAl.ReferenceableTypeReference#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see be.unamur.xtext.coreAl.CoreAlPackage#getReferenceableTypeReference()
 * @model
 * @generated
 */
public interface ReferenceableTypeReference extends CollectionType
{
  /**
   * Returns the value of the '<em><b>Collection</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Collection</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Collection</em>' attribute.
   * @see #setCollection(boolean)
   * @see be.unamur.xtext.coreAl.CoreAlPackage#getReferenceableTypeReference_Collection()
   * @model
   * @generated
   */
  boolean isCollection();

  /**
   * Sets the value of the '{@link be.unamur.xtext.coreAl.ReferenceableTypeReference#isCollection <em>Collection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Collection</em>' attribute.
   * @see #isCollection()
   * @generated
   */
  void setCollection(boolean value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(ReferenceableType)
   * @see be.unamur.xtext.coreAl.CoreAlPackage#getReferenceableTypeReference_Type()
   * @model
   * @generated
   */
  ReferenceableType getType();

  /**
   * Sets the value of the '{@link be.unamur.xtext.coreAl.ReferenceableTypeReference#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(ReferenceableType value);

} // ReferenceableTypeReference
