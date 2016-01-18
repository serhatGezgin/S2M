/**
 */
package org.yazgel.regex.s2m.s2M;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.yazgel.regex.s2m.s2M.S2MPackage
 * @generated
 */
public interface S2MFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  S2MFactory eINSTANCE = org.yazgel.regex.s2m.s2M.impl.S2MFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns a new object of class '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule</em>'.
   * @generated
   */
  Rule createRule();

  /**
   * Returns a new object of class '<em>Rule Index</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule Index</em>'.
   * @generated
   */
  RuleIndex createRuleIndex();

  /**
   * Returns a new object of class '<em>Rule Index To Keyword</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule Index To Keyword</em>'.
   * @generated
   */
  RuleIndexToKeyword createRuleIndexToKeyword();

  /**
   * Returns a new object of class '<em>Rule Keyword</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule Keyword</em>'.
   * @generated
   */
  RuleKeyword createRuleKeyword();

  /**
   * Returns a new object of class '<em>Rule Keyword To Index</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule Keyword To Index</em>'.
   * @generated
   */
  RuleKeywordToIndex createRuleKeywordToIndex();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  S2MPackage getS2MPackage();

} //S2MFactory
