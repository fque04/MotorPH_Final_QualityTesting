/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.motorph;

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
public class SetLabelIT {
    
    public SetLabelIT() {
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
     * Test of setDesign method, of class SetLabel.
     */
    @Test
    public void testSetDesign() {
        System.out.println("setDesign");
        boolean addHeaderSpace = false;
        boolean addFooterSpace = false;
        SetLabel instance = new SetLabelImpl();
        instance.setDesign(addHeaderSpace, addFooterSpace);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createOptions method, of class SetLabel.
     */
    @Test
    public void testCreateOptions() throws Exception {
        System.out.println("createOptions");
        boolean login = false;
        SetLabel instance = new SetLabelImpl();
        instance.createOptions(login);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of LoginPage method, of class SetLabel.
     */
    @Test
    public void testLoginPage() {
        System.out.println("LoginPage");
        SetLabel instance = new SetLabelImpl();
        boolean expResult = false;
        boolean result = instance.LoginPage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class SetLabelImpl implements SetLabel {

        public void setDesign(boolean addHeaderSpace, boolean addFooterSpace) {
        }

        public void createOptions(boolean login) throws IOException {
        }

        public boolean LoginPage() {
            return false;
        }
    }
    
}
