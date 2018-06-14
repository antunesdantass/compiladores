/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.go;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Keyed Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.KeyedElement#getKeyedElement <em>Keyed Element</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.KeyedElement#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see com.ufcg.compiladores.go.GoPackage#getKeyedElement()
 * @model
 * @generated
 */
public interface KeyedElement extends ElementList
{
  /**
   * Returns the value of the '<em><b>Keyed Element</b></em>' containment reference list.
   * The list contents are of type {@link com.ufcg.compiladores.go.KeyedElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Keyed Element</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Keyed Element</em>' containment reference list.
   * @see com.ufcg.compiladores.go.GoPackage#getKeyedElement_KeyedElement()
   * @model containment="true"
   * @generated
   */
  EList<KeyedElement> getKeyedElement();

  /**
   * Returns the value of the '<em><b>Element</b></em>' containment reference list.
   * The list contents are of type {@link com.ufcg.compiladores.go.Element}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' containment reference list.
   * @see com.ufcg.compiladores.go.GoPackage#getKeyedElement_Element()
   * @model containment="true"
   * @generated
   */
  EList<Element> getElement();

} // KeyedElement
