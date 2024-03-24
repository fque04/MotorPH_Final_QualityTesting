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
public class ErrorTestIT {
    
    public ErrorTestIT() {
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
     * Test of checkEmployeeExistence method, of class ErrorTest.
     */
    @Test
    public void testCheckEmployeeExistence() throws Exception {
        System.out.println("checkEmployeeExistence");
        String employeeID = "";
        ErrorTest instance = new ErrorTest();
        boolean expResult = false;
        boolean result = instance.checkEmployeeExistence(employeeID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkDateValidity method, of class ErrorTest.
     */
    @Test
    public void testCheckDateValidity() throws Exception {
        System.out.println("checkDateValidity");
        String date = "";
        ErrorTest instance = new ErrorTest();
        boolean expResult = false;
        boolean result = instance.checkDateValidity(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
