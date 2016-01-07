/**
 */
package org.yazgel.regex.s2m.s2M;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
   * The feature id for the '<em><b>Type</b></em>' reference.
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
   * The number of structural features of the '<em>Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.yazgel.regex.s2m.s2M.impl.RulePositionImpl <em>Rule Position</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.yazgel.regex.s2m.s2M.impl.RulePositionImpl
   * @see org.yazgel.regex.s2m.s2M.impl.S2MPackageImpl#getRulePosition()
   * @generated
   */
  int RULE_POSITION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_POSITION__NAME = RULE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Start Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_POSITION__START_INDEX = RULE_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Start Delimeter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_POSITION__START_DELIMETER = RULE_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>End Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_POSITION__END_INDEX = RULE_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>End Delimeter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_POSITION__END_DELIMETER = RULE_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Attr</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_POSITION__ATTR = RULE_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Rule Position</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_POSITION_FEATURE_COUNT = RULE_FEATURE_COUNT + 6;


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
   * Returns the meta object for the reference '{@link org.yazgel.regex.s2m.s2M.Attribute#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see org.yazgel.regex.s2m.s2M.Attribute#getType()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Type();

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
   * Returns the meta object for class '{@link org.yazgel.regex.s2m.s2M.RulePosition <em>Rule Position</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule Position</em>'.
   * @see org.yazgel.regex.s2m.s2M.RulePosition
   * @generated
   */
  EClass getRulePosition();

  /**
   * Returns the meta object for the attribute '{@link org.yazgel.regex.s2m.s2M.RulePosition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.yazgel.regex.s2m.s2M.RulePosition#getName()
   * @see #getRulePosition()
   * @generated
   */
  EAttribute getRulePosition_Name();

  /**
   * Returns the meta object for the attribute '{@link org.yazgel.regex.s2m.s2M.RulePosition#getStartIndex <em>Start Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start Index</em>'.
   * @see org.yazgel.regex.s2m.s2M.RulePosition#getStartIndex()
   * @see #getRulePosition()
   * @generated
   */
  EAttribute getRulePosition_StartIndex();

  /**
   * Returns the meta object for the attribute '{@link org.yazgel.regex.s2m.s2M.RulePosition#getStartDelimeter <em>Start Delimeter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Start Delimeter</em>'.
   * @see org.yazgel.regex.s2m.s2M.RulePosition#getStartDelimeter()
   * @see #getRulePosition()
   * @generated
   */
  EAttribute getRulePosition_StartDelimeter();

  /**
   * Returns the meta object for the attribute '{@link org.yazgel.regex.s2m.s2M.RulePosition#getEndIndex <em>End Index</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End Index</em>'.
   * @see org.yazgel.regex.s2m.s2M.RulePosition#getEndIndex()
   * @see #getRulePosition()
   * @generated
   */
  EAttribute getRulePosition_EndIndex();

  /**
   * Returns the meta object for the attribute '{@link org.yazgel.regex.s2m.s2M.RulePosition#getEndDelimeter <em>End Delimeter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>End Delimeter</em>'.
   * @see org.yazgel.regex.s2m.s2M.RulePosition#getEndDelimeter()
   * @see #getRulePosition()
   * @generated
   */
  EAttribute getRulePosition_EndDelimeter();

  /**
   * Returns the meta object for the reference '{@link org.yazgel.regex.s2m.s2M.RulePosition#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Attr</em>'.
   * @see org.yazgel.regex.s2m.s2M.RulePosition#getAttr()
   * @see #getRulePosition()
   * @generated
   */
  EReference getRulePosition_Attr();

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
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

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
     * The meta object literal for the '{@link org.yazgel.regex.s2m.s2M.impl.RulePositionImpl <em>Rule Position</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.yazgel.regex.s2m.s2M.impl.RulePositionImpl
     * @see org.yazgel.regex.s2m.s2M.impl.S2MPackageImpl#getRulePosition()
     * @generated
     */
    EClass RULE_POSITION = eINSTANCE.getRulePosition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE_POSITION__NAME = eINSTANCE.getRulePosition_Name();

    /**
     * The meta object literal for the '<em><b>Start Index</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE_POSITION__START_INDEX = eINSTANCE.getRulePosition_StartIndex();

    /**
     * The meta object literal for the '<em><b>Start Delimeter</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE_POSITION__START_DELIMETER = eINSTANCE.getRulePosition_StartDelimeter();

    /**
     * The meta object literal for the '<em><b>End Index</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE_POSITION__END_INDEX = eINSTANCE.getRulePosition_EndIndex();

    /**
     * The meta object literal for the '<em><b>End Delimeter</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE_POSITION__END_DELIMETER = eINSTANCE.getRulePosition_EndDelimeter();

    /**
     * The meta object literal for the '<em><b>Attr</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE_POSITION__ATTR = eINSTANCE.getRulePosition_Attr();

  }

} //S2MPackage
