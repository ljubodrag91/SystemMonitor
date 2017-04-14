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
public class DISK_InfoNGTest {
    
    public DISK_InfoNGTest() {
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
     * Test of getDiskPercentUsage method, of class DISK_Info.
     */
    @Test
    public void testGetDiskPercentUsage() {
        System.out.println("getDiskPercentUsage");
        int i = 0;
        double expResult = 0.0;
        double result = DISK_Info.getDiskPercentUsage(i);
        assertNotEquals(result, expResult);
        assertNotNull(result);
    }
    
}
