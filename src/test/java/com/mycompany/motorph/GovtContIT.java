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
public class GovtContIT {
    
    public GovtContIT() {
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
     * Test of SssContribution method, of class GovtCont.
     */
    @Test
    public void testSssContribution() {
        System.out.println("SssContribution");
        double monthlySalary = 0.0;
        GovtCont instance = new GovtCont();
        double expResult = 0.0;
        double result = instance.SssContribution(monthlySalary);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of philhealthContribution method, of class GovtCont.
     */
    @Test
    public void testPhilhealthContribution() {
        System.out.println("philhealthContribution");
        double monthlySal = 0.0;
        GovtCont instance = new GovtCont();
        double expResult = 0.0;
        double result = instance.philhealthContribution(monthlySal);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pagibigContribution method, of class GovtCont.
     */
    @Test
    public void testPagibigContribution() {
        System.out.println("pagibigContribution");
        double monthlySal = 0.0;
        GovtCont instance = new GovtCont();
        double expResult = 0.0;
        double result = instance.pagibigContribution(monthlySal);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalGovernmentCont method, of class GovtCont.
     */
    @Test
    public void testGetTotalGovernmentCont() {
        System.out.println("getTotalGovernmentCont");
        double sss = 0.0;
        double philhealth = 0.0;
        double pagibig = 0.0;
        GovtCont instance = new GovtCont();
        double expResult = 0.0;
        double result = instance.getTotalGovernmentCont(sss, philhealth, pagibig);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaxableIncome method, of class GovtCont.
     */
    @Test
    public void testGetTaxableIncome() throws Exception {
        System.out.println("getTaxableIncome");
        String empNumber = "";
        String startDate = "";
        String endDate = "";
        GovtCont instance = new GovtCont();
        double expResult = 0.0;
        double result = instance.getTaxableIncome(empNumber, startDate, endDate);
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
