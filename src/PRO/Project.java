/**
 */
package PRO;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PRO.Project#getId_proj <em>Id proj</em>}</li>
 *   <li>{@link PRO.Project#getName_proj <em>Name proj</em>}</li>
 *   <li>{@link PRO.Project#getDuration_proj <em>Duration proj</em>}</li>
 *   <li>{@link PRO.Project#getPartners <em>Partners</em>}</li>
 *   <li>{@link PRO.Project#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see PRO.PROPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
	/**
	 * Returns the value of the '<em><b>Id proj</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id proj</em>' attribute.
	 * @see #setId_proj(String)
	 * @see PRO.PROPackage#getProject_Id_proj()
	 * @model id="true"
	 * @generated
	 */
	String getId_proj();

	/**
	 * Sets the value of the '{@link PRO.Project#getId_proj <em>Id proj</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id proj</em>' attribute.
	 * @see #getId_proj()
	 * @generated
	 */
	void setId_proj(String value);

	/**
	 * Returns the value of the '<em><b>Name proj</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name proj</em>' attribute.
	 * @see #setName_proj(String)
	 * @see PRO.PROPackage#getProject_Name_proj()
	 * @model
	 * @generated
	 */
	String getName_proj();

	/**
	 * Sets the value of the '{@link PRO.Project#getName_proj <em>Name proj</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name proj</em>' attribute.
	 * @see #getName_proj()
	 * @generated
	 */
	void setName_proj(String value);

	/**
	 * Returns the value of the '<em><b>Duration proj</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration proj</em>' attribute.
	 * @see #setDuration_proj(int)
	 * @see PRO.PROPackage#getProject_Duration_proj()
	 * @model
	 * @generated
	 */
	int getDuration_proj();

	/**
	 * Sets the value of the '{@link PRO.Project#getDuration_proj <em>Duration proj</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration proj</em>' attribute.
	 * @see #getDuration_proj()
	 * @generated
	 */
	void setDuration_proj(int value);

	/**
	 * Returns the value of the '<em><b>Partners</b></em>' containment reference list.
	 * The list contents are of type {@link PRO.Partner}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partners</em>' containment reference list.
	 * @see PRO.PROPackage#getProject_Partners()
	 * @model containment="true"
	 * @generated
	 */
	EList<Partner> getPartners();

	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link PRO.Rule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see PRO.PROPackage#getProject_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<Rule> getRules();

} // Project
