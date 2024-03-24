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
public class MotorPH_ContentsIT {
    
    public MotorPH_ContentsIT() {
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
     * Test of setDesign method, of class MotorPH_Contents.
     */
    @Test
    public void testSetDesign() {
        System.out.println("setDesign");
        boolean addFooterSpace = false;
        boolean addHeaderSpace = false;
        MotorPH_Contents instance = new MotorPH_Contents();
        instance.setDesign(addFooterSpace, addHeaderSpace);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of LoginPage method, of class MotorPH_Contents.
     */
    @Test
    public void testLoginPage() {
        System.out.println("LoginPage");
        MotorPH_Contents instance = new MotorPH_Contents();
        boolean expResult = false;
        boolean result = instance.LoginPage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of logout method, of class MotorPH_Contents.
     */
    @Test
    public void testLogout() {
        System.out.println("logout");
        MotorPH_Contents instance = new MotorPH_Contents();
        instance.logout();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayInformation method, of class MotorPH_Contents.
     */
    @Test
    public void testDisplayInformation() throws Exception {
        System.out.println("displayInformation");
        MotorPH_Contents instance = new MotorPH_Contents();
        instance.displayInformation();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setInput method, of class MotorPH_Contents.
     */
    @Test
    public void testSetInput() {
        System.out.println("setInput");
        String userInput = "";
        MotorPH_Contents instance = new MotorPH_Contents();
        String expResult = "";
        String result = instance.setInput(userInput);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createOptions method, of class MotorPH_Contents.
     */
    @Test
    public void testCreateOptions() throws Exception {
        System.out.println("createOptions");
        boolean login = false;
        MotorPH_Contents instance = new MotorPH_Contents();
        instance.createOptions(login);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
