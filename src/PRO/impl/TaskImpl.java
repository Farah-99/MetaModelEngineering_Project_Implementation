/**
 */
package PRO.impl;

import PRO.PROPackage;
import PRO.Partner;
import PRO.Task;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PRO.impl.TaskImpl#getId_task <em>Id task</em>}</li>
 *   <li>{@link PRO.impl.TaskImpl#getTitle_task <em>Title task</em>}</li>
 *   <li>{@link PRO.impl.TaskImpl#getStart_task <em>Start task</em>}</li>
 *   <li>{@link PRO.impl.TaskImpl#getEnd_task <em>End task</em>}</li>
 *   <li>{@link PRO.impl.TaskImpl#getPartners <em>Partners</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl extends MinimalEObjectImpl.Container implements Task {
	/**
	 * The default value of the '{@link #getId_task() <em>Id task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId_task()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_TASK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId_task() <em>Id task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId_task()
	 * @generated
	 * @ordered
	 */
	protected String id_task = ID_TASK_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle_task() <em>Title task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle_task()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_TASK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle_task() <em>Title task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle_task()
	 * @generated
	 * @ordered
	 */
	protected String title_task = TITLE_TASK_EDEFAULT;

	/**
	 * The default value of the '{@link #getStart_task() <em>Start task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart_task()
	 * @generated
	 * @ordered
	 */
	protected static final int START_TASK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStart_task() <em>Start task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart_task()
	 * @generated
	 * @ordered
	 */
	protected int start_task = START_TASK_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd_task() <em>End task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd_task()
	 * @generated
	 * @ordered
	 */
	protected static final int END_TASK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEnd_task() <em>End task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd_task()
	 * @generated
	 * @ordered
	 */
	protected int end_task = END_TASK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPartners() <em>Partners</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartners()
	 * @generated
	 * @ordered
	 */
	protected EList<Partner> partners;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PROPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId_task() {
		return id_task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId_task(String newId_task) {
		String oldId_task = id_task;
		id_task = newId_task;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PROPackage.TASK__ID_TASK, oldId_task, id_task));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle_task() {
		return title_task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle_task(String newTitle_task) {
		String oldTitle_task = title_task;
		title_task = newTitle_task;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PROPackage.TASK__TITLE_TASK, oldTitle_task, title_task));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStart_task() {
		return start_task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart_task(int newStart_task) {
		int oldStart_task = start_task;
		start_task = newStart_task;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PROPackage.TASK__START_TASK, oldStart_task, start_task));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEnd_task() {
		return end_task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd_task(int newEnd_task) {
		int oldEnd_task = end_task;
		end_task = newEnd_task;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PROPackage.TASK__END_TASK, oldEnd_task, end_task));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Partner> getPartners() {
		if (partners == null) {
			partners = new EObjectResolvingEList<Partner>(Partner.class, this, PROPackage.TASK__PARTNERS);
		}
		return partners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PROPackage.TASK__ID_TASK:
				return getId_task();
			case PROPackage.TASK__TITLE_TASK:
				return getTitle_task();
			case PROPackage.TASK__START_TASK:
				return getStart_task();
			case PROPackage.TASK__END_TASK:
				return getEnd_task();
			case PROPackage.TASK__PARTNERS:
				return getPartners();
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
			case PROPackage.TASK__ID_TASK:
				setId_task((String)newValue);
				return;
			case PROPackage.TASK__TITLE_TASK:
				setTitle_task((String)newValue);
				return;
			case PROPackage.TASK__START_TASK:
				setStart_task((Integer)newValue);
				return;
			case PROPackage.TASK__END_TASK:
				setEnd_task((Integer)newValue);
				return;
			case PROPackage.TASK__PARTNERS:
				getPartners().clear();
				getPartners().addAll((Collection<? extends Partner>)newValue);
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
			case PROPackage.TASK__ID_TASK:
				setId_task(ID_TASK_EDEFAULT);
				return;
			case PROPackage.TASK__TITLE_TASK:
				setTitle_task(TITLE_TASK_EDEFAULT);
				return;
			case PROPackage.TASK__START_TASK:
				setStart_task(START_TASK_EDEFAULT);
				return;
			case PROPackage.TASK__END_TASK:
				setEnd_task(END_TASK_EDEFAULT);
				return;
			case PROPackage.TASK__PARTNERS:
				getPartners().clear();
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
			case PROPackage.TASK__ID_TASK:
				return ID_TASK_EDEFAULT == null ? id_task != null : !ID_TASK_EDEFAULT.equals(id_task);
			case PROPackage.TASK__TITLE_TASK:
				return TITLE_TASK_EDEFAULT == null ? title_task != null : !TITLE_TASK_EDEFAULT.equals(title_task);
			case PROPackage.TASK__START_TASK:
				return start_task != START_TASK_EDEFAULT;
			case PROPackage.TASK__END_TASK:
				return end_task != END_TASK_EDEFAULT;
			case PROPackage.TASK__PARTNERS:
				return partners != null && !partners.isEmpty();
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
		result.append(" (id_task: ");
		result.append(id_task);
		result.append(", title_task: ");
		result.append(title_task);
		result.append(", start_task: ");
		result.append(start_task);
		result.append(", end_task: ");
		result.append(end_task);
		result.append(')');
		return result.toString();
	}

} //TaskImpl
