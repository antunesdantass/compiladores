/**
 * generated by Xtext 2.13.0
 */
package com.ufcg.compiladores.go.impl;

import com.ufcg.compiladores.go.FunctionDecl;
import com.ufcg.compiladores.go.FunctionLit;
import com.ufcg.compiladores.go.GoPackage;
import com.ufcg.compiladores.go.Literal;
import com.ufcg.compiladores.go.Operand;
import com.ufcg.compiladores.go.PrimaryExpr;
import com.ufcg.compiladores.go.Signature;
import com.ufcg.compiladores.go.TopLevelDecl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Signature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.impl.SignatureImpl#getPrimaryExprLinha <em>Primary Expr Linha</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.impl.SignatureImpl#getFunctionBody <em>Function Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SignatureImpl extends MethodSpecImpl implements Signature
{
  /**
   * The default value of the '{@link #getPrimaryExprLinha() <em>Primary Expr Linha</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimaryExprLinha()
   * @generated
   * @ordered
   */
  protected static final String PRIMARY_EXPR_LINHA_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPrimaryExprLinha() <em>Primary Expr Linha</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimaryExprLinha()
   * @generated
   * @ordered
   */
  protected String primaryExprLinha = PRIMARY_EXPR_LINHA_EDEFAULT;

  /**
   * The default value of the '{@link #getFunctionBody() <em>Function Body</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionBody()
   * @generated
   * @ordered
   */
  protected static final String FUNCTION_BODY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFunctionBody() <em>Function Body</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctionBody()
   * @generated
   * @ordered
   */
  protected String functionBody = FUNCTION_BODY_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SignatureImpl()
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
    return GoPackage.Literals.SIGNATURE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPrimaryExprLinha()
  {
    return primaryExprLinha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimaryExprLinha(String newPrimaryExprLinha)
  {
    String oldPrimaryExprLinha = primaryExprLinha;
    primaryExprLinha = newPrimaryExprLinha;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.SIGNATURE__PRIMARY_EXPR_LINHA, oldPrimaryExprLinha, primaryExprLinha));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFunctionBody()
  {
    return functionBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunctionBody(String newFunctionBody)
  {
    String oldFunctionBody = functionBody;
    functionBody = newFunctionBody;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.SIGNATURE__FUNCTION_BODY, oldFunctionBody, functionBody));
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
      case GoPackage.SIGNATURE__PRIMARY_EXPR_LINHA:
        return getPrimaryExprLinha();
      case GoPackage.SIGNATURE__FUNCTION_BODY:
        return getFunctionBody();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GoPackage.SIGNATURE__PRIMARY_EXPR_LINHA:
        setPrimaryExprLinha((String)newValue);
        return;
      case GoPackage.SIGNATURE__FUNCTION_BODY:
        setFunctionBody((String)newValue);
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
      case GoPackage.SIGNATURE__PRIMARY_EXPR_LINHA:
        setPrimaryExprLinha(PRIMARY_EXPR_LINHA_EDEFAULT);
        return;
      case GoPackage.SIGNATURE__FUNCTION_BODY:
        setFunctionBody(FUNCTION_BODY_EDEFAULT);
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
      case GoPackage.SIGNATURE__PRIMARY_EXPR_LINHA:
        return PRIMARY_EXPR_LINHA_EDEFAULT == null ? primaryExprLinha != null : !PRIMARY_EXPR_LINHA_EDEFAULT.equals(primaryExprLinha);
      case GoPackage.SIGNATURE__FUNCTION_BODY:
        return FUNCTION_BODY_EDEFAULT == null ? functionBody != null : !FUNCTION_BODY_EDEFAULT.equals(functionBody);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == TopLevelDecl.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == FunctionDecl.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == PrimaryExpr.class)
    {
      switch (derivedFeatureID)
      {
        case GoPackage.SIGNATURE__PRIMARY_EXPR_LINHA: return GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_LINHA;
        default: return -1;
      }
    }
    if (baseClass == Operand.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Literal.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == FunctionLit.class)
    {
      switch (derivedFeatureID)
      {
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == TopLevelDecl.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == FunctionDecl.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == PrimaryExpr.class)
    {
      switch (baseFeatureID)
      {
        case GoPackage.PRIMARY_EXPR__PRIMARY_EXPR_LINHA: return GoPackage.SIGNATURE__PRIMARY_EXPR_LINHA;
        default: return -1;
      }
    }
    if (baseClass == Operand.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == Literal.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    if (baseClass == FunctionLit.class)
    {
      switch (baseFeatureID)
      {
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (PrimaryExprLinha: ");
    result.append(primaryExprLinha);
    result.append(", FunctionBody: ");
    result.append(functionBody);
    result.append(')');
    return result.toString();
  }

} //SignatureImpl
