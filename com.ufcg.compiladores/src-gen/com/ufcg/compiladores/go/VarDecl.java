/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.VarDecl#getVarSpec <em>Var Spec</em>}</li>
 * </ul>
 *
 * @see com.ufcg.compiladores.go.GoPackage#getVarDecl()
 * @model
 * @generated
 */
public interface VarDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Var Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Var Spec</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var Spec</em>' containment reference.
   * @see #setVarSpec(VarSpec)
   * @see com.ufcg.compiladores.go.GoPackage#getVarDecl_VarSpec()
   * @model containment="true"
   * @generated
   */
  VarSpec getVarSpec();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.VarDecl#getVarSpec <em>Var Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var Spec</em>' containment reference.
   * @see #getVarSpec()
   * @generated
   */
  void setVarSpec(VarSpec value);

} // VarDecl
