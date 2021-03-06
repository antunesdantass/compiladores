/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Keyed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.KeyedElement#getKey <em>Key</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.KeyedElement#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see com.ufcg.compiladores.go.GoPackage#getKeyedElement()
 * @model
 * @generated
 */
public interface KeyedElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Key</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Key</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key</em>' containment reference.
   * @see #setKey(Key)
   * @see com.ufcg.compiladores.go.GoPackage#getKeyedElement_Key()
   * @model containment="true"
   * @generated
   */
  Key getKey();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.KeyedElement#getKey <em>Key</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key</em>' containment reference.
   * @see #getKey()
   * @generated
   */
  void setKey(Key value);

  /**
   * Returns the value of the '<em><b>Element</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' containment reference.
   * @see #setElement(Element)
   * @see com.ufcg.compiladores.go.GoPackage#getKeyedElement_Element()
   * @model containment="true"
   * @generated
   */
  Element getElement();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.KeyedElement#getElement <em>Element</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' containment reference.
   * @see #getElement()
   * @generated
   */
  void setElement(Element value);

} // KeyedElement
