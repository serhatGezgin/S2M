/**
 */
package org.yazgel.regex.s2m.s2M;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.yazgel.regex.s2m.s2M.S2MFactory
 * @model kind="package"
 * @generated
 */
public interface S2MPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "s2M";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.yazgel.org/regex/s2m/S2M";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "s2M";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  S2MPackage eINSTANCE = org.yazgel.regex.s2m.s2M.impl.S2MPackageImpl.init();

  /**
   * The meta object id for the '{@link org.yazgel.regex.s2m.s2M.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.regex.s2m.s2M.impl.ModelImpl
   * @see org.yazgel.regex.s2m.s2M.impl.S2MPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NAME = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__ATTRIBUTES = 1;

  /**
   * The feature id for the '<em><b>Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__RULES = 2;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.yazgel.regex.s2m.s2M.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.regex.s2m.s2M.impl.AttributeImpl
   * @see org.yazgel.regex.s2m.s2M.impl.S2MPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__TYPE = 1;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.yazgel.regex.s2m.s2M.impl.RuleImpl <em>Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.regex.s2m.s2M.impl.RuleImpl
   * @see org.yazgel.regex.s2m.s2M.impl.S2MPackageImpl#getRule()
   * @generated
   */
  int RULE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__NAME = 0;

  /**
   * The feature id for the '<em><b>Attr</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__ATTR = 1;

  /**
   * The number of structural features of the '<em>Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.yazgel.regex.s2m.s2M.impl.RuleIndexImpl <em>Rule Index</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.regex.s2m.s2M.impl.RuleIndexImpl
   * @see org.yazgel.regex.s2m.s2M.impl.S2MPackageImpl#getRuleIndex()
   * @generated
   */
  int RULE_INDEX = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_INDEX__NAME = RULE__NAME;

  /**
   * The feature id for the '<em><b>Attr</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_INDEX__ATTR = RULE__ATTR;

  /**
   * The feature id for the '<em><b>Start Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_INDEX__START_INDEX = RULE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>End Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_INDEX__END_INDEX = RULE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Rule Index</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_INDEX_FEATURE_COUNT = RULE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.yazgel.regex.s2m.s2M.impl.RuleIndexToKeywordImpl <em>Rule Index To Keyword</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.regex.s2m.s2M.impl.RuleIndexToKeywordImpl
   * @see org.yazgel.regex.s2m.s2M.impl.S2MPackageImpl#getRuleIndexToKeyword()
   * @generated
   */
  int RULE_INDEX_TO_KEYWORD = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_INDEX_TO_KEYWORD__NAME = RULE__NAME;

  /**
   * The feature id for the '<em><b>Attr</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_INDEX_TO_KEYWORD__ATTR = RULE__ATTR;

  /**
   * The feature id for the '<em><b>Start Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_INDEX_TO_KEYWORD__START_INDEX = RULE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>End Delimeter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_INDEX_TO_KEYWORD__END_DELIMETER = RULE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Rule Index To Keyword</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_INDEX_TO_KEYWORD_FEATURE_COUNT = RULE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.yazgel.regex.s2m.s2M.impl.RuleKeywordImpl <em>Rule Keyword</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.regex.s2m.s2M.impl.RuleKeywordImpl
   * @see org.yazgel.regex.s2m.s2M.impl.S2MPackageImpl#getRuleKeyword()
   * @generated
   */
  int RULE_KEYWORD = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_KEYWORD__NAME = RULE__NAME;

  /**
   * The feature id for the '<em><b>Attr</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_KEYWORD__ATTR = RULE__ATTR;

  /**
   * The feature id for the '<em><b>Start Delimeter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_KEYWORD__START_DELIMETER = RULE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>End Delimeter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_KEYWORD__END_DELIMETER = RULE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Rule Keyword</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_KEYWORD_FEATURE_COUNT = RULE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.yazgel.regex.s2m.s2M.impl.RuleKeywordToIndexImpl <em>Rule Keyword To Index</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.regex.s2m.s2M.impl.RuleKeywordToIndexImpl
   * @see org.yazgel.regex.s2m.s2M.impl.S2MPackageImpl#getRuleKeywordToIndex()
   * @generated
   */
  int RULE_KEYWORD_TO_INDEX = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_KEYWORD_TO_INDEX__NAME = RULE__NAME;

  /**
   * The feature id for the '<em><b>Attr</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_KEYWORD_TO_INDEX__ATTR = RULE__ATTR;

  /**
   * The feature id for the '<em><b>Start Delimeter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_KEYWORD_TO_INDEX__START_DELIMETER = RULE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>End Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_KEYWORD_TO_INDEX__END_INDEX = RULE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Rule Keyword To Index</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_KEYWORD_TO_INDEX_FEATURE_COUNT = RULE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.yazgel.regex.s2m.s2M.AttributeType <em>Attribute Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.regex.s2m.s2M.AttributeType
   * @see org.yazgel.regex.s2m.s2M.impl.S2MPackageImpl#getAttributeType()
   * @generated
   */
  int ATTRIBUTE_TYPE = 7;


  /**
   * Returns the meta object for class '{@link org.yazgel.regex.s2m.s2M.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.yazgel.regex.s2m.s2M.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the attribute '{@link org.yazgel.regex.s2m.s2M.Model#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.yazgel.regex.s2m.s2M.Model#getName()
   * @see #getModel()
   * @generated
   */
  EAttribute getModel_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.yazgel.regex.s2m.s2M.Model#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see org.yazgel.regex.s2m.s2M.Model#getAttributes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Attributes();

  /**
   * Returns the meta object for the containment reference list '{@link org.yazgel.regex.s2m.s2M.Model#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rules</em>'.
   * @see org.yazgel.regex.s2m.s2M.Model#getRules()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Rules();

  /**
   * Returns the meta object for class '{@link org.yazgel.regex.s2m.s2M.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see org.yazgel.regex.s2m.s2M.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link org.yazgel.regex.s2m.s2M.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.yazgel.regex.s2m.s2M.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for the attribute '{@link org.yazgel.regex.s2m.s2M.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see org.yazgel.regex.s2m.s2M.Attribute#getType()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Type();

  /**
   * Returns the meta object for class '{@link org.yazgel.regex.s2m.s2M.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule</em>'.
   * @see org.yazgel.regex.s2m.s2M.Rule
   * @generated
   */
  EClass getRule();

  /**
   * Returns the meta object for the attribute '{@link org.yazgel.regex.s2m.s2M.Rule#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.yazgel.regex.s2m.s2M.Rule#getName()
   * @see #getRule()
   * @generated
   */
  EAttribute getRule_Name();

  /**
   * Returns the meta object for the reference '{@link org.yazgel.regex.s2m.s2M.Rule#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Attr</em>'.
   * @see org.yazgel.regex.s2m.s2M.Rule#getAttr()
   * @see #getRule()
   * @generated
   */
  EReference getRule_Attr();

  /**
   * Returns the meta object for class '{@link org.yazgel.regex.s2m.s2M.RuleIndex <em>Rule Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule Index</em>'.
   * @see org.yazgel.regex.s2m.s2M.RuleIndex
   * @generated
   */
  EClass getRuleIndex();

  /**
   * Returns the meta object for the attribute '{@link org.yazgel.regex.s2m.s2M.RuleIndex#getStartIndex <em>Start Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start Index</em>'.
   * @see org.yazgel.regex.s2m.s2M.RuleIndex#getStartIndex()
   * @see #getRuleIndex()
   * @generated
   */
  EAttribute getRuleIndex_StartIndex();

  /**
   * Returns the meta object for the attribute '{@link org.yazgel.regex.s2m.s2M.RuleIndex#getEndIndex <em>End Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End Index</em>'.
   * @see org.yazgel.regex.s2m.s2M.RuleIndex#getEndIndex()
   * @see #getRuleIndex()
   * @generated
   */
  EAttribute getRuleIndex_EndIndex();

  /**
   * Returns the meta object for class '{@link org.yazgel.regex.s2m.s2M.RuleIndexToKeyword <em>Rule Index To Keyword</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule Index To Keyword</em>'.
   * @see org.yazgel.regex.s2m.s2M.RuleIndexToKeyword
   * @generated
   */
  EClass getRuleIndexToKeyword();

  /**
   * Returns the meta object for the attribute '{@link org.yazgel.regex.s2m.s2M.RuleIndexToKeyword#getStartIndex <em>Start Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start Index</em>'.
   * @see org.yazgel.regex.s2m.s2M.RuleIndexToKeyword#getStartIndex()
   * @see #getRuleIndexToKeyword()
   * @generated
   */
  EAttribute getRuleIndexToKeyword_StartIndex();

  /**
   * Returns the meta object for the attribute '{@link org.yazgel.regex.s2m.s2M.RuleIndexToKeyword#getEndDelimeter <em>End Delimeter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End Delimeter</em>'.
   * @see org.yazgel.regex.s2m.s2M.RuleIndexToKeyword#getEndDelimeter()
   * @see #getRuleIndexToKeyword()
   * @generated
   */
  EAttribute getRuleIndexToKeyword_EndDelimeter();

  /**
   * Returns the meta object for class '{@link org.yazgel.regex.s2m.s2M.RuleKeyword <em>Rule Keyword</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule Keyword</em>'.
   * @see org.yazgel.regex.s2m.s2M.RuleKeyword
   * @generated
   */
  EClass getRuleKeyword();

  /**
   * Returns the meta object for the attribute '{@link org.yazgel.regex.s2m.s2M.RuleKeyword#getStartDelimeter <em>Start Delimeter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start Delimeter</em>'.
   * @see org.yazgel.regex.s2m.s2M.RuleKeyword#getStartDelimeter()
   * @see #getRuleKeyword()
   * @generated
   */
  EAttribute getRuleKeyword_StartDelimeter();

  /**
   * Returns the meta object for the attribute '{@link org.yazgel.regex.s2m.s2M.RuleKeyword#getEndDelimeter <em>End Delimeter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End Delimeter</em>'.
   * @see org.yazgel.regex.s2m.s2M.RuleKeyword#getEndDelimeter()
   * @see #getRuleKeyword()
   * @generated
   */
  EAttribute getRuleKeyword_EndDelimeter();

  /**
   * Returns the meta object for class '{@link org.yazgel.regex.s2m.s2M.RuleKeywordToIndex <em>Rule Keyword To Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule Keyword To Index</em>'.
   * @see org.yazgel.regex.s2m.s2M.RuleKeywordToIndex
   * @generated
   */
  EClass getRuleKeywordToIndex();

  /**
   * Returns the meta object for the attribute '{@link org.yazgel.regex.s2m.s2M.RuleKeywordToIndex#getStartDelimeter <em>Start Delimeter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start Delimeter</em>'.
   * @see org.yazgel.regex.s2m.s2M.RuleKeywordToIndex#getStartDelimeter()
   * @see #getRuleKeywordToIndex()
   * @generated
   */
  EAttribute getRuleKeywordToIndex_StartDelimeter();

  /**
   * Returns the meta object for the attribute '{@link org.yazgel.regex.s2m.s2M.RuleKeywordToIndex#getEndIndex <em>End Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End Index</em>'.
   * @see org.yazgel.regex.s2m.s2M.RuleKeywordToIndex#getEndIndex()
   * @see #getRuleKeywordToIndex()
   * @generated
   */
  EAttribute getRuleKeywordToIndex_EndIndex();

  /**
   * Returns the meta object for enum '{@link org.yazgel.regex.s2m.s2M.AttributeType <em>Attribute Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Attribute Type</em>'.
   * @see org.yazgel.regex.s2m.s2M.AttributeType
   * @generated
   */
  EEnum getAttributeType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  S2MFactory getS2MFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.yazgel.regex.s2m.s2M.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.yazgel.regex.s2m.s2M.impl.ModelImpl
     * @see org.yazgel.regex.s2m.s2M.impl.S2MPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL__NAME = eINSTANCE.getModel_Name();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__ATTRIBUTES = eINSTANCE.getModel_Attributes();

    /**
     * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__RULES = eINSTANCE.getModel_Rules();

    /**
     * The meta object literal for the '{@link org.yazgel.regex.s2m.s2M.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.yazgel.regex.s2m.s2M.impl.AttributeImpl
     * @see org.yazgel.regex.s2m.s2M.impl.S2MPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

    /**
     * The meta object literal for the '{@link org.yazgel.regex.s2m.s2M.impl.RuleImpl <em>Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.yazgel.regex.s2m.s2M.impl.RuleImpl
     * @see org.yazgel.regex.s2m.s2M.impl.S2MPackageImpl#getRule()
     * @generated
     */
    EClass RULE = eINSTANCE.getRule();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE__NAME = eINSTANCE.getRule_Name();

    /**
     * The meta object literal for the '<em><b>Attr</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__ATTR = eINSTANCE.getRule_Attr();

    /**
     * The meta object literal for the '{@link org.yazgel.regex.s2m.s2M.impl.RuleIndexImpl <em>Rule Index</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.yazgel.regex.s2m.s2M.impl.RuleIndexImpl
     * @see org.yazgel.regex.s2m.s2M.impl.S2MPackageImpl#getRuleIndex()
     * @generated
     */
    EClass RULE_INDEX = eINSTANCE.getRuleIndex();

    /**
     * The meta object literal for the '<em><b>Start Index</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE_INDEX__START_INDEX = eINSTANCE.getRuleIndex_StartIndex();

    /**
     * The meta object literal for the '<em><b>End Index</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE_INDEX__END_INDEX = eINSTANCE.getRuleIndex_EndIndex();

    /**
     * The meta object literal for the '{@link org.yazgel.regex.s2m.s2M.impl.RuleIndexToKeywordImpl <em>Rule Index To Keyword</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.yazgel.regex.s2m.s2M.impl.RuleIndexToKeywordImpl
     * @see org.yazgel.regex.s2m.s2M.impl.S2MPackageImpl#getRuleIndexToKeyword()
     * @generated
     */
    EClass RULE_INDEX_TO_KEYWORD = eINSTANCE.getRuleIndexToKeyword();

    /**
     * The meta object literal for the '<em><b>Start Index</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE_INDEX_TO_KEYWORD__START_INDEX = eINSTANCE.getRuleIndexToKeyword_StartIndex();

    /**
     * The meta object literal for the '<em><b>End Delimeter</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE_INDEX_TO_KEYWORD__END_DELIMETER = eINSTANCE.getRuleIndexToKeyword_EndDelimeter();

    /**
     * The meta object literal for the '{@link org.yazgel.regex.s2m.s2M.impl.RuleKeywordImpl <em>Rule Keyword</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.yazgel.regex.s2m.s2M.impl.RuleKeywordImpl
     * @see org.yazgel.regex.s2m.s2M.impl.S2MPackageImpl#getRuleKeyword()
     * @generated
     */
    EClass RULE_KEYWORD = eINSTANCE.getRuleKeyword();

    /**
     * The meta object literal for the '<em><b>Start Delimeter</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE_KEYWORD__START_DELIMETER = eINSTANCE.getRuleKeyword_StartDelimeter();

    /**
     * The meta object literal for the '<em><b>End Delimeter</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE_KEYWORD__END_DELIMETER = eINSTANCE.getRuleKeyword_EndDelimeter();

    /**
     * The meta object literal for the '{@link org.yazgel.regex.s2m.s2M.impl.RuleKeywordToIndexImpl <em>Rule Keyword To Index</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.yazgel.regex.s2m.s2M.impl.RuleKeywordToIndexImpl
     * @see org.yazgel.regex.s2m.s2M.impl.S2MPackageImpl#getRuleKeywordToIndex()
     * @generated
     */
    EClass RULE_KEYWORD_TO_INDEX = eINSTANCE.getRuleKeywordToIndex();

    /**
     * The meta object literal for the '<em><b>Start Delimeter</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE_KEYWORD_TO_INDEX__START_DELIMETER = eINSTANCE.getRuleKeywordToIndex_StartDelimeter();

    /**
     * The meta object literal for the '<em><b>End Index</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE_KEYWORD_TO_INDEX__END_INDEX = eINSTANCE.getRuleKeywordToIndex_EndIndex();

    /**
     * The meta object literal for the '{@link org.yazgel.regex.s2m.s2M.AttributeType <em>Attribute Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.yazgel.regex.s2m.s2M.AttributeType
     * @see org.yazgel.regex.s2m.s2M.impl.S2MPackageImpl#getAttributeType()
     * @generated
     */
    EEnum ATTRIBUTE_TYPE = eINSTANCE.getAttributeType();

  }

} //S2MPackage
