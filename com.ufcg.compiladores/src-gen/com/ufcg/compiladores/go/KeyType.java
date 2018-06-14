/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.go;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Key Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.KeyType#getElementType <em>Element Type</em>}</li>
 * </ul>
 *
 * @see com.ufcg.compiladores.go.GoPackage#getKeyType()
 * @model
 * @generated
 */
public interface KeyType extends MapType
{
  /**
   * Returns the value of the '<em><b>Element Type</b></em>' containment reference list.
   * The list contents are of type {@link com.ufcg.compiladores.go.ElementType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element Type</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element Type</em>' containment reference list.
   * @see com.ufcg.compiladores.go.GoPackage#getKeyType_ElementType()
   * @model containment="true"
   * @generated
   */
  EList<ElementType> getElementType();

} // KeyType
