/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>string lit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.string_lit#getRaw_string_lit <em>Raw string lit</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.string_lit#getInterpreted_string_lit <em>Interpreted string lit</em>}</li>
 * </ul>
 *
 * @see com.ufcg.compiladores.go.GoPackage#getstring_lit()
 * @model
 * @generated
 */
public interface string_lit extends EObject
{
  /**
   * Returns the value of the '<em><b>Raw string lit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Raw string lit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Raw string lit</em>' attribute.
   * @see #setRaw_string_lit(String)
   * @see com.ufcg.compiladores.go.GoPackage#getstring_lit_Raw_string_lit()
   * @model
   * @generated
   */
  String getRaw_string_lit();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.string_lit#getRaw_string_lit <em>Raw string lit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Raw string lit</em>' attribute.
   * @see #getRaw_string_lit()
   * @generated
   */
  void setRaw_string_lit(String value);

  /**
   * Returns the value of the '<em><b>Interpreted string lit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interpreted string lit</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interpreted string lit</em>' attribute.
   * @see #setInterpreted_string_lit(String)
   * @see com.ufcg.compiladores.go.GoPackage#getstring_lit_Interpreted_string_lit()
   * @model
   * @generated
   */
  String getInterpreted_string_lit();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.string_lit#getInterpreted_string_lit <em>Interpreted string lit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interpreted string lit</em>' attribute.
   * @see #getInterpreted_string_lit()
   * @generated
   */
  void setInterpreted_string_lit(String value);

} // string_lit
