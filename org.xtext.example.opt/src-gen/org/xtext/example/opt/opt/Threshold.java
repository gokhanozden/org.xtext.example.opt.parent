/**
 * generated by Xtext 2.9.2
 */
package org.xtext.example.opt.opt;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Threshold</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.opt.opt.Threshold#getThresholdvalue <em>Thresholdvalue</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.opt.opt.OptPackage#getThreshold()
 * @model
 * @generated
 */
public interface Threshold extends Type, Stopping_Criteria
{
  /**
   * Returns the value of the '<em><b>Thresholdvalue</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Thresholdvalue</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Thresholdvalue</em>' attribute.
   * @see #setThresholdvalue(String)
   * @see org.xtext.example.opt.opt.OptPackage#getThreshold_Thresholdvalue()
   * @model
   * @generated
   */
  String getThresholdvalue();

  /**
   * Sets the value of the '{@link org.xtext.example.opt.opt.Threshold#getThresholdvalue <em>Thresholdvalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Thresholdvalue</em>' attribute.
   * @see #getThresholdvalue()
   * @generated
   */
  void setThresholdvalue(String value);

} // Threshold
