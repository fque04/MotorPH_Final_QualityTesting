/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.motorph;

import java.io.File;
import java.io.IOException;
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
public class RetrieveEmployeeFileIT {
    
    public RetrieveEmployeeFileIT() {
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
     * Test of setEmployeeFileName method, of class RetrieveEmployeeFile.
     */
    @Test
    public void testSetEmployeeFileName() {
        System.out.println("setEmployeeFileName");
        String employeeFileName = "";
        RetrieveEmployeeFile instance = new RetrieveEmployeeFileImpl();
        instance.setEmployeeFileName(employeeFileName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmployeeFileName method, of class RetrieveEmployeeFile.
     */
    @Test
    public void testGetEmployeeFileName() {
        System.out.println("getEmployeeFileName");
        RetrieveEmployeeFile instance = new RetrieveEmployeeFileImpl();
        String expResult = "";
        String result = instance.getEmployeeFileName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmployeeBreak method, of class RetrieveEmployeeFile.
     */
    @Test
    public void testSetEmployeeBreak() {
        System.out.println("setEmployeeBreak");
        int employeeBreak = 0;
        RetrieveEmployeeFile instance = new RetrieveEmployeeFileImpl();
        instance.setEmployeeBreak(employeeBreak);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmployeeBreak method, of class RetrieveEmployeeFile.
     */
    @Test
    public void testGetEmployeeBreak() {
        System.out.println("getEmployeeBreak");
        RetrieveEmployeeFile instance = new RetrieveEmployeeFileImpl();
        int expResult = 0;
        int result = instance.getEmployeeBreak();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of validateEmployeeFile method, of class RetrieveEmployeeFile.
     */
    @Test
    public void testValidateEmployeeFile() throws Exception {
        System.out.println("validateEmployeeFile");
        RetrieveEmployeeFile instance = new RetrieveEmployeeFileImpl();
        boolean expResult = false;
        boolean result = instance.validateEmployeeFile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayEmployeeArray method, of class RetrieveEmployeeFile.
     */
    @Test
    public void testDisplayEmployeeArray() throws Exception {
        System.out.println("displayEmployeeArray");
        RetrieveEmployeeFile instance = new RetrieveEmployeeFileImpl();
        instance.displayEmployeeArray();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFileName method, of class RetrieveEmployeeFile.
     */
    @Test
    public void testSetFileName() throws Exception {
        System.out.println("setFileName");
        RetrieveEmployeeFile instance = new RetrieveEmployeeFileImpl();
        instance.setFileName();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmployeeData method, of class RetrieveEmployeeFile.
     */
    @Test
    public void testGetEmployeeData() throws Exception {
        System.out.println("getEmployeeData");
        String empNum = "";
        int index = 0;
        RetrieveEmployeeFile instance = new RetrieveEmployeeFileImpl();
        String expResult = "";
        String result = instance.getEmployeeData(empNum, index);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EmployeeDataArray method, of class RetrieveEmployeeFile.
     */
    @Test
    public void testEmployeeDataArray() throws Exception {
        System.out.println("EmployeeDataArray");
        String fileName = "";
        boolean includeHeaders = false;
        RetrieveEmployeeFile instance = new RetrieveEmployeeFileImpl();
        String[][] expResult = null;
        String[][] result = instance.EmployeeDataArray(fileName, includeHeaders);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of countCommas method, of class RetrieveEmployeeFile.
     */
    @Test
    public void testCountCommas() {
        System.out.println("countCommas");
        String line = "";
        RetrieveEmployeeFile instance = new RetrieveEmployeeFileImpl();
        int expResult = 0;
        int result = instance.countCommas(line);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of countRows method, of class RetrieveEmployeeFile.
     */
    @Test
    public void testCountRows() {
        System.out.println("countRows");
        File employeeFile = null;
        int headersAdded = 0;
        RetrieveEmployeeFile instance = new RetrieveEmployeeFileImpl();
        int expResult = 0;
        int result = instance.countRows(employeeFile, headersAdded);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class RetrieveEmployeeFileImpl extends RetrieveEmployeeFile {

        public boolean validateEmployeeFile() throws IOException {
            return false;
        }

        public void displayEmployeeArray() throws IOException {
        }

        public void setFileName() throws IOException {
        }
    }
    
}
