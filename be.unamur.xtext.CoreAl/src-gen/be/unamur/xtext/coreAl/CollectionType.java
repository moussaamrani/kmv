/**
 */
package be.unamur.xtext.coreAl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.unamur.xtext.coreAl.CollectionType#isMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 *
 * @see be.unamur.xtext.coreAl.CoreAlPackage#getCollectionType()
 * @model
 * @generated
 */
public interface CollectionType extends ReturnType
{
  /**
   * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multiplicity</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multiplicity</em>' attribute.
   * @see #setMultiplicity(boolean)
   * @see be.unamur.xtext.coreAl.CoreAlPackage#getCollectionType_Multiplicity()
   * @model
   * @generated
   */
  boolean isMultiplicity();

  /**
   * Sets the value of the '{@link be.unamur.xtext.coreAl.CollectionType#isMultiplicity <em>Multiplicity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multiplicity</em>' attribute.
   * @see #isMultiplicity()
   * @generated
   */
  void setMultiplicity(boolean value);

} // CollectionType
