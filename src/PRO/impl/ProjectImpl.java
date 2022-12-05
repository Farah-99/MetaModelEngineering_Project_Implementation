/**
 */
package PRO.impl;

import PRO.PROPackage;
import PRO.Partner;
import PRO.Project;
import PRO.Rule;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PRO.impl.ProjectImpl#getId_proj <em>Id proj</em>}</li>
 *   <li>{@link PRO.impl.ProjectImpl#getName_proj <em>Name proj</em>}</li>
 *   <li>{@link PRO.impl.ProjectImpl#getDuration_proj <em>Duration proj</em>}</li>
 *   <li>{@link PRO.impl.ProjectImpl#getPartners <em>Partners</em>}</li>
 *   <li>{@link PRO.impl.ProjectImpl#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectImpl extends MinimalEObjectImpl.Container implements Project {
	/**
	 * The default value of the '{@link #getId_proj() <em>Id proj</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId_proj()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_PROJ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId_proj() <em>Id proj</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId_proj()
	 * @generated
	 * @ordered
	 */
	protected String id_proj = ID_PROJ_EDEFAULT;

	/**
	 * The default value of the '{@link #getName_proj() <em>Name proj</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_proj()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_PROJ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName_proj() <em>Name proj</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName_proj()
	 * @generated
	 * @ordered
	 */
	protected String name_proj = NAME_PROJ_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration_proj() <em>Duration proj</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration_proj()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_PROJ_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration_proj() <em>Duration proj</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration_proj()
	 * @generated
	 * @ordered
	 */
	protected int duration_proj = DURATION_PROJ_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPartners() <em>Partners</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartners()
	 * @generated
	 * @ordered
	 */
	protected EList<Partner> partners;

	/**
	 * The cached value of the '{@link #getRules() <em>Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRules()
	 * @generated
	 * @ordered
	 */
	protected EList<Rule> rules;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PROPackage.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId_proj() {
		return id_proj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId_proj(String newId_proj) {
		String oldId_proj = id_proj;
		id_proj = newId_proj;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PROPackage.PROJECT__ID_PROJ, oldId_proj, id_proj));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName_proj() {
		return name_proj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName_proj(String newName_proj) {
		String oldName_proj = name_proj;
		name_proj = newName_proj;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PROPackage.PROJECT__NAME_PROJ, oldName_proj, name_proj));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDuration_proj() {
		return duration_proj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration_proj(int newDuration_proj) {
		int oldDuration_proj = duration_proj;
		duration_proj = newDuration_proj;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PROPackage.PROJECT__DURATION_PROJ, oldDuration_proj, duration_proj));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Partner> getPartners() {
		if (partners == null) {
			partners = new EObjectContainmentEList<Partner>(Partner.class, this, PROPackage.PROJECT__PARTNERS);
		}
		return partners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<Rule>(Rule.class, this, PROPackage.PROJECT__RULES);
		}
		return rules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PROPackage.PROJECT__PARTNERS:
				return ((InternalEList<?>)getPartners()).basicRemove(otherEnd, msgs);
			case PROPackage.PROJECT__RULES:
				return ((InternalEList<?>)getRules()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PROPackage.PROJECT__ID_PROJ:
				return getId_proj();
			case PROPackage.PROJECT__NAME_PROJ:
				return getName_proj();
			case PROPackage.PROJECT__DURATION_PROJ:
				return getDuration_proj();
			case PROPackage.PROJECT__PARTNERS:
				return getPartners();
			case PROPackage.PROJECT__RULES:
				return getRules();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PROPackage.PROJECT__ID_PROJ:
				setId_proj((String)newValue);
				return;
			case PROPackage.PROJECT__NAME_PROJ:
				setName_proj((String)newValue);
				return;
			case PROPackage.PROJECT__DURATION_PROJ:
				setDuration_proj((Integer)newValue);
				return;
			case PROPackage.PROJECT__PARTNERS:
				getPartners().clear();
				getPartners().addAll((Collection<? extends Partner>)newValue);
				return;
			case PROPackage.PROJECT__RULES:
				getRules().clear();
				getRules().addAll((Collection<? extends Rule>)newValue);
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
			case PROPackage.PROJECT__ID_PROJ:
				setId_proj(ID_PROJ_EDEFAULT);
				return;
			case PROPackage.PROJECT__NAME_PROJ:
				setName_proj(NAME_PROJ_EDEFAULT);
				return;
			case PROPackage.PROJECT__DURATION_PROJ:
				setDuration_proj(DURATION_PROJ_EDEFAULT);
				return;
			case PROPackage.PROJECT__PARTNERS:
				getPartners().clear();
				return;
			case PROPackage.PROJECT__RULES:
				getRules().clear();
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
			case PROPackage.PROJECT__ID_PROJ:
				return ID_PROJ_EDEFAULT == null ? id_proj != null : !ID_PROJ_EDEFAULT.equals(id_proj);
			case PROPackage.PROJECT__NAME_PROJ:
				return NAME_PROJ_EDEFAULT == null ? name_proj != null : !NAME_PROJ_EDEFAULT.equals(name_proj);
			case PROPackage.PROJECT__DURATION_PROJ:
				return duration_proj != DURATION_PROJ_EDEFAULT;
			case PROPackage.PROJECT__PARTNERS:
				return partners != null && !partners.isEmpty();
			case PROPackage.PROJECT__RULES:
				return rules != null && !rules.isEmpty();
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
		result.append(" (id_proj: ");
		result.append(id_proj);
		result.append(", name_proj: ");
		result.append(name_proj);
		result.append(", duration_proj: ");
		result.append(duration_proj);
		result.append(')');
		return result.toString();
	}

} //ProjectImpl
