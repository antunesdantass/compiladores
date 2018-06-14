/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.go;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.ExpressionList#getExpressionList <em>Expression List</em>}</li>
 * </ul>
 *
 * @see com.ufcg.compiladores.go.GoPackage#getExpressionList()
 * @model
 * @generated
 */
public interface ExpressionList extends VarSpec, ShortVarDecl, Arguments, Assignment, ExprSwitchCase, RangeClause, RecvStmt
{
  /**
   * Returns the value of the '<em><b>Expression List</b></em>' containment reference list.
   * The list contents are of type {@link com.ufcg.compiladores.go.ExpressionList}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression List</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression List</em>' containment reference list.
   * @see com.ufcg.compiladores.go.GoPackage#getExpressionList_ExpressionList()
   * @model containment="true"
   * @generated
   */
  EList<ExpressionList> getExpressionList();

} // ExpressionList
