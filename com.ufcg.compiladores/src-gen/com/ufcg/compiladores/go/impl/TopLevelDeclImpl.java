/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.go.impl;

import com.ufcg.compiladores.go.Declaration;
import com.ufcg.compiladores.go.GoPackage;
import com.ufcg.compiladores.go.TopLevelDecl;
import com.ufcg.compiladores.go.topLevelDeclLinha;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Top Level Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.impl.TopLevelDeclImpl#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.impl.TopLevelDeclImpl#getTopLevelDeclLinha <em>Top Level Decl Linha</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopLevelDeclImpl extends MinimalEObjectImpl.Container implements TopLevelDecl
{
  /**
   * The cached value of the '{@link #getDeclaration() <em>Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaration()
   * @generated
   * @ordered
   */
  protected Declaration declaration;

  /**
   * The cached value of the '{@link #getTopLevelDeclLinha() <em>Top Level Decl Linha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTopLevelDeclLinha()
   * @generated
   * @ordered
   */
  protected topLevelDeclLinha topLevelDeclLinha;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TopLevelDeclImpl()
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
    return GoPackage.Literals.TOP_LEVEL_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Declaration getDeclaration()
  {
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeclaration(Declaration newDeclaration, NotificationChain msgs)
  {
    Declaration oldDeclaration = declaration;
    declaration = newDeclaration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.TOP_LEVEL_DECL__DECLARATION, oldDeclaration, newDeclaration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclaration(Declaration newDeclaration)
  {
    if (newDeclaration != declaration)
    {
      NotificationChain msgs = null;
      if (declaration != null)
        msgs = ((InternalEObject)declaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.TOP_LEVEL_DECL__DECLARATION, null, msgs);
      if (newDeclaration != null)
        msgs = ((InternalEObject)newDeclaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.TOP_LEVEL_DECL__DECLARATION, null, msgs);
      msgs = basicSetDeclaration(newDeclaration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.TOP_LEVEL_DECL__DECLARATION, newDeclaration, newDeclaration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public topLevelDeclLinha getTopLevelDeclLinha()
  {
    return topLevelDeclLinha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTopLevelDeclLinha(topLevelDeclLinha newTopLevelDeclLinha, NotificationChain msgs)
  {
    topLevelDeclLinha oldTopLevelDeclLinha = topLevelDeclLinha;
    topLevelDeclLinha = newTopLevelDeclLinha;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.TOP_LEVEL_DECL__TOP_LEVEL_DECL_LINHA, oldTopLevelDeclLinha, newTopLevelDeclLinha);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTopLevelDeclLinha(topLevelDeclLinha newTopLevelDeclLinha)
  {
    if (newTopLevelDeclLinha != topLevelDeclLinha)
    {
      NotificationChain msgs = null;
      if (topLevelDeclLinha != null)
        msgs = ((InternalEObject)topLevelDeclLinha).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.TOP_LEVEL_DECL__TOP_LEVEL_DECL_LINHA, null, msgs);
      if (newTopLevelDeclLinha != null)
        msgs = ((InternalEObject)newTopLevelDeclLinha).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.TOP_LEVEL_DECL__TOP_LEVEL_DECL_LINHA, null, msgs);
      msgs = basicSetTopLevelDeclLinha(newTopLevelDeclLinha, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.TOP_LEVEL_DECL__TOP_LEVEL_DECL_LINHA, newTopLevelDeclLinha, newTopLevelDeclLinha));
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
      case GoPackage.TOP_LEVEL_DECL__DECLARATION:
        return basicSetDeclaration(null, msgs);
      case GoPackage.TOP_LEVEL_DECL__TOP_LEVEL_DECL_LINHA:
        return basicSetTopLevelDeclLinha(null, msgs);
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
      case GoPackage.TOP_LEVEL_DECL__DECLARATION:
        return getDeclaration();
      case GoPackage.TOP_LEVEL_DECL__TOP_LEVEL_DECL_LINHA:
        return getTopLevelDeclLinha();
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
      case GoPackage.TOP_LEVEL_DECL__DECLARATION:
        setDeclaration((Declaration)newValue);
        return;
      case GoPackage.TOP_LEVEL_DECL__TOP_LEVEL_DECL_LINHA:
        setTopLevelDeclLinha((topLevelDeclLinha)newValue);
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
      case GoPackage.TOP_LEVEL_DECL__DECLARATION:
        setDeclaration((Declaration)null);
        return;
      case GoPackage.TOP_LEVEL_DECL__TOP_LEVEL_DECL_LINHA:
        setTopLevelDeclLinha((topLevelDeclLinha)null);
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
      case GoPackage.TOP_LEVEL_DECL__DECLARATION:
        return declaration != null;
      case GoPackage.TOP_LEVEL_DECL__TOP_LEVEL_DECL_LINHA:
        return topLevelDeclLinha != null;
    }
    return super.eIsSet(featureID);
  }

} //TopLevelDeclImpl
