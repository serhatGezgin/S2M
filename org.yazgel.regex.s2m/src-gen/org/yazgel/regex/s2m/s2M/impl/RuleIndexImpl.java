/**
 */
package org.yazgel.regex.s2m.s2M.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.yazgel.regex.s2m.s2M.RuleIndex;
import org.yazgel.regex.s2m.s2M.S2MPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Index</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.yazgel.regex.s2m.s2M.impl.RuleIndexImpl#getStartIndex <em>Start Index</em>}</li>
 *   <li>{@link org.yazgel.regex.s2m.s2M.impl.RuleIndexImpl#getEndIndex <em>End Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleIndexImpl extends RuleImpl implements RuleIndex
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
  protected RuleIndexImpl()
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
    return S2MPackage.Literals.RULE_INDEX;
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
      eNotify(new ENotificationImpl(this, Notification.SET, S2MPackage.RULE_INDEX__START_INDEX, oldStartIndex, startIndex));
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
      eNotify(new ENotificationImpl(this, Notification.SET, S2MPackage.RULE_INDEX__END_INDEX, oldEndIndex, endIndex));
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
      case S2MPackage.RULE_INDEX__START_INDEX:
        return getStartIndex();
      case S2MPackage.RULE_INDEX__END_INDEX:
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
      case S2MPackage.RULE_INDEX__START_INDEX:
        setStartIndex((Integer)newValue);
        return;
      case S2MPackage.RULE_INDEX__END_INDEX:
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
      case S2MPackage.RULE_INDEX__START_INDEX:
        setStartIndex(START_INDEX_EDEFAULT);
        return;
      case S2MPackage.RULE_INDEX__END_INDEX:
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
      case S2MPackage.RULE_INDEX__START_INDEX:
        return startIndex != START_INDEX_EDEFAULT;
      case S2MPackage.RULE_INDEX__END_INDEX:
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
    result.append(" (startIndex: ");
    result.append(startIndex);
    result.append(", endIndex: ");
    result.append(endIndex);
    result.append(')');
    return result.toString();
  }

} //RuleIndexImpl
