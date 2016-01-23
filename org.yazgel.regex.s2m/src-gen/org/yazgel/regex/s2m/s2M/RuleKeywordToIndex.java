/**
 */
package org.yazgel.regex.s2m.s2M;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Keyword To Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.yazgel.regex.s2m.s2M.RuleKeywordToIndex#getStartDelimeter <em>Start Delimeter</em>}</li>
 *   <li>{@link org.yazgel.regex.s2m.s2M.RuleKeywordToIndex#getEndIndex <em>End Index</em>}</li>
 * </ul>
 *
 * @see org.yazgel.regex.s2m.s2M.S2MPackage#getRuleKeywordToIndex()
 * @model
 * @generated
 */
public interface RuleKeywordToIndex extends Rule
{
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
   * @see org.yazgel.regex.s2m.s2M.S2MPackage#getRuleKeywordToIndex_StartDelimeter()
   * @model
   * @generated
   */
  String getStartDelimeter();

  /**
   * Sets the value of the '{@link org.yazgel.regex.s2m.s2M.RuleKeywordToIndex#getStartDelimeter <em>Start Delimeter</em>}' attribute.
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
   * @see org.yazgel.regex.s2m.s2M.S2MPackage#getRuleKeywordToIndex_EndIndex()
   * @model
   * @generated
   */
  int getEndIndex();

  /**
   * Sets the value of the '{@link org.yazgel.regex.s2m.s2M.RuleKeywordToIndex#getEndIndex <em>End Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End Index</em>' attribute.
   * @see #getEndIndex()
   * @generated
   */
  void setEndIndex(int value);

} // RuleKeywordToIndex
