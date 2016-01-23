/**
 */
package org.yazgel.regex.s2m.s2M.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.yazgel.regex.s2m.s2M.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class S2MFactoryImpl extends EFactoryImpl implements S2MFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static S2MFactory init()
  {
    try
    {
      S2MFactory theS2MFactory = (S2MFactory)EPackage.Registry.INSTANCE.getEFactory(S2MPackage.eNS_URI);
      if (theS2MFactory != null)
      {
        return theS2MFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new S2MFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public S2MFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case S2MPackage.MODEL: return createModel();
      case S2MPackage.ATTRIBUTE: return createAttribute();
      case S2MPackage.RULE: return createRule();
      case S2MPackage.RULE_INDEX: return createRuleIndex();
      case S2MPackage.RULE_INDEX_TO_KEYWORD: return createRuleIndexToKeyword();
      case S2MPackage.RULE_KEYWORD: return createRuleKeyword();
      case S2MPackage.RULE_KEYWORD_TO_INDEX: return createRuleKeywordToIndex();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case S2MPackage.ATTRIBUTE_TYPE:
        return createAttributeTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case S2MPackage.ATTRIBUTE_TYPE:
        return convertAttributeTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rule createRule()
  {
    RuleImpl rule = new RuleImpl();
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleIndex createRuleIndex()
  {
    RuleIndexImpl ruleIndex = new RuleIndexImpl();
    return ruleIndex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleIndexToKeyword createRuleIndexToKeyword()
  {
    RuleIndexToKeywordImpl ruleIndexToKeyword = new RuleIndexToKeywordImpl();
    return ruleIndexToKeyword;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleKeyword createRuleKeyword()
  {
    RuleKeywordImpl ruleKeyword = new RuleKeywordImpl();
    return ruleKeyword;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleKeywordToIndex createRuleKeywordToIndex()
  {
    RuleKeywordToIndexImpl ruleKeywordToIndex = new RuleKeywordToIndexImpl();
    return ruleKeywordToIndex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeType createAttributeTypeFromString(EDataType eDataType, String initialValue)
  {
    AttributeType result = AttributeType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAttributeTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public S2MPackage getS2MPackage()
  {
    return (S2MPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static S2MPackage getPackage()
  {
    return S2MPackage.eINSTANCE;
  }

} //S2MFactoryImpl
