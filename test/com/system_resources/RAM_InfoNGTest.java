/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system_resources;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Shadow
 */
public class RAM_InfoNGTest {
    
    public RAM_InfoNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getRamPercentUsage method, of class RAM_Info.
     */
    @Test
    public void testGetRamPercentUsage() {
        System.out.println("getRamPercentUsage");
        double expResult = 0.0;
        double result = RAM_Info.getRamPercentUsage();
        assertNotEquals(result, expResult);
        assertNotNull(result);
    }
    
}
