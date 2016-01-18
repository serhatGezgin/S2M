/**
 */
package org.yazgel.regex.s2m.s2M.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.yazgel.regex.s2m.s2M.RuleIndexToKeyword;
import org.yazgel.regex.s2m.s2M.S2MPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Index To Keyword</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.yazgel.regex.s2m.s2M.impl.RuleIndexToKeywordImpl#getStartIndex <em>Start Index</em>}</li>
 *   <li>{@link org.yazgel.regex.s2m.s2M.impl.RuleIndexToKeywordImpl#getEndDelimeter <em>End Delimeter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleIndexToKeywordImpl extends RuleImpl implements RuleIndexToKeyword
{
  /**
   * The default value of the '{@link #getStartIndex() <em>Start Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartIndex()
   * @generated
   * @ordered
   */
  protected static final int START_INDEX_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getStartIndex() <em>Start Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartIndex()
   * @generated
   * @ordered
   */
  protected int startIndex = START_INDEX_EDEFAULT;

  /**
   * The default value of the '{@link #getEndDelimeter() <em>End Delimeter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndDelimeter()
   * @generated
   * @ordered
   */
  protected static final String END_DELIMETER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEndDelimeter() <em>End Delimeter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndDelimeter()
   * @generated
   * @ordered
   */
  protected String endDelimeter = END_DELIMETER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RuleIndexToKeywordImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return S2MPackage.Literals.RULE_INDEX_TO_KEYWORD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getStartIndex()
  {
    return startIndex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStartIndex(int newStartIndex)
  {
    int oldStartIndex = startIndex;
    startIndex = newStartIndex;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, S2MPackage.RULE_INDEX_TO_KEYWORD__START_INDEX, oldStartIndex, startIndex));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEndDelimeter()
  {
    return endDelimeter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEndDelimeter(String newEndDelimeter)
  {
    String oldEndDelimeter = endDelimeter;
    endDelimeter = newEndDelimeter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, S2MPackage.RULE_INDEX_TO_KEYWORD__END_DELIMETER, oldEndDelimeter, endDelimeter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case S2MPackage.RULE_INDEX_TO_KEYWORD__START_INDEX:
        return getStartIndex();
      case S2MPackage.RULE_INDEX_TO_KEYWORD__END_DELIMETER:
        return getEndDelimeter();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case S2MPackage.RULE_INDEX_TO_KEYWORD__START_INDEX:
        setStartIndex((Integer)newValue);
        return;
      case S2MPackage.RULE_INDEX_TO_KEYWORD__END_DELIMETER:
        setEndDelimeter((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case S2MPackage.RULE_INDEX_TO_KEYWORD__START_INDEX:
        setStartIndex(START_INDEX_EDEFAULT);
        return;
      case S2MPackage.RULE_INDEX_TO_KEYWORD__END_DELIMETER:
        setEndDelimeter(END_DELIMETER_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case S2MPackage.RULE_INDEX_TO_KEYWORD__START_INDEX:
        return startIndex != START_INDEX_EDEFAULT;
      case S2MPackage.RULE_INDEX_TO_KEYWORD__END_DELIMETER:
        return END_DELIMETER_EDEFAULT == null ? endDelimeter != null : !END_DELIMETER_EDEFAULT.equals(endDelimeter);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (startIndex: ");
    result.append(startIndex);
    result.append(", endDelimeter: ");
    result.append(endDelimeter);
    result.append(')');
    return result.toString();
  }

} //RuleIndexToKeywordImpl
