/**
 */
package PRO.impl;

import PRO.Deliverable;
import PRO.PROPackage;
import PRO.Partner;
import PRO.Rule;
import PRO.Task;

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
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link PRO.impl.RuleImpl#getId_rule <em>Id rule</em>}</li>
 *   <li>{@link PRO.impl.RuleImpl#getTitle_rule <em>Title rule</em>}</li>
 *   <li>{@link PRO.impl.RuleImpl#getType_rule <em>Type rule</em>}</li>
 *   <li>{@link PRO.impl.RuleImpl#getLeader <em>Leader</em>}</li>
 *   <li>{@link PRO.impl.RuleImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link PRO.impl.RuleImpl#getDelievrables <em>Delievrables</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RuleImpl extends MinimalEObjectImpl.Container implements Rule {
	/**
	 * The default value of the '{@link #getId_rule() <em>Id rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId_rule()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_RULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId_rule() <em>Id rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId_rule()
	 * @generated
	 * @ordered
	 */
	protected String id_rule = ID_RULE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle_rule() <em>Title rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle_rule()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_RULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle_rule() <em>Title rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle_rule()
	 * @generated
	 * @ordered
	 */
	protected String title_rule = TITLE_RULE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType_rule() <em>Type rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_rule()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_RULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType_rule() <em>Type rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType_rule()
	 * @generated
	 * @ordered
	 */
	protected String type_rule = TYPE_RULE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLeader() <em>Leader</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeader()
	 * @generated
	 * @ordered
	 */
	protected Partner leader;

	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task> tasks;

	/**
	 * The cached value of the '{@link #getDelievrables() <em>Delievrables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelievrables()
	 * @generated
	 * @ordered
	 */
	protected EList<Deliverable> delievrables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PROPackage.Literals.RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId_rule() {
		return id_rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId_rule(String newId_rule) {
		String oldId_rule = id_rule;
		id_rule = newId_rule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PROPackage.RULE__ID_RULE, oldId_rule, id_rule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle_rule() {
		return title_rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle_rule(String newTitle_rule) {
		String oldTitle_rule = title_rule;
		title_rule = newTitle_rule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PROPackage.RULE__TITLE_RULE, oldTitle_rule, title_rule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType_rule() {
		return type_rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType_rule(String newType_rule) {
		String oldType_rule = type_rule;
		type_rule = newType_rule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PROPackage.RULE__TYPE_RULE, oldType_rule, type_rule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Partner getLeader() {
		if (leader != null && leader.eIsProxy()) {
			InternalEObject oldLeader = (InternalEObject)leader;
			leader = (Partner)eResolveProxy(oldLeader);
			if (leader != oldLeader) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PROPackage.RULE__LEADER, oldLeader, leader));
			}
		}
		return leader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Partner basicGetLeader() {
		return leader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeader(Partner newLeader) {
		Partner oldLeader = leader;
		leader = newLeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PROPackage.RULE__LEADER, oldLeader, leader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentEList<Task>(Task.class, this, PROPackage.RULE__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Deliverable> getDelievrables() {
		if (delievrables == null) {
			delievrables = new EObjectContainmentEList<Deliverable>(Deliverable.class, this, PROPackage.RULE__DELIEVRABLES);
		}
		return delievrables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PROPackage.RULE__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
			case PROPackage.RULE__DELIEVRABLES:
				return ((InternalEList<?>)getDelievrables()).basicRemove(otherEnd, msgs);
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
			case PROPackage.RULE__ID_RULE:
				return getId_rule();
			case PROPackage.RULE__TITLE_RULE:
				return getTitle_rule();
			case PROPackage.RULE__TYPE_RULE:
				return getType_rule();
			case PROPackage.RULE__LEADER:
				if (resolve) return getLeader();
				return basicGetLeader();
			case PROPackage.RULE__TASKS:
				return getTasks();
			case PROPackage.RULE__DELIEVRABLES:
				return getDelievrables();
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
			case PROPackage.RULE__ID_RULE:
				setId_rule((String)newValue);
				return;
			case PROPackage.RULE__TITLE_RULE:
				setTitle_rule((String)newValue);
				return;
			case PROPackage.RULE__TYPE_RULE:
				setType_rule((String)newValue);
				return;
			case PROPackage.RULE__LEADER:
				setLeader((Partner)newValue);
				return;
			case PROPackage.RULE__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task>)newValue);
				return;
			case PROPackage.RULE__DELIEVRABLES:
				getDelievrables().clear();
				getDelievrables().addAll((Collection<? extends Deliverable>)newValue);
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
			case PROPackage.RULE__ID_RULE:
				setId_rule(ID_RULE_EDEFAULT);
				return;
			case PROPackage.RULE__TITLE_RULE:
				setTitle_rule(TITLE_RULE_EDEFAULT);
				return;
			case PROPackage.RULE__TYPE_RULE:
				setType_rule(TYPE_RULE_EDEFAULT);
				return;
			case PROPackage.RULE__LEADER:
				setLeader((Partner)null);
				return;
			case PROPackage.RULE__TASKS:
				getTasks().clear();
				return;
			case PROPackage.RULE__DELIEVRABLES:
				getDelievrables().clear();
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
			case PROPackage.RULE__ID_RULE:
				return ID_RULE_EDEFAULT == null ? id_rule != null : !ID_RULE_EDEFAULT.equals(id_rule);
			case PROPackage.RULE__TITLE_RULE:
				return TITLE_RULE_EDEFAULT == null ? title_rule != null : !TITLE_RULE_EDEFAULT.equals(title_rule);
			case PROPackage.RULE__TYPE_RULE:
				return TYPE_RULE_EDEFAULT == null ? type_rule != null : !TYPE_RULE_EDEFAULT.equals(type_rule);
			case PROPackage.RULE__LEADER:
				return leader != null;
			case PROPackage.RULE__TASKS:
				return tasks != null && !tasks.isEmpty();
			case PROPackage.RULE__DELIEVRABLES:
				return delievrables != null && !delievrables.isEmpty();
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
		result.append(" (id_rule: ");
		result.append(id_rule);
		result.append(", title_rule: ");
		result.append(title_rule);
		result.append(", type_rule: ");
		result.append(type_rule);
		result.append(')');
		return result.toString();
	}

} //RuleImpl
