/**
 */
package PRO.impl;

import PRO.Deliverable;
import PRO.PROPackage;
import PRO.Partner;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Deliverable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PRO.impl.DeliverableImpl#getTitle_del <em>Title del</em>}</li>
 *   <li>{@link PRO.impl.DeliverableImpl#getDue_del <em>Due del</em>}</li>
 *   <li>{@link PRO.impl.DeliverableImpl#getNature_del <em>Nature del</em>}</li>
 *   <li>{@link PRO.impl.DeliverableImpl#getPartner <em>Partner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeliverableImpl extends MinimalEObjectImpl.Container implements Deliverable {
	/**
	 * The default value of the '{@link #getTitle_del() <em>Title del</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle_del()
	 * @generated
	 * @ordered
	 */
	protected static final int TITLE_DEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTitle_del() <em>Title del</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle_del()
	 * @generated
	 * @ordered
	 */
	protected int title_del = TITLE_DEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDue_del() <em>Due del</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDue_del()
	 * @generated
	 * @ordered
	 */
	protected static final int DUE_DEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDue_del() <em>Due del</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDue_del()
	 * @generated
	 * @ordered
	 */
	protected int due_del = DUE_DEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getNature_del() <em>Nature del</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNature_del()
	 * @generated
	 * @ordered
	 */
	protected static final String NATURE_DEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNature_del() <em>Nature del</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNature_del()
	 * @generated
	 * @ordered
	 */
	protected String nature_del = NATURE_DEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPartner() <em>Partner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartner()
	 * @generated
	 * @ordered
	 */
	protected Partner partner;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeliverableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PROPackage.Literals.DELIVERABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTitle_del() {
		return title_del;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle_del(int newTitle_del) {
		int oldTitle_del = title_del;
		title_del = newTitle_del;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PROPackage.DELIVERABLE__TITLE_DEL, oldTitle_del, title_del));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDue_del() {
		return due_del;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDue_del(int newDue_del) {
		int oldDue_del = due_del;
		due_del = newDue_del;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PROPackage.DELIVERABLE__DUE_DEL, oldDue_del, due_del));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNature_del() {
		return nature_del;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNature_del(String newNature_del) {
		String oldNature_del = nature_del;
		nature_del = newNature_del;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PROPackage.DELIVERABLE__NATURE_DEL, oldNature_del, nature_del));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Partner getPartner() {
		if (partner != null && partner.eIsProxy()) {
			InternalEObject oldPartner = (InternalEObject)partner;
			partner = (Partner)eResolveProxy(oldPartner);
			if (partner != oldPartner) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PROPackage.DELIVERABLE__PARTNER, oldPartner, partner));
			}
		}
		return partner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Partner basicGetPartner() {
		return partner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPartner(Partner newPartner) {
		Partner oldPartner = partner;
		partner = newPartner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PROPackage.DELIVERABLE__PARTNER, oldPartner, partner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PROPackage.DELIVERABLE__TITLE_DEL:
				return getTitle_del();
			case PROPackage.DELIVERABLE__DUE_DEL:
				return getDue_del();
			case PROPackage.DELIVERABLE__NATURE_DEL:
				return getNature_del();
			case PROPackage.DELIVERABLE__PARTNER:
				if (resolve) return getPartner();
				return basicGetPartner();
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
			case PROPackage.DELIVERABLE__TITLE_DEL:
				setTitle_del((Integer)newValue);
				return;
			case PROPackage.DELIVERABLE__DUE_DEL:
				setDue_del((Integer)newValue);
				return;
			case PROPackage.DELIVERABLE__NATURE_DEL:
				setNature_del((String)newValue);
				return;
			case PROPackage.DELIVERABLE__PARTNER:
				setPartner((Partner)newValue);
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
			case PROPackage.DELIVERABLE__TITLE_DEL:
				setTitle_del(TITLE_DEL_EDEFAULT);
				return;
			case PROPackage.DELIVERABLE__DUE_DEL:
				setDue_del(DUE_DEL_EDEFAULT);
				return;
			case PROPackage.DELIVERABLE__NATURE_DEL:
				setNature_del(NATURE_DEL_EDEFAULT);
				return;
			case PROPackage.DELIVERABLE__PARTNER:
				setPartner((Partner)null);
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
			case PROPackage.DELIVERABLE__TITLE_DEL:
				return title_del != TITLE_DEL_EDEFAULT;
			case PROPackage.DELIVERABLE__DUE_DEL:
				return due_del != DUE_DEL_EDEFAULT;
			case PROPackage.DELIVERABLE__NATURE_DEL:
				return NATURE_DEL_EDEFAULT == null ? nature_del != null : !NATURE_DEL_EDEFAULT.equals(nature_del);
			case PROPackage.DELIVERABLE__PARTNER:
				return partner != null;
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
		result.append(" (title_del: ");
		result.append(title_del);
		result.append(", due_del: ");
		result.append(due_del);
		result.append(", nature_del: ");
		result.append(nature_del);
		result.append(')');
		return result.toString();
	}

} //DeliverableImpl
