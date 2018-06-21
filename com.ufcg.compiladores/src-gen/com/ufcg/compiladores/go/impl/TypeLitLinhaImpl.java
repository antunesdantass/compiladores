/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.go.impl;

import com.ufcg.compiladores.go.ArrayLength;
import com.ufcg.compiladores.go.ElementType;
import com.ufcg.compiladores.go.GoPackage;
import com.ufcg.compiladores.go.TypeLitLinha;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Lit Linha</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.impl.TypeLitLinhaImpl#getArrayLength <em>Array Length</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.impl.TypeLitLinhaImpl#getElementType <em>Element Type</em>}</li>
 *   <li>{@link com.ufcg.compiladores.go.impl.TypeLitLinhaImpl#getTypeLitLinha <em>Type Lit Linha</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeLitLinhaImpl extends MinimalEObjectImpl.Container implements TypeLitLinha
{
  /**
   * The cached value of the '{@link #getArrayLength() <em>Array Length</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArrayLength()
   * @generated
   * @ordered
   */
  protected ArrayLength arrayLength;

  /**
   * The cached value of the '{@link #getElementType() <em>Element Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementType()
   * @generated
   * @ordered
   */
  protected ElementType elementType;

  /**
   * The cached value of the '{@link #getTypeLitLinha() <em>Type Lit Linha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeLitLinha()
   * @generated
   * @ordered
   */
  protected TypeLitLinha typeLitLinha;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeLitLinhaImpl()
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
    return GoPackage.Literals.TYPE_LIT_LINHA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ArrayLength getArrayLength()
  {
    return arrayLength;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArrayLength(ArrayLength newArrayLength, NotificationChain msgs)
  {
    ArrayLength oldArrayLength = arrayLength;
    arrayLength = newArrayLength;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.TYPE_LIT_LINHA__ARRAY_LENGTH, oldArrayLength, newArrayLength);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArrayLength(ArrayLength newArrayLength)
  {
    if (newArrayLength != arrayLength)
    {
      NotificationChain msgs = null;
      if (arrayLength != null)
        msgs = ((InternalEObject)arrayLength).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.TYPE_LIT_LINHA__ARRAY_LENGTH, null, msgs);
      if (newArrayLength != null)
        msgs = ((InternalEObject)newArrayLength).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.TYPE_LIT_LINHA__ARRAY_LENGTH, null, msgs);
      msgs = basicSetArrayLength(newArrayLength, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.TYPE_LIT_LINHA__ARRAY_LENGTH, newArrayLength, newArrayLength));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementType getElementType()
  {
    return elementType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElementType(ElementType newElementType, NotificationChain msgs)
  {
    ElementType oldElementType = elementType;
    elementType = newElementType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.TYPE_LIT_LINHA__ELEMENT_TYPE, oldElementType, newElementType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElementType(ElementType newElementType)
  {
    if (newElementType != elementType)
    {
      NotificationChain msgs = null;
      if (elementType != null)
        msgs = ((InternalEObject)elementType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.TYPE_LIT_LINHA__ELEMENT_TYPE, null, msgs);
      if (newElementType != null)
        msgs = ((InternalEObject)newElementType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.TYPE_LIT_LINHA__ELEMENT_TYPE, null, msgs);
      msgs = basicSetElementType(newElementType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.TYPE_LIT_LINHA__ELEMENT_TYPE, newElementType, newElementType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypeLitLinha getTypeLitLinha()
  {
    return typeLitLinha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTypeLitLinha(TypeLitLinha newTypeLitLinha, NotificationChain msgs)
  {
    TypeLitLinha oldTypeLitLinha = typeLitLinha;
    typeLitLinha = newTypeLitLinha;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GoPackage.TYPE_LIT_LINHA__TYPE_LIT_LINHA, oldTypeLitLinha, newTypeLitLinha);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTypeLitLinha(TypeLitLinha newTypeLitLinha)
  {
    if (newTypeLitLinha != typeLitLinha)
    {
      NotificationChain msgs = null;
      if (typeLitLinha != null)
        msgs = ((InternalEObject)typeLitLinha).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GoPackage.TYPE_LIT_LINHA__TYPE_LIT_LINHA, null, msgs);
      if (newTypeLitLinha != null)
        msgs = ((InternalEObject)newTypeLitLinha).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GoPackage.TYPE_LIT_LINHA__TYPE_LIT_LINHA, null, msgs);
      msgs = basicSetTypeLitLinha(newTypeLitLinha, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GoPackage.TYPE_LIT_LINHA__TYPE_LIT_LINHA, newTypeLitLinha, newTypeLitLinha));
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
      case GoPackage.TYPE_LIT_LINHA__ARRAY_LENGTH:
        return basicSetArrayLength(null, msgs);
      case GoPackage.TYPE_LIT_LINHA__ELEMENT_TYPE:
        return basicSetElementType(null, msgs);
      case GoPackage.TYPE_LIT_LINHA__TYPE_LIT_LINHA:
        return basicSetTypeLitLinha(null, msgs);
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
      case GoPackage.TYPE_LIT_LINHA__ARRAY_LENGTH:
        return getArrayLength();
      case GoPackage.TYPE_LIT_LINHA__ELEMENT_TYPE:
        return getElementType();
      case GoPackage.TYPE_LIT_LINHA__TYPE_LIT_LINHA:
        return getTypeLitLinha();
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
      case GoPackage.TYPE_LIT_LINHA__ARRAY_LENGTH:
        setArrayLength((ArrayLength)newValue);
        return;
      case GoPackage.TYPE_LIT_LINHA__ELEMENT_TYPE:
        setElementType((ElementType)newValue);
        return;
      case GoPackage.TYPE_LIT_LINHA__TYPE_LIT_LINHA:
        setTypeLitLinha((TypeLitLinha)newValue);
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
      case GoPackage.TYPE_LIT_LINHA__ARRAY_LENGTH:
        setArrayLength((ArrayLength)null);
        return;
      case GoPackage.TYPE_LIT_LINHA__ELEMENT_TYPE:
        setElementType((ElementType)null);
        return;
      case GoPackage.TYPE_LIT_LINHA__TYPE_LIT_LINHA:
        setTypeLitLinha((TypeLitLinha)null);
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
      case GoPackage.TYPE_LIT_LINHA__ARRAY_LENGTH:
        return arrayLength != null;
      case GoPackage.TYPE_LIT_LINHA__ELEMENT_TYPE:
        return elementType != null;
      case GoPackage.TYPE_LIT_LINHA__TYPE_LIT_LINHA:
        return typeLitLinha != null;
    }
    return super.eIsSet(featureID);
  }

} //TypeLitLinhaImpl
