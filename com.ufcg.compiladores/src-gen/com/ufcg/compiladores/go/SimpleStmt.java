/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.go;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Stmt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.SimpleStmt#getEmptyStmt <em>Empty Stmt</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.SimpleStmt#getExpressionStmt <em>Expression Stmt</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.SimpleStmt#getSendStmt <em>Send Stmt</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.SimpleStmt#getIncDecStmt <em>Inc Dec Stmt</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.SimpleStmt#getAssignment <em>Assignment</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.SimpleStmt#getShortVarDecl <em>Short Var Decl</em>}</li>
 * </ul>
 *
 * @see com.ufcg.compiladores.go.GoPackage#getSimpleStmt()
 * @model
 * @generated
 */
public interface SimpleStmt extends SwitchStmt
{
  /**
   * Returns the value of the '<em><b>Empty Stmt</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Empty Stmt</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Empty Stmt</em>' attribute.
   * @see #setEmptyStmt(String)
   * @see com.ufcg.compiladores.go.GoPackage#getSimpleStmt_EmptyStmt()
   * @model
   * @generated
   */
  String getEmptyStmt();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.SimpleStmt#getEmptyStmt <em>Empty Stmt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Empty Stmt</em>' attribute.
   * @see #getEmptyStmt()
   * @generated
   */
  void setEmptyStmt(String value);

  /**
   * Returns the value of the '<em><b>Expression Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression Stmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression Stmt</em>' containment reference.
   * @see #setExpressionStmt(ExpressionStmt)
   * @see com.ufcg.compiladores.go.GoPackage#getSimpleStmt_ExpressionStmt()
   * @model containment="true"
   * @generated
   */
  ExpressionStmt getExpressionStmt();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.SimpleStmt#getExpressionStmt <em>Expression Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression Stmt</em>' containment reference.
   * @see #getExpressionStmt()
   * @generated
   */
  void setExpressionStmt(ExpressionStmt value);

  /**
   * Returns the value of the '<em><b>Send Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Send Stmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Send Stmt</em>' containment reference.
   * @see #setSendStmt(SendStmt)
   * @see com.ufcg.compiladores.go.GoPackage#getSimpleStmt_SendStmt()
   * @model containment="true"
   * @generated
   */
  SendStmt getSendStmt();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.SimpleStmt#getSendStmt <em>Send Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Send Stmt</em>' containment reference.
   * @see #getSendStmt()
   * @generated
   */
  void setSendStmt(SendStmt value);

  /**
   * Returns the value of the '<em><b>Inc Dec Stmt</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inc Dec Stmt</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inc Dec Stmt</em>' containment reference.
   * @see #setIncDecStmt(IncDecStmt)
   * @see com.ufcg.compiladores.go.GoPackage#getSimpleStmt_IncDecStmt()
   * @model containment="true"
   * @generated
   */
  IncDecStmt getIncDecStmt();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.SimpleStmt#getIncDecStmt <em>Inc Dec Stmt</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inc Dec Stmt</em>' containment reference.
   * @see #getIncDecStmt()
   * @generated
   */
  void setIncDecStmt(IncDecStmt value);

  /**
   * Returns the value of the '<em><b>Assignment</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assignment</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assignment</em>' containment reference.
   * @see #setAssignment(Assignment)
   * @see com.ufcg.compiladores.go.GoPackage#getSimpleStmt_Assignment()
   * @model containment="true"
   * @generated
   */
  Assignment getAssignment();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.SimpleStmt#getAssignment <em>Assignment</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assignment</em>' containment reference.
   * @see #getAssignment()
   * @generated
   */
  void setAssignment(Assignment value);

  /**
   * Returns the value of the '<em><b>Short Var Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Short Var Decl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Short Var Decl</em>' containment reference.
   * @see #setShortVarDecl(ShortVarDecl)
   * @see com.ufcg.compiladores.go.GoPackage#getSimpleStmt_ShortVarDecl()
   * @model containment="true"
   * @generated
   */
  ShortVarDecl getShortVarDecl();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.SimpleStmt#getShortVarDecl <em>Short Var Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Short Var Decl</em>' containment reference.
   * @see #getShortVarDecl()
   * @generated
   */
  void setShortVarDecl(ShortVarDecl value);

} // SimpleStmt
