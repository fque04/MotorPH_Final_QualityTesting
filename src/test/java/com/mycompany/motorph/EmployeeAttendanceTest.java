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
public class EmployeeAttendanceTest {
    
    public EmployeeAttendanceTest() {
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
     * Test of validateEmployeeFile method, of class EmployeeAttendance.
     */
    @Test
    public void testValidateEmployeeFile() {
        System.out.println("validateEmployeeFile");
        EmployeeAttendance instance = new EmployeeAttendance();
        boolean expResult = false;
        boolean result = instance.validateEmployeeFile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmployeeData method, of class EmployeeAttendance.
     */
    @Test
    public void testGetEmployeeData() throws Exception {
        System.out.println("getEmployeeData");
        String empNum = "";
        int index = 0;
        EmployeeAttendance instance = new EmployeeAttendance();
        String expResult = "";
        String result = instance.getEmployeeData(empNum, index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayEmployeeArray method, of class EmployeeAttendance.
     */
    @Test
    public void testDisplayEmployeeArray() throws Exception {
        System.out.println("displayEmployeeArray");
        EmployeeAttendance instance = new EmployeeAttendance();
        instance.displayEmployeeArray();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFileName method, of class EmployeeAttendance.
     */
    @Test
    public void testSetFileName() {
        System.out.println("setFileName");
        EmployeeAttendance instance = new EmployeeAttendance();
        instance.setFileName();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
