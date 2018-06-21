/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.go;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.StatementList#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see com.ufcg.compiladores.go.GoPackage#getStatementList()
 * @model
 * @generated
 */
public interface StatementList extends EObject
{
  /**
   * Returns the value of the '<em><b>Statement</b></em>' containment reference list.
   * The list contents are of type {@link com.ufcg.compiladores.go.Statement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement</em>' containment reference list.
   * @see com.ufcg.compiladores.go.GoPackage#getStatementList_Statement()
   * @model containment="true"
   * @generated
   */
  EList<Statement> getStatement();

} // StatementList
