/**
 */
package org.yazgel.regex.s2m.s2M;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.yazgel.regex.s2m.s2M.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link org.yazgel.regex.s2m.s2M.Attribute#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.yazgel.regex.s2m.s2M.S2MPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.yazgel.regex.s2m.s2M.S2MPackage#getAttribute_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.yazgel.regex.s2m.s2M.Attribute#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.yazgel.regex.s2m.s2M.AttributeType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.yazgel.regex.s2m.s2M.AttributeType
   * @see #setType(AttributeType)
   * @see org.yazgel.regex.s2m.s2M.S2MPackage#getAttribute_Type()
   * @model
   * @generated
   */
  AttributeType getType();

  /**
   * Sets the value of the '{@link org.yazgel.regex.s2m.s2M.Attribute#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.yazgel.regex.s2m.s2M.AttributeType
   * @see #getType()
   * @generated
   */
  void setType(AttributeType value);

} // Attribute
