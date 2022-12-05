/**
 */
package PRO;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see PRO.PROFactory
 * @model kind="package"
 * @generated
 */
public interface PROPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "PRO";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = " platform:/resource/Project/metamodels/PRO.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "PRO";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PROPackage eINSTANCE = PRO.impl.PROPackageImpl.init();

	/**
	 * The meta object id for the '{@link PRO.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PRO.impl.ProjectImpl
	 * @see PRO.impl.PROPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Id proj</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ID_PROJ = 0;

	/**
	 * The feature id for the '<em><b>Name proj</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME_PROJ = 1;

	/**
	 * The feature id for the '<em><b>Duration proj</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__DURATION_PROJ = 2;

	/**
	 * The feature id for the '<em><b>Partners</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PARTNERS = 3;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__RULES = 4;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PRO.impl.PartnerImpl <em>Partner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PRO.impl.PartnerImpl
	 * @see PRO.impl.PROPackageImpl#getPartner()
	 * @generated
	 */
	int PARTNER = 1;

	/**
	 * The feature id for the '<em><b>Id par</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER__ID_PAR = 0;

	/**
	 * The feature id for the '<em><b>Name par</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER__NAME_PAR = 1;

	/**
	 * The feature id for the '<em><b>Country par</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER__COUNTRY_PAR = 2;

	/**
	 * The number of structural features of the '<em>Partner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Partner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PRO.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PRO.impl.TaskImpl
	 * @see PRO.impl.PROPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 2;

	/**
	 * The feature id for the '<em><b>Id task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__ID_TASK = 0;

	/**
	 * The feature id for the '<em><b>Title task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__TITLE_TASK = 1;

	/**
	 * The feature id for the '<em><b>Start task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__START_TASK = 2;

	/**
	 * The feature id for the '<em><b>End task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__END_TASK = 3;

	/**
	 * The feature id for the '<em><b>Partners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__PARTNERS = 4;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PRO.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PRO.impl.RuleImpl
	 * @see PRO.impl.PROPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 3;

	/**
	 * The feature id for the '<em><b>Id rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__ID_RULE = 0;

	/**
	 * The feature id for the '<em><b>Title rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__TITLE_RULE = 1;

	/**
	 * The feature id for the '<em><b>Type rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__TYPE_RULE = 2;

	/**
	 * The feature id for the '<em><b>Leader</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__LEADER = 3;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__TASKS = 4;

	/**
	 * The feature id for the '<em><b>Delievrables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__DELIEVRABLES = 5;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link PRO.impl.DeliverableImpl <em>Deliverable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see PRO.impl.DeliverableImpl
	 * @see PRO.impl.PROPackageImpl#getDeliverable()
	 * @generated
	 */
	int DELIVERABLE = 4;

	/**
	 * The feature id for the '<em><b>Title del</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE__TITLE_DEL = 0;

	/**
	 * The feature id for the '<em><b>Due del</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE__DUE_DEL = 1;

	/**
	 * The feature id for the '<em><b>Nature del</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE__NATURE_DEL = 2;

	/**
	 * The feature id for the '<em><b>Partner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE__PARTNER = 3;

	/**
	 * The number of structural features of the '<em>Deliverable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Deliverable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERABLE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link PRO.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see PRO.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link PRO.Project#getId_proj <em>Id proj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id proj</em>'.
	 * @see PRO.Project#getId_proj()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Id_proj();

	/**
	 * Returns the meta object for the attribute '{@link PRO.Project#getName_proj <em>Name proj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name proj</em>'.
	 * @see PRO.Project#getName_proj()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name_proj();

	/**
	 * Returns the meta object for the attribute '{@link PRO.Project#getDuration_proj <em>Duration proj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration proj</em>'.
	 * @see PRO.Project#getDuration_proj()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Duration_proj();

	/**
	 * Returns the meta object for the containment reference list '{@link PRO.Project#getPartners <em>Partners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Partners</em>'.
	 * @see PRO.Project#getPartners()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Partners();

	/**
	 * Returns the meta object for the containment reference list '{@link PRO.Project#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see PRO.Project#getRules()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Rules();

	/**
	 * Returns the meta object for class '{@link PRO.Partner <em>Partner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partner</em>'.
	 * @see PRO.Partner
	 * @generated
	 */
	EClass getPartner();

	/**
	 * Returns the meta object for the attribute '{@link PRO.Partner#getId_par <em>Id par</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id par</em>'.
	 * @see PRO.Partner#getId_par()
	 * @see #getPartner()
	 * @generated
	 */
	EAttribute getPartner_Id_par();

	/**
	 * Returns the meta object for the attribute '{@link PRO.Partner#getName_par <em>Name par</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name par</em>'.
	 * @see PRO.Partner#getName_par()
	 * @see #getPartner()
	 * @generated
	 */
	EAttribute getPartner_Name_par();

	/**
	 * Returns the meta object for the attribute '{@link PRO.Partner#getCountry_par <em>Country par</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country par</em>'.
	 * @see PRO.Partner#getCountry_par()
	 * @see #getPartner()
	 * @generated
	 */
	EAttribute getPartner_Country_par();

	/**
	 * Returns the meta object for class '{@link PRO.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see PRO.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link PRO.Task#getId_task <em>Id task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id task</em>'.
	 * @see PRO.Task#getId_task()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Id_task();

	/**
	 * Returns the meta object for the attribute '{@link PRO.Task#getTitle_task <em>Title task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title task</em>'.
	 * @see PRO.Task#getTitle_task()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Title_task();

	/**
	 * Returns the meta object for the attribute '{@link PRO.Task#getStart_task <em>Start task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start task</em>'.
	 * @see PRO.Task#getStart_task()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Start_task();

	/**
	 * Returns the meta object for the attribute '{@link PRO.Task#getEnd_task <em>End task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End task</em>'.
	 * @see PRO.Task#getEnd_task()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_End_task();

	/**
	 * Returns the meta object for the reference list '{@link PRO.Task#getPartners <em>Partners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Partners</em>'.
	 * @see PRO.Task#getPartners()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_Partners();

	/**
	 * Returns the meta object for class '{@link PRO.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see PRO.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the attribute '{@link PRO.Rule#getId_rule <em>Id rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id rule</em>'.
	 * @see PRO.Rule#getId_rule()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Id_rule();

	/**
	 * Returns the meta object for the attribute '{@link PRO.Rule#getTitle_rule <em>Title rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title rule</em>'.
	 * @see PRO.Rule#getTitle_rule()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Title_rule();

	/**
	 * Returns the meta object for the attribute '{@link PRO.Rule#getType_rule <em>Type rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type rule</em>'.
	 * @see PRO.Rule#getType_rule()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Type_rule();

	/**
	 * Returns the meta object for the reference '{@link PRO.Rule#getLeader <em>Leader</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Leader</em>'.
	 * @see PRO.Rule#getLeader()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Leader();

	/**
	 * Returns the meta object for the containment reference list '{@link PRO.Rule#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see PRO.Rule#getTasks()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Tasks();

	/**
	 * Returns the meta object for the containment reference list '{@link PRO.Rule#getDelievrables <em>Delievrables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Delievrables</em>'.
	 * @see PRO.Rule#getDelievrables()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Delievrables();

	/**
	 * Returns the meta object for class '{@link PRO.Deliverable <em>Deliverable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Deliverable</em>'.
	 * @see PRO.Deliverable
	 * @generated
	 */
	EClass getDeliverable();

	/**
	 * Returns the meta object for the attribute '{@link PRO.Deliverable#getTitle_del <em>Title del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title del</em>'.
	 * @see PRO.Deliverable#getTitle_del()
	 * @see #getDeliverable()
	 * @generated
	 */
	EAttribute getDeliverable_Title_del();

	/**
	 * Returns the meta object for the attribute '{@link PRO.Deliverable#getDue_del <em>Due del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Due del</em>'.
	 * @see PRO.Deliverable#getDue_del()
	 * @see #getDeliverable()
	 * @generated
	 */
	EAttribute getDeliverable_Due_del();

	/**
	 * Returns the meta object for the attribute '{@link PRO.Deliverable#getNature_del <em>Nature del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nature del</em>'.
	 * @see PRO.Deliverable#getNature_del()
	 * @see #getDeliverable()
	 * @generated
	 */
	EAttribute getDeliverable_Nature_del();

	/**
	 * Returns the meta object for the reference '{@link PRO.Deliverable#getPartner <em>Partner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Partner</em>'.
	 * @see PRO.Deliverable#getPartner()
	 * @see #getDeliverable()
	 * @generated
	 */
	EReference getDeliverable_Partner();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PROFactory getPROFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link PRO.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PRO.impl.ProjectImpl
		 * @see PRO.impl.PROPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Id proj</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__ID_PROJ = eINSTANCE.getProject_Id_proj();

		/**
		 * The meta object literal for the '<em><b>Name proj</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NAME_PROJ = eINSTANCE.getProject_Name_proj();

		/**
		 * The meta object literal for the '<em><b>Duration proj</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__DURATION_PROJ = eINSTANCE.getProject_Duration_proj();

		/**
		 * The meta object literal for the '<em><b>Partners</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__PARTNERS = eINSTANCE.getProject_Partners();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__RULES = eINSTANCE.getProject_Rules();

		/**
		 * The meta object literal for the '{@link PRO.impl.PartnerImpl <em>Partner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PRO.impl.PartnerImpl
		 * @see PRO.impl.PROPackageImpl#getPartner()
		 * @generated
		 */
		EClass PARTNER = eINSTANCE.getPartner();

		/**
		 * The meta object literal for the '<em><b>Id par</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTNER__ID_PAR = eINSTANCE.getPartner_Id_par();

		/**
		 * The meta object literal for the '<em><b>Name par</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTNER__NAME_PAR = eINSTANCE.getPartner_Name_par();

		/**
		 * The meta object literal for the '<em><b>Country par</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTNER__COUNTRY_PAR = eINSTANCE.getPartner_Country_par();

		/**
		 * The meta object literal for the '{@link PRO.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PRO.impl.TaskImpl
		 * @see PRO.impl.PROPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Id task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__ID_TASK = eINSTANCE.getTask_Id_task();

		/**
		 * The meta object literal for the '<em><b>Title task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__TITLE_TASK = eINSTANCE.getTask_Title_task();

		/**
		 * The meta object literal for the '<em><b>Start task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__START_TASK = eINSTANCE.getTask_Start_task();

		/**
		 * The meta object literal for the '<em><b>End task</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__END_TASK = eINSTANCE.getTask_End_task();

		/**
		 * The meta object literal for the '<em><b>Partners</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__PARTNERS = eINSTANCE.getTask_Partners();

		/**
		 * The meta object literal for the '{@link PRO.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PRO.impl.RuleImpl
		 * @see PRO.impl.PROPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Id rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__ID_RULE = eINSTANCE.getRule_Id_rule();

		/**
		 * The meta object literal for the '<em><b>Title rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__TITLE_RULE = eINSTANCE.getRule_Title_rule();

		/**
		 * The meta object literal for the '<em><b>Type rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__TYPE_RULE = eINSTANCE.getRule_Type_rule();

		/**
		 * The meta object literal for the '<em><b>Leader</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__LEADER = eINSTANCE.getRule_Leader();

		/**
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__TASKS = eINSTANCE.getRule_Tasks();

		/**
		 * The meta object literal for the '<em><b>Delievrables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__DELIEVRABLES = eINSTANCE.getRule_Delievrables();

		/**
		 * The meta object literal for the '{@link PRO.impl.DeliverableImpl <em>Deliverable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see PRO.impl.DeliverableImpl
		 * @see PRO.impl.PROPackageImpl#getDeliverable()
		 * @generated
		 */
		EClass DELIVERABLE = eINSTANCE.getDeliverable();

		/**
		 * The meta object literal for the '<em><b>Title del</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERABLE__TITLE_DEL = eINSTANCE.getDeliverable_Title_del();

		/**
		 * The meta object literal for the '<em><b>Due del</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERABLE__DUE_DEL = eINSTANCE.getDeliverable_Due_del();

		/**
		 * The meta object literal for the '<em><b>Nature del</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERABLE__NATURE_DEL = eINSTANCE.getDeliverable_Nature_del();

		/**
		 * The meta object literal for the '<em><b>Partner</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DELIVERABLE__PARTNER = eINSTANCE.getDeliverable_Partner();

	}

} //PROPackage
