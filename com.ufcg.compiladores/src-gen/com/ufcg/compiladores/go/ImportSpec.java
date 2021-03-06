/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.go;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.ImportSpec#getPackageName <em>Package Name</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.ImportSpec#getImportPath <em>Import Path</em>}</li>
 * </ul>
 *
 * @see com.ufcg.compiladores.go.GoPackage#getImportSpec()
 * @model
 * @generated
 */
public interface ImportSpec extends EObject
{
  /**
   * Returns the value of the '<em><b>Package Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Package Name</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Package Name</em>' containment reference.
   * @see #setPackageName(PackageName)
   * @see com.ufcg.compiladores.go.GoPackage#getImportSpec_PackageName()
   * @model containment="true"
   * @generated
   */
  PackageName getPackageName();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.ImportSpec#getPackageName <em>Package Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Package Name</em>' containment reference.
   * @see #getPackageName()
   * @generated
   */
  void setPackageName(PackageName value);

  /**
   * Returns the value of the '<em><b>Import Path</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Import Path</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Import Path</em>' containment reference.
   * @see #setImportPath(ImportPath)
   * @see com.ufcg.compiladores.go.GoPackage#getImportSpec_ImportPath()
   * @model containment="true"
   * @generated
   */
  ImportPath getImportPath();

  /**
   * Sets the value of the '{@link com.ufcg.compiladores.go.ImportSpec#getImportPath <em>Import Path</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Import Path</em>' containment reference.
   * @see #getImportPath()
   * @generated
   */
  void setImportPath(ImportPath value);

} // ImportSpec
