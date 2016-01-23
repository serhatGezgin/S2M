/**
 */
package org.yazgel.regex.s2m.s2M.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.yazgel.regex.s2m.s2M.RuleKeyword;
import org.yazgel.regex.s2m.s2M.S2MPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Keyword</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.yazgel.regex.s2m.s2M.impl.RuleKeywordImpl#getStartDelimeter <em>Start Delimeter</em>}</li>
 *   <li>{@link org.yazgel.regex.s2m.s2M.impl.RuleKeywordImpl#getEndDelimeter <em>End Delimeter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleKeywordImpl extends RuleImpl implements RuleKeyword
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
  protected RuleKeywordImpl()
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
    return S2MPackage.Literals.RULE_KEYWORD;
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
      eNotify(new ENotificationImpl(this, Notification.SET, S2MPackage.RULE_KEYWORD__START_DELIMETER, oldStartDelimeter, startDelimeter));
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
      eNotify(new ENotificationImpl(this, Notification.SET, S2MPackage.RULE_KEYWORD__END_DELIMETER, oldEndDelimeter, endDelimeter));
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
      case S2MPackage.RULE_KEYWORD__START_DELIMETER:
        return getStartDelimeter();
      case S2MPackage.RULE_KEYWORD__END_DELIMETER:
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
      case S2MPackage.RULE_KEYWORD__START_DELIMETER:
        setStartDelimeter((String)newValue);
        return;
      case S2MPackage.RULE_KEYWORD__END_DELIMETER:
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
      case S2MPackage.RULE_KEYWORD__START_DELIMETER:
        setStartDelimeter(START_DELIMETER_EDEFAULT);
        return;
      case S2MPackage.RULE_KEYWORD__END_DELIMETER:
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
      case S2MPackage.RULE_KEYWORD__START_DELIMETER:
        return START_DELIMETER_EDEFAULT == null ? startDelimeter != null : !START_DELIMETER_EDEFAULT.equals(startDelimeter);
      case S2MPackage.RULE_KEYWORD__END_DELIMETER:
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
    result.append(" (startDelimeter: ");
    result.append(startDelimeter);
    result.append(", endDelimeter: ");
    result.append(endDelimeter);
    result.append(')');
    return result.toString();
  }

} //RuleKeywordImpl
