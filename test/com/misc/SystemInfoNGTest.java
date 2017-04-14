/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.misc;

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
public class SystemInfoNGTest {
    
    public SystemInfoNGTest() {
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
     * Test of OSname method, of class SystemInfo.
     */
    @Test
    public void testOSname() {
        System.out.println("OSname");
        String expResult = "";
        String result = SystemInfo.OSname();
        assertNotNull(result);
        
    }

    /**
     * Test of OSversion method, of class SystemInfo.
     */
    @Test
    public void testOSversion() {
        System.out.println("OSversion");
        String expResult = "";
        String result = SystemInfo.OSversion();
        assertNotNull(result);
    }

    /**
     * Test of getRealArchWindows method, of class SystemInfo.
     */
    @Test
    public void testGetRealArchWindows() {
        System.out.println("getRealArchWindows");
        String expResult = "";
        String result = SystemInfo.getRealArchWindows();
        assertNotNull(result);
    }

    /**
     * Test of OsArch method, of class SystemInfo.
     */
    @Test
    public void testOsArch() {
        System.out.println("OsArch");
        String expResult = "";
        String result = SystemInfo.OsArch();
        assertNotNull(result);
    }

    /**
     * Test of totalMem method, of class SystemInfo.
     */
    @Test
    public void testTotalMem() {
        System.out.println("totalMem");
        long expResult = 0L;
        long result = SystemInfo.totalMem();
        assertNotNull(result);
    }

    /**
     * Test of usedMem method, of class SystemInfo.
     */
    @Test
    public void testUsedMem() {
        System.out.println("usedMem");
        long expResult = 0L;
        long result = SystemInfo.usedMem();
        assertNotNull(result);
    }
    
}
