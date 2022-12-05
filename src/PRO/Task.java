/**
 */
package PRO;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PRO.Task#getId_task <em>Id task</em>}</li>
 *   <li>{@link PRO.Task#getTitle_task <em>Title task</em>}</li>
 *   <li>{@link PRO.Task#getStart_task <em>Start task</em>}</li>
 *   <li>{@link PRO.Task#getEnd_task <em>End task</em>}</li>
 *   <li>{@link PRO.Task#getPartners <em>Partners</em>}</li>
 * </ul>
 *
 * @see PRO.PROPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends EObject {
	/**
	 * Returns the value of the '<em><b>Id task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id task</em>' attribute.
	 * @see #setId_task(String)
	 * @see PRO.PROPackage#getTask_Id_task()
	 * @model id="true"
	 * @generated
	 */
	String getId_task();

	/**
	 * Sets the value of the '{@link PRO.Task#getId_task <em>Id task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id task</em>' attribute.
	 * @see #getId_task()
	 * @generated
	 */
	void setId_task(String value);

	/**
	 * Returns the value of the '<em><b>Title task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title task</em>' attribute.
	 * @see #setTitle_task(String)
	 * @see PRO.PROPackage#getTask_Title_task()
	 * @model
	 * @generated
	 */
	String getTitle_task();

	/**
	 * Sets the value of the '{@link PRO.Task#getTitle_task <em>Title task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title task</em>' attribute.
	 * @see #getTitle_task()
	 * @generated
	 */
	void setTitle_task(String value);

	/**
	 * Returns the value of the '<em><b>Start task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start task</em>' attribute.
	 * @see #setStart_task(int)
	 * @see PRO.PROPackage#getTask_Start_task()
	 * @model
	 * @generated
	 */
	int getStart_task();

	/**
	 * Sets the value of the '{@link PRO.Task#getStart_task <em>Start task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start task</em>' attribute.
	 * @see #getStart_task()
	 * @generated
	 */
	void setStart_task(int value);

	/**
	 * Returns the value of the '<em><b>End task</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End task</em>' attribute.
	 * @see #setEnd_task(int)
	 * @see PRO.PROPackage#getTask_End_task()
	 * @model
	 * @generated
	 */
	int getEnd_task();

	/**
	 * Sets the value of the '{@link PRO.Task#getEnd_task <em>End task</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End task</em>' attribute.
	 * @see #getEnd_task()
	 * @generated
	 */
	void setEnd_task(int value);

	/**
	 * Returns the value of the '<em><b>Partners</b></em>' reference list.
	 * The list contents are of type {@link PRO.Partner}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partners</em>' reference list.
	 * @see PRO.PROPackage#getTask_Partners()
	 * @model
	 * @generated
	 */
	EList<Partner> getPartners();

} // Task
