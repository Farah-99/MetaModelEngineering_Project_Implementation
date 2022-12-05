/**
 */
package PRO;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Partner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link PRO.Partner#getId_par <em>Id par</em>}</li>
 *   <li>{@link PRO.Partner#getName_par <em>Name par</em>}</li>
 *   <li>{@link PRO.Partner#getCountry_par <em>Country par</em>}</li>
 * </ul>
 *
 * @see PRO.PROPackage#getPartner()
 * @model
 * @generated
 */
public interface Partner extends EObject {
	/**
	 * Returns the value of the '<em><b>Id par</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id par</em>' attribute.
	 * @see #setId_par(String)
	 * @see PRO.PROPackage#getPartner_Id_par()
	 * @model id="true"
	 * @generated
	 */
	String getId_par();

	/**
	 * Sets the value of the '{@link PRO.Partner#getId_par <em>Id par</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id par</em>' attribute.
	 * @see #getId_par()
	 * @generated
	 */
	void setId_par(String value);

	/**
	 * Returns the value of the '<em><b>Name par</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name par</em>' attribute.
	 * @see #setName_par(String)
	 * @see PRO.PROPackage#getPartner_Name_par()
	 * @model
	 * @generated
	 */
	String getName_par();

	/**
	 * Sets the value of the '{@link PRO.Partner#getName_par <em>Name par</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name par</em>' attribute.
	 * @see #getName_par()
	 * @generated
	 */
	void setName_par(String value);

	/**
	 * Returns the value of the '<em><b>Country par</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country par</em>' attribute.
	 * @see #setCountry_par(String)
	 * @see PRO.PROPackage#getPartner_Country_par()
	 * @model
	 * @generated
	 */
	String getCountry_par();

	/**
	 * Sets the value of the '{@link PRO.Partner#getCountry_par <em>Country par</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country par</em>' attribute.
	 * @see #getCountry_par()
	 * @generated
	 */
	void setCountry_par(String value);

} // Partner
