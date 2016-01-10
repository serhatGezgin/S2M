/**
 */
package org.yazgel.regex.s2m.s2M;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.yazgel.regex.s2m.s2M.Rule#getName <em>Name</em>}</li>
 *   <li>{@link org.yazgel.regex.s2m.s2M.Rule#getStartIndex <em>Start Index</em>}</li>
 *   <li>{@link org.yazgel.regex.s2m.s2M.Rule#getStartDelimeter <em>Start Delimeter</em>}</li>
 *   <li>{@link org.yazgel.regex.s2m.s2M.Rule#getEndIndex <em>End Index</em>}</li>
 *   <li>{@link org.yazgel.regex.s2m.s2M.Rule#getEndDelimeter <em>End Delimeter</em>}</li>
 *   <li>{@link org.yazgel.regex.s2m.s2M.Rule#getAttr <em>Attr</em>}</li>
 * </ul>
 *
 * @see org.yazgel.regex.s2m.s2M.S2MPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject
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
   * @see org.yazgel.regex.s2m.s2M.S2MPackage#getRule_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.yazgel.regex.s2m.s2M.Rule#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Start Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start Index</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start Index</em>' attribute.
   * @see #setStartIndex(int)
   * @see org.yazgel.regex.s2m.s2M.S2MPackage#getRule_StartIndex()
   * @model
   * @generated
   */
  int getStartIndex();

  /**
   * Sets the value of the '{@link org.yazgel.regex.s2m.s2M.Rule#getStartIndex <em>Start Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start Index</em>' attribute.
   * @see #getStartIndex()
   * @generated
   */
  void setStartIndex(int value);

  /**
   * Returns the value of the '<em><b>Start Delimeter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Start Delimeter</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Start Delimeter</em>' attribute.
   * @see #setStartDelimeter(String)
   * @see org.yazgel.regex.s2m.s2M.S2MPackage#getRule_StartDelimeter()
   * @model
   * @generated
   */
  String getStartDelimeter();

  /**
   * Sets the value of the '{@link org.yazgel.regex.s2m.s2M.Rule#getStartDelimeter <em>Start Delimeter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start Delimeter</em>' attribute.
   * @see #getStartDelimeter()
   * @generated
   */
  void setStartDelimeter(String value);

  /**
   * Returns the value of the '<em><b>End Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End Index</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End Index</em>' attribute.
   * @see #setEndIndex(int)
   * @see org.yazgel.regex.s2m.s2M.S2MPackage#getRule_EndIndex()
   * @model
   * @generated
   */
  int getEndIndex();

  /**
   * Sets the value of the '{@link org.yazgel.regex.s2m.s2M.Rule#getEndIndex <em>End Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End Index</em>' attribute.
   * @see #getEndIndex()
   * @generated
   */
  void setEndIndex(int value);

  /**
   * Returns the value of the '<em><b>End Delimeter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>End Delimeter</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>End Delimeter</em>' attribute.
   * @see #setEndDelimeter(String)
   * @see org.yazgel.regex.s2m.s2M.S2MPackage#getRule_EndDelimeter()
   * @model
   * @generated
   */
  String getEndDelimeter();

  /**
   * Sets the value of the '{@link org.yazgel.regex.s2m.s2M.Rule#getEndDelimeter <em>End Delimeter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End Delimeter</em>' attribute.
   * @see #getEndDelimeter()
   * @generated
   */
  void setEndDelimeter(String value);

  /**
   * Returns the value of the '<em><b>Attr</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attr</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attr</em>' reference.
   * @see #setAttr(Attribute)
   * @see org.yazgel.regex.s2m.s2M.S2MPackage#getRule_Attr()
   * @model
   * @generated
   */
  Attribute getAttr();

  /**
   * Sets the value of the '{@link org.yazgel.regex.s2m.s2M.Rule#getAttr <em>Attr</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attr</em>' reference.
   * @see #getAttr()
   * @generated
   */
  void setAttr(Attribute value);

} // Rule
