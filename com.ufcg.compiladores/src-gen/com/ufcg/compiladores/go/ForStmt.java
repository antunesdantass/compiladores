/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>For Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.ForStmt#getCondition <em>Condition</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.ForStmt#getForClause <em>For Clause</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.ForStmt#getRangeClause <em>Range Clause</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.ForStmt#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @see com.ufcg.compiladores.go.GoPackage#getForStmt()
 * @model
 * @generated
 */
public interface ForStmt extends EObject
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(Condition)
   * @see com.ufcg.compiladores.go.GoPackage#getForStmt_Condition()
   * @model containment="true"
   * @generated
   */
  Condition getCondition();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.ForStmt#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Condition value);

  /**
   * Returns the value of the '<em><b>For Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>For Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>For Clause</em>' containment reference.
   * @see #setForClause(ForClause)
   * @see com.ufcg.compiladores.go.GoPackage#getForStmt_ForClause()
   * @model containment="true"
   * @generated
   */
  ForClause getForClause();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.ForStmt#getForClause <em>For Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>For Clause</em>' containment reference.
   * @see #getForClause()
   * @generated
   */
  void setForClause(ForClause value);

  /**
   * Returns the value of the '<em><b>Range Clause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Range Clause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Range Clause</em>' containment reference.
   * @see #setRangeClause(RangeClause)
   * @see com.ufcg.compiladores.go.GoPackage#getForStmt_RangeClause()
   * @model containment="true"
   * @generated
   */
  RangeClause getRangeClause();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.ForStmt#getRangeClause <em>Range Clause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Range Clause</em>' containment reference.
   * @see #getRangeClause()
   * @generated
   */
  void setRangeClause(RangeClause value);

  /**
   * Returns the value of the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block</em>' containment reference.
   * @see #setBlock(Block)
   * @see com.ufcg.compiladores.go.GoPackage#getForStmt_Block()
   * @model containment="true"
   * @generated
   */
  Block getBlock();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.ForStmt#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(Block value);

} // ForStmt
