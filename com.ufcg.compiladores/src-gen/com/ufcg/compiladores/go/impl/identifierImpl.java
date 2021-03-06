/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.go.impl;

import com.ufcg.compiladores.go.GoPackage;
import com.ufcg.compiladores.go.identifier;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>identifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.impl.identifierImpl#getLETTER <em>LETTER</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.impl.identifierImpl#getDECIMAL_DIGIT <em>DECIMAL DIGIT</em>}</li>
 * </ul>
 *
 * @generated
 */
public class identifierImpl extends OperandNameImpl implements identifier
{
  /**
   * The cached value of the '{@link #getLETTER() <em>LETTER</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLETTER()
   * @generated
   * @ordered
   */
  protected EList<String> letter;

  /**
   * The cached value of the '{@link #getDECIMAL_DIGIT() <em>DECIMAL DIGIT</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDECIMAL_DIGIT()
   * @generated
   * @ordered
   */
  protected EList<String> decimaL_DIGIT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected identifierImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GoPackage.Literals.IDENTIFIER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getLETTER()
  {
    if (letter == null)
    {
      letter = new EDataTypeEList<String>(String.class, this, GoPackage.IDENTIFIER__LETTER);
    }
    return letter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getDECIMAL_DIGIT()
  {
    if (decimaL_DIGIT == null)
    {
      decimaL_DIGIT = new EDataTypeEList<String>(String.class, this, GoPackage.IDENTIFIER__DECIMAL_DIGIT);
    }
    return decimaL_DIGIT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GoPackage.IDENTIFIER__LETTER:
        return getLETTER();
      case GoPackage.IDENTIFIER__DECIMAL_DIGIT:
        return getDECIMAL_DIGIT();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GoPackage.IDENTIFIER__LETTER:
        getLETTER().clear();
        getLETTER().addAll((Collection<? extends String>)newValue);
        return;
      case GoPackage.IDENTIFIER__DECIMAL_DIGIT:
        getDECIMAL_DIGIT().clear();
        getDECIMAL_DIGIT().addAll((Collection<? extends String>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GoPackage.IDENTIFIER__LETTER:
        getLETTER().clear();
        return;
      case GoPackage.IDENTIFIER__DECIMAL_DIGIT:
        getDECIMAL_DIGIT().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GoPackage.IDENTIFIER__LETTER:
        return letter != null && !letter.isEmpty();
      case GoPackage.IDENTIFIER__DECIMAL_DIGIT:
        return decimaL_DIGIT != null && !decimaL_DIGIT.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (LETTER: ");
    result.append(letter);
    result.append(", DECIMAL_DIGIT: ");
    result.append(decimaL_DIGIT);
    result.append(')');
    return result.toString();
  }

} //identifierImpl
