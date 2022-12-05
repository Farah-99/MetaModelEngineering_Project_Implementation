/**
 */
package PRO;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Deliverable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PRO.Deliverable#getTitle_del <em>Title del</em>}</li>
 *   <li>{@link PRO.Deliverable#getDue_del <em>Due del</em>}</li>
 *   <li>{@link PRO.Deliverable#getNature_del <em>Nature del</em>}</li>
 *   <li>{@link PRO.Deliverable#getPartner <em>Partner</em>}</li>
 * </ul>
 *
 * @see PRO.PROPackage#getDeliverable()
 * @model
 * @generated
 */
public interface Deliverable extends EObject {
	/**
	 * Returns the value of the '<em><b>Title del</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title del</em>' attribute.
	 * @see #setTitle_del(int)
	 * @see PRO.PROPackage#getDeliverable_Title_del()
	 * @model
	 * @generated
	 */
	int getTitle_del();

	/**
	 * Sets the value of the '{@link PRO.Deliverable#getTitle_del <em>Title del</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title del</em>' attribute.
	 * @see #getTitle_del()
	 * @generated
	 */
	void setTitle_del(int value);

	/**
	 * Returns the value of the '<em><b>Due del</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Due del</em>' attribute.
	 * @see #setDue_del(int)
	 * @see PRO.PROPackage#getDeliverable_Due_del()
	 * @model
	 * @generated
	 */
	int getDue_del();

	/**
	 * Sets the value of the '{@link PRO.Deliverable#getDue_del <em>Due del</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Due del</em>' attribute.
	 * @see #getDue_del()
	 * @generated
	 */
	void setDue_del(int value);

	/**
	 * Returns the value of the '<em><b>Nature del</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nature del</em>' attribute.
	 * @see #setNature_del(String)
	 * @see PRO.PROPackage#getDeliverable_Nature_del()
	 * @model
	 * @generated
	 */
	String getNature_del();

	/**
	 * Sets the value of the '{@link PRO.Deliverable#getNature_del <em>Nature del</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nature del</em>' attribute.
	 * @see #getNature_del()
	 * @generated
	 */
	void setNature_del(String value);

	/**
	 * Returns the value of the '<em><b>Partner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partner</em>' reference.
	 * @see #setPartner(Partner)
	 * @see PRO.PROPackage#getDeliverable_Partner()
	 * @model
	 * @generated
	 */
	Partner getPartner();

	/**
	 * Sets the value of the '{@link PRO.Deliverable#getPartner <em>Partner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Partner</em>' reference.
	 * @see #getPartner()
	 * @generated
	 */
	void setPartner(Partner value);

} // Deliverable
