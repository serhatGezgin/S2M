/**
 */
package org.yazgel.regex.s2m.s2M;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule Keyword</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.yazgel.regex.s2m.s2M.RuleKeyword#getStartDelimeter <em>Start Delimeter</em>}</li>
 *   <li>{@link org.yazgel.regex.s2m.s2M.RuleKeyword#getEndDelimeter <em>End Delimeter</em>}</li>
 * </ul>
 *
 * @see org.yazgel.regex.s2m.s2M.S2MPackage#getRuleKeyword()
 * @model
 * @generated
 */
public interface RuleKeyword extends Rule
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
   * @see org.yazgel.regex.s2m.s2M.S2MPackage#getRuleKeyword_StartDelimeter()
   * @model
   * @generated
   */
  String getStartDelimeter();

  /**
   * Sets the value of the '{@link org.yazgel.regex.s2m.s2M.RuleKeyword#getStartDelimeter <em>Start Delimeter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Start Delimeter</em>' attribute.
   * @see #getStartDelimeter()
   * @generated
   */
  void setStartDelimeter(String value);

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
   * @see org.yazgel.regex.s2m.s2M.S2MPackage#getRuleKeyword_EndDelimeter()
   * @model
   * @generated
   */
  String getEndDelimeter();

  /**
   * Sets the value of the '{@link org.yazgel.regex.s2m.s2M.RuleKeyword#getEndDelimeter <em>End Delimeter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>End Delimeter</em>' attribute.
   * @see #getEndDelimeter()
   * @generated
   */
  void setEndDelimeter(String value);

} // RuleKeyword
