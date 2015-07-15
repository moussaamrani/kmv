/**
 */
package be.unamur.xtext.coreAl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Type Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.unamur.xtext.coreAl.PrimitiveTypeReference#getCollection <em>Collection</em>}</li>
 *   <li>{@link be.unamur.xtext.coreAl.PrimitiveTypeReference#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see be.unamur.xtext.coreAl.CoreAlPackage#getPrimitiveTypeReference()
 * @model
 * @generated
 */
public interface PrimitiveTypeReference extends CollectionType
{
  /**
   * Returns the value of the '<em><b>Collection</b></em>' attribute.
   * The literals are from the enumeration {@link be.unamur.xtext.coreAl.Collection}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Collection</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Collection</em>' attribute.
   * @see be.unamur.xtext.coreAl.Collection
   * @see #setCollection(Collection)
   * @see be.unamur.xtext.coreAl.CoreAlPackage#getPrimitiveTypeReference_Collection()
   * @model
   * @generated
   */
  Collection getCollection();

  /**
   * Sets the value of the '{@link be.unamur.xtext.coreAl.PrimitiveTypeReference#getCollection <em>Collection</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Collection</em>' attribute.
   * @see be.unamur.xtext.coreAl.Collection
   * @see #getCollection()
   * @generated
   */
  void setCollection(Collection value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link be.unamur.xtext.coreAl.PrimitiveType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see be.unamur.xtext.coreAl.PrimitiveType
   * @see #setType(PrimitiveType)
   * @see be.unamur.xtext.coreAl.CoreAlPackage#getPrimitiveTypeReference_Type()
   * @model
   * @generated
   */
  PrimitiveType getType();

  /**
   * Sets the value of the '{@link be.unamur.xtext.coreAl.PrimitiveTypeReference#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see be.unamur.xtext.coreAl.PrimitiveType
   * @see #getType()
   * @generated
   */
  void setType(PrimitiveType value);

} // PrimitiveTypeReference
