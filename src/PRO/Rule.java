/**
 */
package PRO;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PRO.Rule#getId_rule <em>Id rule</em>}</li>
 *   <li>{@link PRO.Rule#getTitle_rule <em>Title rule</em>}</li>
 *   <li>{@link PRO.Rule#getType_rule <em>Type rule</em>}</li>
 *   <li>{@link PRO.Rule#getLeader <em>Leader</em>}</li>
 *   <li>{@link PRO.Rule#getTasks <em>Tasks</em>}</li>
 *   <li>{@link PRO.Rule#getDelievrables <em>Delievrables</em>}</li>
 * </ul>
 *
 * @see PRO.PROPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject {
	/**
	 * Returns the value of the '<em><b>Id rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id rule</em>' attribute.
	 * @see #setId_rule(String)
	 * @see PRO.PROPackage#getRule_Id_rule()
	 * @model id="true"
	 * @generated
	 */
	String getId_rule();

	/**
	 * Sets the value of the '{@link PRO.Rule#getId_rule <em>Id rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id rule</em>' attribute.
	 * @see #getId_rule()
	 * @generated
	 */
	void setId_rule(String value);

	/**
	 * Returns the value of the '<em><b>Title rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title rule</em>' attribute.
	 * @see #setTitle_rule(String)
	 * @see PRO.PROPackage#getRule_Title_rule()
	 * @model
	 * @generated
	 */
	String getTitle_rule();

	/**
	 * Sets the value of the '{@link PRO.Rule#getTitle_rule <em>Title rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title rule</em>' attribute.
	 * @see #getTitle_rule()
	 * @generated
	 */
	void setTitle_rule(String value);

	/**
	 * Returns the value of the '<em><b>Type rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type rule</em>' attribute.
	 * @see #setType_rule(String)
	 * @see PRO.PROPackage#getRule_Type_rule()
	 * @model
	 * @generated
	 */
	String getType_rule();

	/**
	 * Sets the value of the '{@link PRO.Rule#getType_rule <em>Type rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type rule</em>' attribute.
	 * @see #getType_rule()
	 * @generated
	 */
	void setType_rule(String value);

	/**
	 * Returns the value of the '<em><b>Leader</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Leader</em>' reference.
	 * @see #setLeader(Partner)
	 * @see PRO.PROPackage#getRule_Leader()
	 * @model
	 * @generated
	 */
	Partner getLeader();

	/**
	 * Sets the value of the '{@link PRO.Rule#getLeader <em>Leader</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leader</em>' reference.
	 * @see #getLeader()
	 * @generated
	 */
	void setLeader(Partner value);

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link PRO.Task}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see PRO.PROPackage#getRule_Tasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * Returns the value of the '<em><b>Delievrables</b></em>' containment reference list.
	 * The list contents are of type {@link PRO.Deliverable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delievrables</em>' containment reference list.
	 * @see PRO.PROPackage#getRule_Delievrables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Deliverable> getDelievrables();


} // Rule
