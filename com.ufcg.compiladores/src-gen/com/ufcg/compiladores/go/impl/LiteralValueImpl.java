/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.go.impl;

import com.ufcg.compiladores.go.ElementList;
import com.ufcg.compiladores.go.GoPackage;
import com.ufcg.compiladores.go.LiteralValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.impl.LiteralValueImpl#getElementList <em>Element List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LiteralValueImpl extends MinimalEObjectImpl.Container implements LiteralValue
{
  /**
   * The cached value of the '{@link #getElementList() <em>Element List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementList()
   * @generated
   * @ordered
   */
  protected ElementList elementList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LiteralValueImpl()
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
    return GoPackage.Literals.LITERAL_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementList getElementList()
  {
    return elementList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElementList(ElementList newElementList, NotificationChain msgs)
  {
    ElementList oldElementList = elementList;
    elementList = newElementList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.LITERAL_VALUE__ELEMENT_LIST, oldElementList, newElementList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElementList(ElementList newElementList)
  {
    if (newElementList != elementList)
    {
      NotificationChain msgs = null;
      if (elementList != null)
        msgs = ((InternalEObject)elementList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.LITERAL_VALUE__ELEMENT_LIST, null, msgs);
      if (newElementList != null)
        msgs = ((InternalEObject)newElementList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.LITERAL_VALUE__ELEMENT_LIST, null, msgs);
      msgs = basicSetElementList(newElementList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.LITERAL_VALUE__ELEMENT_LIST, newElementList, newElementList));
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
      case GoPackage.LITERAL_VALUE__ELEMENT_LIST:
        return basicSetElementList(null, msgs);
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
      case GoPackage.LITERAL_VALUE__ELEMENT_LIST:
        return getElementList();
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
      case GoPackage.LITERAL_VALUE__ELEMENT_LIST:
        setElementList((ElementList)newValue);
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
      case GoPackage.LITERAL_VALUE__ELEMENT_LIST:
        setElementList((ElementList)null);
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
      case GoPackage.LITERAL_VALUE__ELEMENT_LIST:
        return elementList != null;
    }
    return super.eIsSet(featureID);
  }

} //LiteralValueImpl
