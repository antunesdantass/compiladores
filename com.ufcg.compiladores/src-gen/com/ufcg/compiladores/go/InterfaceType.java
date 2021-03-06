/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.InterfaceType#getMethodSpec <em>Method Spec</em>}</li>
 * </ul>
 *
 * @see com.ufcg.compiladores.go.GoPackage#getInterfaceType()
 * @model
 * @generated
 */
public interface InterfaceType extends EObject
{
  /**
   * Returns the value of the '<em><b>Method Spec</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method Spec</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method Spec</em>' containment reference.
   * @see #setMethodSpec(MethodSpec)
   * @see com.ufcg.compiladores.go.GoPackage#getInterfaceType_MethodSpec()
   * @model containment="true"
   * @generated
   */
  MethodSpec getMethodSpec();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.InterfaceType#getMethodSpec <em>Method Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method Spec</em>' containment reference.
   * @see #getMethodSpec()
   * @generated
   */
  void setMethodSpec(MethodSpec value);

} // InterfaceType
