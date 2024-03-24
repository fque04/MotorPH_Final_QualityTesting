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
public class EmployeeCalculationsIT {
    
    public EmployeeCalculationsIT() {
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
     * Test of getHoursOfWork method, of class EmployeeCalculations.
     */
    @Test
    public void testGetHoursOfWork() throws Exception {
        System.out.println("getHoursOfWork");
        String empID = "";
        String from_date = "";
        String to_date = "";
        EmployeeCalculations instance = new EmployeeCalculations();
        int expResult = 0;
        int result = instance.getHoursOfWork(empID, from_date, to_date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHourlyRate method, of class EmployeeCalculations.
     */
    @Test
    public void testGetHourlyRate() throws Exception {
        System.out.println("getHourlyRate");
        String empNumber = "";
        EmployeeCalculations instance = new EmployeeCalculations();
        double expResult = 0.0;
        double result = instance.getHourlyRate(empNumber);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGrossPay method, of class EmployeeCalculations.
     */
    @Test
    public void testGetGrossPay() throws Exception {
        System.out.println("getGrossPay");
        String empNumber = "";
        String startDate = "";
        String endDate = "";
        EmployeeCalculations instance = new EmployeeCalculations();
        double expResult = 0.0;
        double result = instance.getGrossPay(empNumber, startDate, endDate);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertHour method, of class EmployeeCalculations.
     */
    @Test
    public void testConvertHour() {
        System.out.println("convertHour");
        String Time = "";
        EmployeeCalculations instance = new EmployeeCalculations();
        int expResult = 0;
        int result = instance.convertHour(Time);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertDate method, of class EmployeeCalculations.
     */
    @Test
    public void testConvertDate() {
        System.out.println("convertDate");
        String Date = "";
        EmployeeCalculations instance = new EmployeeCalculations();
        int expResult = 0;
        int result = instance.convertDate(Date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWithHoldingTax method, of class EmployeeCalculations.
     */
    @Test
    public void testGetWithHoldingTax() {
        System.out.println("getWithHoldingTax");
        double taxableIncome = 0.0;
        EmployeeCalculations instance = new EmployeeCalculations();
        double expResult = 0.0;
        double result = instance.getWithHoldingTax(taxableIncome);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNetPay method, of class EmployeeCalculations.
     */
    @Test
    public void testGetNetPay() throws Exception {
        System.out.println("getNetPay");
        String empNumber = "";
        String startDate = "";
        String endDate = "";
        EmployeeCalculations instance = new EmployeeCalculations();
        double expResult = 0.0;
        double result = instance.getNetPay(empNumber, startDate, endDate);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
