/**
 */
package PRO.impl;

import PRO.PROPackage;
import PRO.Partner;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PRO.impl.PartnerImpl#getId_par <em>Id par</em>}</li>
 *   <li>{@link PRO.impl.PartnerImpl#getName_par <em>Name par</em>}</li>
 *   <li>{@link PRO.impl.PartnerImpl#getCountry_par <em>Country par</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartnerImpl extends MinimalEObjectImpl.Container implements Partner {
	/**
	 * The default value of the '{@link #getId_par() <em>Id par</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId_par()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_PAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId_par() <em>Id par</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId_par()
	 * @generated
	 * @ordered
	 */
	protected String id_par = ID_PAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getName_par() <em>Name par</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_par()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_PAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName_par() <em>Name par</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_par()
	 * @generated
	 * @ordered
	 */
	protected String name_par = NAME_PAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCountry_par() <em>Country par</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry_par()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_PAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountry_par() <em>Country par</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry_par()
	 * @generated
	 * @ordered
	 */
	protected String country_par = COUNTRY_PAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartnerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PROPackage.Literals.PARTNER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId_par() {
		return id_par;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId_par(String newId_par) {
		String oldId_par = id_par;
		id_par = newId_par;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PROPackage.PARTNER__ID_PAR, oldId_par, id_par));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName_par() {
		return name_par;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName_par(String newName_par) {
		String oldName_par = name_par;
		name_par = newName_par;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PROPackage.PARTNER__NAME_PAR, oldName_par, name_par));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountry_par() {
		return country_par;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry_par(String newCountry_par) {
		String oldCountry_par = country_par;
		country_par = newCountry_par;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PROPackage.PARTNER__COUNTRY_PAR, oldCountry_par, country_par));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PROPackage.PARTNER__ID_PAR:
				return getId_par();
			case PROPackage.PARTNER__NAME_PAR:
				return getName_par();
			case PROPackage.PARTNER__COUNTRY_PAR:
				return getCountry_par();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PROPackage.PARTNER__ID_PAR:
				setId_par((String)newValue);
				return;
			case PROPackage.PARTNER__NAME_PAR:
				setName_par((String)newValue);
				return;
			case PROPackage.PARTNER__COUNTRY_PAR:
				setCountry_par((String)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case PROPackage.PARTNER__ID_PAR:
				setId_par(ID_PAR_EDEFAULT);
				return;
			case PROPackage.PARTNER__NAME_PAR:
				setName_par(NAME_PAR_EDEFAULT);
				return;
			case PROPackage.PARTNER__COUNTRY_PAR:
				setCountry_par(COUNTRY_PAR_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PROPackage.PARTNER__ID_PAR:
				return ID_PAR_EDEFAULT == null ? id_par != null : !ID_PAR_EDEFAULT.equals(id_par);
			case PROPackage.PARTNER__NAME_PAR:
				return NAME_PAR_EDEFAULT == null ? name_par != null : !NAME_PAR_EDEFAULT.equals(name_par);
			case PROPackage.PARTNER__COUNTRY_PAR:
				return COUNTRY_PAR_EDEFAULT == null ? country_par != null : !COUNTRY_PAR_EDEFAULT.equals(country_par);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id_par: ");
		result.append(id_par);
		result.append(", name_par: ");
		result.append(name_par);
		result.append(", country_par: ");
		result.append(country_par);
		result.append(')');
		return result.toString();
	}

} //PartnerImpl
