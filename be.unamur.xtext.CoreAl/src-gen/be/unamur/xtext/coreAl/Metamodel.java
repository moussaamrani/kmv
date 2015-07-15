/**
 */
package be.unamur.xtext.coreAl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xtype.XImportSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metamodel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link be.unamur.xtext.coreAl.Metamodel#getName <em>Name</em>}</li>
 *   <li>{@link be.unamur.xtext.coreAl.Metamodel#getImports <em>Imports</em>}</li>
 *   <li>{@link be.unamur.xtext.coreAl.Metamodel#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see be.unamur.xtext.coreAl.CoreAlPackage#getMetamodel()
 * @model
 * @generated
 */
public interface Metamodel extends EObject
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
   * @see be.unamur.xtext.coreAl.CoreAlPackage#getMetamodel_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link be.unamur.xtext.coreAl.Metamodel#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference.
   * @see #setImports(XImportSection)
   * @see be.unamur.xtext.coreAl.CoreAlPackage#getMetamodel_Imports()
   * @model containment="true"
   * @generated
   */
  XImportSection getImports();

  /**
   * Sets the value of the '{@link be.unamur.xtext.coreAl.Metamodel#getImports <em>Imports</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Imports</em>' containment reference.
   * @see #getImports()
   * @generated
   */
  void setImports(XImportSection value);

  /**
   * Returns the value of the '<em><b>Types</b></em>' containment reference list.
   * The list contents are of type {@link be.unamur.xtext.coreAl.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Types</em>' containment reference list.
   * @see be.unamur.xtext.coreAl.CoreAlPackage#getMetamodel_Types()
   * @model containment="true"
   * @generated
   */
  EList<Type> getTypes();

} // Metamodel
