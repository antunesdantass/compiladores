/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.go.impl;

import com.ufcg.compiladores.go.GoPackage;
import com.ufcg.compiladores.go.PackageClause;
import com.ufcg.compiladores.go.PackageName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.impl.PackageClauseImpl#getPackageName <em>Package Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageClauseImpl extends MinimalEObjectImpl.Container implements PackageClause
{
  /**
   * The cached value of the '{@link #getPackageName() <em>Package Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPackageName()
   * @generated
   * @ordered
   */
  protected PackageName packageName;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PackageClauseImpl()
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
    return GoPackage.Literals.PACKAGE_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PackageName getPackageName()
  {
    return packageName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPackageName(PackageName newPackageName, NotificationChain msgs)
  {
    PackageName oldPackageName = packageName;
    packageName = newPackageName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.PACKAGE_CLAUSE__PACKAGE_NAME, oldPackageName, newPackageName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPackageName(PackageName newPackageName)
  {
    if (newPackageName != packageName)
    {
      NotificationChain msgs = null;
      if (packageName != null)
        msgs = ((InternalEObject)packageName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.PACKAGE_CLAUSE__PACKAGE_NAME, null, msgs);
      if (newPackageName != null)
        msgs = ((InternalEObject)newPackageName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.PACKAGE_CLAUSE__PACKAGE_NAME, null, msgs);
      msgs = basicSetPackageName(newPackageName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.PACKAGE_CLAUSE__PACKAGE_NAME, newPackageName, newPackageName));
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
      case GoPackage.PACKAGE_CLAUSE__PACKAGE_NAME:
        return basicSetPackageName(null, msgs);
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
      case GoPackage.PACKAGE_CLAUSE__PACKAGE_NAME:
        return getPackageName();
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
      case GoPackage.PACKAGE_CLAUSE__PACKAGE_NAME:
        setPackageName((PackageName)newValue);
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
      case GoPackage.PACKAGE_CLAUSE__PACKAGE_NAME:
        setPackageName((PackageName)null);
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
      case GoPackage.PACKAGE_CLAUSE__PACKAGE_NAME:
        return packageName != null;
    }
    return super.eIsSet(featureID);
  }

} //PackageClauseImpl
