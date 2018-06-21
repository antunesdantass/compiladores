/**
 * generated by Xtext 2.14.0
 */
package com.ufcg.compiladores.go.impl;

import com.ufcg.compiladores.go.FieldDecl;
import com.ufcg.compiladores.go.GoPackage;
import com.ufcg.compiladores.go.StructType;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Struct Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.ufcg.compiladores.go.impl.StructTypeImpl#getFieldDecl <em>Field Decl</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructTypeImpl extends MinimalEObjectImpl.Container implements StructType
{
  /**
   * The cached value of the '{@link #getFieldDecl() <em>Field Decl</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldDecl()
   * @generated
   * @ordered
   */
  protected EList<FieldDecl> fieldDecl;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StructTypeImpl()
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
    return GoPackage.Literals.STRUCT_TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<FieldDecl> getFieldDecl()
  {
    if (fieldDecl == null)
    {
      fieldDecl = new EObjectContainmentEList<FieldDecl>(FieldDecl.class, this, GoPackage.STRUCT_TYPE__FIELD_DECL);
    }
    return fieldDecl;
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
      case GoPackage.STRUCT_TYPE__FIELD_DECL:
        return ((InternalEList<?>)getFieldDecl()).basicRemove(otherEnd, msgs);
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
      case GoPackage.STRUCT_TYPE__FIELD_DECL:
        return getFieldDecl();
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
      case GoPackage.STRUCT_TYPE__FIELD_DECL:
        getFieldDecl().clear();
        getFieldDecl().addAll((Collection<? extends FieldDecl>)newValue);
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
      case GoPackage.STRUCT_TYPE__FIELD_DECL:
        getFieldDecl().clear();
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
      case GoPackage.STRUCT_TYPE__FIELD_DECL:
        return fieldDecl != null && !fieldDecl.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StructTypeImpl
