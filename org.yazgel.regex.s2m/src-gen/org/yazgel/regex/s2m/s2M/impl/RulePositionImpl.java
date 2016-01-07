/**
 */
package org.yazgel.regex.s2m.s2M.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.yazgel.regex.s2m.s2M.Attribute;
import org.yazgel.regex.s2m.s2M.RulePosition;
import org.yazgel.regex.s2m.s2M.S2MPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.yazgel.regex.s2m.s2M.impl.RulePositionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.yazgel.regex.s2m.s2M.impl.RulePositionImpl#getStartIndex <em>Start Index</em>}</li>
 *   <li>{@link org.yazgel.regex.s2m.s2M.impl.RulePositionImpl#getStartDelimeter <em>Start Delimeter</em>}</li>
 *   <li>{@link org.yazgel.regex.s2m.s2M.impl.RulePositionImpl#getEndIndex <em>End Index</em>}</li>
 *   <li>{@link org.yazgel.regex.s2m.s2M.impl.RulePositionImpl#getEndDelimeter <em>End Delimeter</em>}</li>
 *   <li>{@link org.yazgel.regex.s2m.s2M.impl.RulePositionImpl#getAttr <em>Attr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RulePositionImpl extends RuleImpl implements RulePosition
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

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
   * The cached value of the '{@link #getAttr() <em>Attr</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttr()
   * @generated
   * @ordered
   */
  protected Attribute attr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RulePositionImpl()
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
    return S2MPackage.Literals.RULE_POSITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, S2MPackage.RULE_POSITION__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, S2MPackage.RULE_POSITION__START_INDEX, oldStartIndex, startIndex));
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
      eNotify(new ENotificationImpl(this, Notification.SET, S2MPackage.RULE_POSITION__START_DELIMETER, oldStartDelimeter, startDelimeter));
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
      eNotify(new ENotificationImpl(this, Notification.SET, S2MPackage.RULE_POSITION__END_INDEX, oldEndIndex, endIndex));
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
      eNotify(new ENotificationImpl(this, Notification.SET, S2MPackage.RULE_POSITION__END_DELIMETER, oldEndDelimeter, endDelimeter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute getAttr()
  {
    if (attr != null && attr.eIsProxy())
    {
      InternalEObject oldAttr = (InternalEObject)attr;
      attr = (Attribute)eResolveProxy(oldAttr);
      if (attr != oldAttr)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, S2MPackage.RULE_POSITION__ATTR, oldAttr, attr));
      }
    }
    return attr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute basicGetAttr()
  {
    return attr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttr(Attribute newAttr)
  {
    Attribute oldAttr = attr;
    attr = newAttr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, S2MPackage.RULE_POSITION__ATTR, oldAttr, attr));
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
      case S2MPackage.RULE_POSITION__NAME:
        return getName();
      case S2MPackage.RULE_POSITION__START_INDEX:
        return getStartIndex();
      case S2MPackage.RULE_POSITION__START_DELIMETER:
        return getStartDelimeter();
      case S2MPackage.RULE_POSITION__END_INDEX:
        return getEndIndex();
      case S2MPackage.RULE_POSITION__END_DELIMETER:
        return getEndDelimeter();
      case S2MPackage.RULE_POSITION__ATTR:
        if (resolve) return getAttr();
        return basicGetAttr();
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
      case S2MPackage.RULE_POSITION__NAME:
        setName((String)newValue);
        return;
      case S2MPackage.RULE_POSITION__START_INDEX:
        setStartIndex((Integer)newValue);
        return;
      case S2MPackage.RULE_POSITION__START_DELIMETER:
        setStartDelimeter((String)newValue);
        return;
      case S2MPackage.RULE_POSITION__END_INDEX:
        setEndIndex((Integer)newValue);
        return;
      case S2MPackage.RULE_POSITION__END_DELIMETER:
        setEndDelimeter((String)newValue);
        return;
      case S2MPackage.RULE_POSITION__ATTR:
        setAttr((Attribute)newValue);
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
      case S2MPackage.RULE_POSITION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case S2MPackage.RULE_POSITION__START_INDEX:
        setStartIndex(START_INDEX_EDEFAULT);
        return;
      case S2MPackage.RULE_POSITION__START_DELIMETER:
        setStartDelimeter(START_DELIMETER_EDEFAULT);
        return;
      case S2MPackage.RULE_POSITION__END_INDEX:
        setEndIndex(END_INDEX_EDEFAULT);
        return;
      case S2MPackage.RULE_POSITION__END_DELIMETER:
        setEndDelimeter(END_DELIMETER_EDEFAULT);
        return;
      case S2MPackage.RULE_POSITION__ATTR:
        setAttr((Attribute)null);
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
      case S2MPackage.RULE_POSITION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case S2MPackage.RULE_POSITION__START_INDEX:
        return startIndex != START_INDEX_EDEFAULT;
      case S2MPackage.RULE_POSITION__START_DELIMETER:
        return START_DELIMETER_EDEFAULT == null ? startDelimeter != null : !START_DELIMETER_EDEFAULT.equals(startDelimeter);
      case S2MPackage.RULE_POSITION__END_INDEX:
        return endIndex != END_INDEX_EDEFAULT;
      case S2MPackage.RULE_POSITION__END_DELIMETER:
        return END_DELIMETER_EDEFAULT == null ? endDelimeter != null : !END_DELIMETER_EDEFAULT.equals(endDelimeter);
      case S2MPackage.RULE_POSITION__ATTR:
        return attr != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", startIndex: ");
    result.append(startIndex);
    result.append(", startDelimeter: ");
    result.append(startDelimeter);
    result.append(", endIndex: ");
    result.append(endIndex);
    result.append(", endDelimeter: ");
    result.append(endDelimeter);
    result.append(')');
    return result.toString();
  }

} //RulePositionImpl
