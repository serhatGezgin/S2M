/**
 */
package org.yazgel.regex.s2m.s2M;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.yazgel.regex.s2m.s2M.RuleIndex#getStartIndex <em>Start Index</em>}</li>
 *   <li>{@link org.yazgel.regex.s2m.s2M.RuleIndex#getEndIndex <em>End Index</em>}</li>
 * </ul>
 *
 * @see org.yazgel.regex.s2m.s2M.S2MPackage#getRuleIndex()
 * @model
 * @generated
 */
public interface RuleIndex extends Rule
{
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
   * @see org.yazgel.regex.s2m.s2M.S2MPackage#getRuleIndex_StartIndex()
   * @model
   * @generated
   */
  int getStartIndex();

  /**
   * Sets the value of the '{@link org.yazgel.regex.s2m.s2M.RuleIndex#getStartIndex <em>Start Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start Index</em>' attribute.
   * @see #getStartIndex()
   * @generated
   */
  void setStartIndex(int value);

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
   * @see org.yazgel.regex.s2m.s2M.S2MPackage#getRuleIndex_EndIndex()
   * @model
   * @generated
   */
  int getEndIndex();

  /**
   * Sets the value of the '{@link org.yazgel.regex.s2m.s2M.RuleIndex#getEndIndex <em>End Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End Index</em>' attribute.
   * @see #getEndIndex()
   * @generated
   */
  void setEndIndex(int value);

} // RuleIndex
