/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.motorph;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Gen Calvez
 */
public class EmployeePersonalDetailsIT {
    
    public EmployeePersonalDetailsIT() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of validateEmployeeFile method, of class EmployeePersonalDetails.
     */
    @Test
    public void testValidateEmployeeFile() {
        System.out.println("validateEmployeeFile");
        EmployeePersonalDetails instance = new EmployeePersonalDetails();
        boolean expResult = false;
        boolean result = instance.validateEmployeeFile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmployeeData method, of class EmployeePersonalDetails.
     */
    @Test
    public void testGetEmployeeData() throws Exception {
        System.out.println("getEmployeeData");
        String empNum = "";
        int index = 0;
        EmployeePersonalDetails instance = new EmployeePersonalDetails();
        String expResult = "";
        String result = instance.getEmployeeData(empNum, index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayEmployeeArray method, of class EmployeePersonalDetails.
     */
    @Test
    public void testDisplayEmployeeArray() throws Exception {
        System.out.println("displayEmployeeArray");
        EmployeePersonalDetails instance = new EmployeePersonalDetails();
        instance.displayEmployeeArray();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFileName method, of class EmployeePersonalDetails.
     */
    @Test
    public void testSetFileName() {
        System.out.println("setFileName");
        EmployeePersonalDetails instance = new EmployeePersonalDetails();
        instance.setFileName();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBenefits method, of class EmployeePersonalDetails.
     */
    @Test
    public void testGetBenefits() throws Exception {
        System.out.println("getBenefits");
        String employeeID = "";
        String benefitName = "";
        EmployeePersonalDetails instance = new EmployeePersonalDetails();
        double expResult = 0.0;
        double result = instance.getBenefits(employeeID, benefitName);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
