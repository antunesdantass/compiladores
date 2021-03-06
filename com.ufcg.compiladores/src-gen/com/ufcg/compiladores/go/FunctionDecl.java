/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.FunctionDecl#getFunctionName <em>Function Name</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.FunctionDecl#getSignature <em>Signature</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.FunctionDecl#getFunctionBody <em>Function Body</em>}</li>
 * </ul>
 *
 * @see com.ufcg.compiladores.go.GoPackage#getFunctionDecl()
 * @model
 * @generated
 */
public interface FunctionDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Function Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Name</em>' containment reference.
   * @see #setFunctionName(FunctionName)
   * @see com.ufcg.compiladores.go.GoPackage#getFunctionDecl_FunctionName()
   * @model containment="true"
   * @generated
   */
  FunctionName getFunctionName();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.FunctionDecl#getFunctionName <em>Function Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function Name</em>' containment reference.
   * @see #getFunctionName()
   * @generated
   */
  void setFunctionName(FunctionName value);

  /**
   * Returns the value of the '<em><b>Signature</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Signature</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Signature</em>' containment reference.
   * @see #setSignature(Signature)
   * @see com.ufcg.compiladores.go.GoPackage#getFunctionDecl_Signature()
   * @model containment="true"
   * @generated
   */
  Signature getSignature();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.FunctionDecl#getSignature <em>Signature</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Signature</em>' containment reference.
   * @see #getSignature()
   * @generated
   */
  void setSignature(Signature value);

  /**
   * Returns the value of the '<em><b>Function Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Function Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Function Body</em>' containment reference.
   * @see #setFunctionBody(FunctionBody)
   * @see com.ufcg.compiladores.go.GoPackage#getFunctionDecl_FunctionBody()
   * @model containment="true"
   * @generated
   */
  FunctionBody getFunctionBody();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.FunctionDecl#getFunctionBody <em>Function Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Function Body</em>' containment reference.
   * @see #getFunctionBody()
   * @generated
   */
  void setFunctionBody(FunctionBody value);

} // FunctionDecl
