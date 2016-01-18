/**
 */
package org.yazgel.regex.s2m.s2M;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Index To Keyword</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.yazgel.regex.s2m.s2M.RuleIndexToKeyword#getStartIndex <em>Start Index</em>}</li>
 *   <li>{@link org.yazgel.regex.s2m.s2M.RuleIndexToKeyword#getEndDelimeter <em>End Delimeter</em>}</li>
 * </ul>
 *
 * @see org.yazgel.regex.s2m.s2M.S2MPackage#getRuleIndexToKeyword()
 * @model
 * @generated
 */
public interface RuleIndexToKeyword extends Rule
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
   * @see org.yazgel.regex.s2m.s2M.S2MPackage#getRuleIndexToKeyword_StartIndex()
   * @model
   * @generated
   */
  int getStartIndex();

  /**
   * Sets the value of the '{@link org.yazgel.regex.s2m.s2M.RuleIndexToKeyword#getStartIndex <em>Start Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start Index</em>' attribute.
   * @see #getStartIndex()
   * @generated
   */
  void setStartIndex(int value);

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
   * @see org.yazgel.regex.s2m.s2M.S2MPackage#getRuleIndexToKeyword_EndDelimeter()
   * @model
   * @generated
   */
  String getEndDelimeter();

  /**
   * Sets the value of the '{@link org.yazgel.regex.s2m.s2M.RuleIndexToKeyword#getEndDelimeter <em>End Delimeter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End Delimeter</em>' attribute.
   * @see #getEndDelimeter()
   * @generated
   */
  void setEndDelimeter(String value);

} // RuleIndexToKeyword
