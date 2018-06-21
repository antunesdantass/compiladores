/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Name Linha</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.TypeNameLinha#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.TypeNameLinha#getTypeNameLinha <em>Type Name Linha</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.TypeNameLinha#getQualifiedIdent <em>Qualified Ident</em>}</li>
 * </ul>
 *
 * @see com.ufcg.compiladores.go.GoPackage#getTypeNameLinha()
 * @model
 * @generated
 */
public interface TypeNameLinha extends EObject
{
  /**
   * Returns the value of the '<em><b>Identifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier</em>' containment reference.
   * @see #setIdentifier(identifier)
   * @see com.ufcg.compiladores.go.GoPackage#getTypeNameLinha_Identifier()
   * @model containment="true"
   * @generated
   */
  identifier getIdentifier();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.TypeNameLinha#getIdentifier <em>Identifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier</em>' containment reference.
   * @see #getIdentifier()
   * @generated
   */
  void setIdentifier(identifier value);

  /**
   * Returns the value of the '<em><b>Type Name Linha</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Name Linha</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Name Linha</em>' containment reference.
   * @see #setTypeNameLinha(TypeNameLinha)
   * @see com.ufcg.compiladores.go.GoPackage#getTypeNameLinha_TypeNameLinha()
   * @model containment="true"
   * @generated
   */
  TypeNameLinha getTypeNameLinha();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.TypeNameLinha#getTypeNameLinha <em>Type Name Linha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Name Linha</em>' containment reference.
   * @see #getTypeNameLinha()
   * @generated
   */
  void setTypeNameLinha(TypeNameLinha value);

  /**
   * Returns the value of the '<em><b>Qualified Ident</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Qualified Ident</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Qualified Ident</em>' containment reference.
   * @see #setQualifiedIdent(QualifiedIdent)
   * @see com.ufcg.compiladores.go.GoPackage#getTypeNameLinha_QualifiedIdent()
   * @model containment="true"
   * @generated
   */
  QualifiedIdent getQualifiedIdent();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.TypeNameLinha#getQualifiedIdent <em>Qualified Ident</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Qualified Ident</em>' containment reference.
   * @see #getQualifiedIdent()
   * @generated
   */
  void setQualifiedIdent(QualifiedIdent value);

} // TypeNameLinha
