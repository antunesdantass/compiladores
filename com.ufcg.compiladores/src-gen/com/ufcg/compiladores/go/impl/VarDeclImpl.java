/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.go.impl;

import com.ufcg.compiladores.go.GoPackage;
import com.ufcg.compiladores.go.VarDecl;
import com.ufcg.compiladores.go.VarSpec;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Var Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.impl.VarDeclImpl#getVarSpec <em>Var Spec</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VarDeclImpl extends MinimalEObjectImpl.Container implements VarDecl
{
  /**
   * The cached value of the '{@link #getVarSpec() <em>Var Spec</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarSpec()
   * @generated
   * @ordered
   */
  protected VarSpec varSpec;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VarDeclImpl()
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
    return GoPackage.Literals.VAR_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VarSpec getVarSpec()
  {
    return varSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVarSpec(VarSpec newVarSpec, NotificationChain msgs)
  {
    VarSpec oldVarSpec = varSpec;
    varSpec = newVarSpec;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.VAR_DECL__VAR_SPEC, oldVarSpec, newVarSpec);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVarSpec(VarSpec newVarSpec)
  {
    if (newVarSpec != varSpec)
    {
      NotificationChain msgs = null;
      if (varSpec != null)
        msgs = ((InternalEObject)varSpec).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.VAR_DECL__VAR_SPEC, null, msgs);
      if (newVarSpec != null)
        msgs = ((InternalEObject)newVarSpec).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.VAR_DECL__VAR_SPEC, null, msgs);
      msgs = basicSetVarSpec(newVarSpec, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.VAR_DECL__VAR_SPEC, newVarSpec, newVarSpec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GoPackage.VAR_DECL__VAR_SPEC:
        return basicSetVarSpec(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case GoPackage.VAR_DECL__VAR_SPEC:
        return getVarSpec();
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
      case GoPackage.VAR_DECL__VAR_SPEC:
        setVarSpec((VarSpec)newValue);
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
      case GoPackage.VAR_DECL__VAR_SPEC:
        setVarSpec((VarSpec)null);
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
      case GoPackage.VAR_DECL__VAR_SPEC:
        return varSpec != null;
    }
    return super.eIsSet(featureID);
  }

} //VarDeclImpl
