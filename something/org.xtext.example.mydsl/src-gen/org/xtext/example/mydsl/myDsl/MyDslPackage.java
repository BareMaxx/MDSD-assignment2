/**
 * generated by Xtext 2.33.0
 */
package org.xtext.example.mydsl.myDsl;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslFactory
 * @model kind="package"
 * @generated
 */
public interface MyDslPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "myDsl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/example/mydsl/MyDsl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "myDsl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MyDslPackage eINSTANCE = org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ContainerImpl <em>Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ContainerImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getContainer()
   * @generated
   */
  int CONTAINER = 0;

  /**
   * The feature id for the '<em><b>Contains</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER__CONTAINS = 0;

  /**
   * The number of structural features of the '<em>Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTAINER_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.ABCImpl <em>ABC</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.ABCImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getABC()
   * @generated
   */
  int ABC = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABC__NAME = 0;

  /**
   * The number of structural features of the '<em>ABC</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABC_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.BCDImpl <em>BCD</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.BCDImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getBCD()
   * @generated
   */
  int BCD = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BCD__NAME = ABC__NAME;

  /**
   * The number of structural features of the '<em>BCD</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BCD_FEATURE_COUNT = ABC_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.example.mydsl.myDsl.impl.CDEImpl <em>CDE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.example.mydsl.myDsl.impl.CDEImpl
   * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCDE()
   * @generated
   */
  int CDE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDE__NAME = ABC__NAME;

  /**
   * The number of structural features of the '<em>CDE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CDE_FEATURE_COUNT = ABC_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.Container <em>Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Container</em>'.
   * @see org.xtext.example.mydsl.myDsl.Container
   * @generated
   */
  EClass getContainer();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.example.mydsl.myDsl.Container#getContains <em>Contains</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Contains</em>'.
   * @see org.xtext.example.mydsl.myDsl.Container#getContains()
   * @see #getContainer()
   * @generated
   */
  EReference getContainer_Contains();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.ABC <em>ABC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ABC</em>'.
   * @see org.xtext.example.mydsl.myDsl.ABC
   * @generated
   */
  EClass getABC();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.example.mydsl.myDsl.ABC#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.example.mydsl.myDsl.ABC#getName()
   * @see #getABC()
   * @generated
   */
  EAttribute getABC_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.BCD <em>BCD</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>BCD</em>'.
   * @see org.xtext.example.mydsl.myDsl.BCD
   * @generated
   */
  EClass getBCD();

  /**
   * Returns the meta object for class '{@link org.xtext.example.mydsl.myDsl.CDE <em>CDE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CDE</em>'.
   * @see org.xtext.example.mydsl.myDsl.CDE
   * @generated
   */
  EClass getCDE();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MyDslFactory getMyDslFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ContainerImpl <em>Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ContainerImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getContainer()
     * @generated
     */
    EClass CONTAINER = eINSTANCE.getContainer();

    /**
     * The meta object literal for the '<em><b>Contains</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTAINER__CONTAINS = eINSTANCE.getContainer_Contains();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.ABCImpl <em>ABC</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.ABCImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getABC()
     * @generated
     */
    EClass ABC = eINSTANCE.getABC();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABC__NAME = eINSTANCE.getABC_Name();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.BCDImpl <em>BCD</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.BCDImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getBCD()
     * @generated
     */
    EClass BCD = eINSTANCE.getBCD();

    /**
     * The meta object literal for the '{@link org.xtext.example.mydsl.myDsl.impl.CDEImpl <em>CDE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.example.mydsl.myDsl.impl.CDEImpl
     * @see org.xtext.example.mydsl.myDsl.impl.MyDslPackageImpl#getCDE()
     * @generated
     */
    EClass CDE = eINSTANCE.getCDE();

  }

} //MyDslPackage
