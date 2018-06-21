/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.go;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifier List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.IdentifierList#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 *
 * @see com.ufcg.compiladores.go.GoPackage#getIdentifierList()
 * @model
 * @generated
 */
public interface IdentifierList extends EObject
{
  /**
   * Returns the value of the '<em><b>Identifier</b></em>' containment reference list.
   * The list contents are of type {@link com.ufcg.compiladores.go.identifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier</em>' containment reference list.
   * @see com.ufcg.compiladores.go.GoPackage#getIdentifierList_Identifier()
   * @model containment="true"
   * @generated
   */
  EList<identifier> getIdentifier();

} // IdentifierList
