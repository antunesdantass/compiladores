/**
 * generated by Xtext 2.13.0
 */
package com.ufcg.compiladores.go;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.LiteralType#getLiteralValue <em>Literal Value</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.LiteralType#getArrayType <em>Array Type</em>}</li>
 * </ul>
 *
 * @see com.ufcg.compiladores.go.GoPackage#getLiteralType()
 * @model
 * @generated
 */
public interface LiteralType extends CompositeLit
{
  /**
   * Returns the value of the '<em><b>Literal Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Literal Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Literal Value</em>' containment reference.
   * @see #setLiteralValue(LiteralValue)
   * @see com.ufcg.compiladores.go.GoPackage#getLiteralType_LiteralValue()
   * @model containment="true"
   * @generated
   */
  LiteralValue getLiteralValue();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.LiteralType#getLiteralValue <em>Literal Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Literal Value</em>' containment reference.
   * @see #getLiteralValue()
   * @generated
   */
  void setLiteralValue(LiteralValue value);

  /**
   * Returns the value of the '<em><b>Array Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Array Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Array Type</em>' containment reference.
   * @see #setArrayType(ArrayType)
   * @see com.ufcg.compiladores.go.GoPackage#getLiteralType_ArrayType()
   * @model containment="true"
   * @generated
   */
  ArrayType getArrayType();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.LiteralType#getArrayType <em>Array Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Array Type</em>' containment reference.
   * @see #getArrayType()
   * @generated
   */
  void setArrayType(ArrayType value);

} // LiteralType
