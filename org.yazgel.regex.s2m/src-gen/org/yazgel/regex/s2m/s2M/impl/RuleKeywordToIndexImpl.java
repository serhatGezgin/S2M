/**
 */
package org.yazgel.regex.s2m.s2M.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.yazgel.regex.s2m.s2M.RuleKeywordToIndex;
import org.yazgel.regex.s2m.s2M.S2MPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Keyword To Index</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.yazgel.regex.s2m.s2M.impl.RuleKeywordToIndexImpl#getStartDelimeter <em>Start Delimeter</em>}</li>
 *   <li>{@link org.yazgel.regex.s2m.s2M.impl.RuleKeywordToIndexImpl#getEndIndex <em>End Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleKeywordToIndexImpl extends RuleImpl implements RuleKeywordToIndex
{
  /**
   * The default value of the '{@link #getStartDelimeter() <em>Start Delimeter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartDelimeter()
   * @generated
   * @ordered
   */
  protected static final String START_DELIMETER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStartDelimeter() <em>Start Delimeter</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStartDelimeter()
   * @generated
   * @ordered
   */
  protected String startDelimeter = START_DELIMETER_EDEFAULT;

  /**
   * The default value of the '{@link #getEndIndex() <em>End Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndIndex()
   * @generated
   * @ordered
   */
  protected static final int END_INDEX_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getEndIndex() <em>End Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEndIndex()
   * @generated
   * @ordered
   */
  protected int endIndex = END_INDEX_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RuleKeywordToIndexImpl()
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
    return S2MPackage.Literals.RULE_KEYWORD_TO_INDEX;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStartDelimeter()
  {
    return startDelimeter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStartDelimeter(String newStartDelimeter)
  {
    String oldStartDelimeter = startDelimeter;
    startDelimeter = newStartDelimeter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, S2MPackage.RULE_KEYWORD_TO_INDEX__START_DELIMETER, oldStartDelimeter, startDelimeter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getEndIndex()
  {
    return endIndex;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEndIndex(int newEndIndex)
  {
    int oldEndIndex = endIndex;
    endIndex = newEndIndex;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, S2MPackage.RULE_KEYWORD_TO_INDEX__END_INDEX, oldEndIndex, endIndex));
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
      case S2MPackage.RULE_KEYWORD_TO_INDEX__START_DELIMETER:
        return getStartDelimeter();
      case S2MPackage.RULE_KEYWORD_TO_INDEX__END_INDEX:
        return getEndIndex();
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
      case S2MPackage.RULE_KEYWORD_TO_INDEX__START_DELIMETER:
        setStartDelimeter((String)newValue);
        return;
      case S2MPackage.RULE_KEYWORD_TO_INDEX__END_INDEX:
        setEndIndex((Integer)newValue);
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
      case S2MPackage.RULE_KEYWORD_TO_INDEX__START_DELIMETER:
        setStartDelimeter(START_DELIMETER_EDEFAULT);
        return;
      case S2MPackage.RULE_KEYWORD_TO_INDEX__END_INDEX:
        setEndIndex(END_INDEX_EDEFAULT);
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
      case S2MPackage.RULE_KEYWORD_TO_INDEX__START_DELIMETER:
        return START_DELIMETER_EDEFAULT == null ? startDelimeter != null : !START_DELIMETER_EDEFAULT.equals(startDelimeter);
      case S2MPackage.RULE_KEYWORD_TO_INDEX__END_INDEX:
        return endIndex != END_INDEX_EDEFAULT;
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
    result.append(" (startDelimeter: ");
    result.append(startDelimeter);
    result.append(", endIndex: ");
    result.append(endIndex);
    result.append(')');
    return result.toString();
  }

} //RuleKeywordToIndexImpl
