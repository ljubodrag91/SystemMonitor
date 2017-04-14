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
public class CPU_InfoNGTest {
    
    public CPU_InfoNGTest() {
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
     * Test of getProcessCpuLoad method, of class CPU_Info.
     */
    @Test(timeOut = 800,enabled = false)
    public void testGetProcessCpuLoad() throws Exception {
        System.out.println("getProcessCpuLoad");
        long timeStarted=System.currentTimeMillis();
        double expResult = 0.0;
        double result = 0.0;
        
        while(result == 0.0){
         result = CPU_Info.getProcessCpuLoad();
            if(result!=0.0){
            break;
            }
        }
        long timeEnded=System.currentTimeMillis();
        
        System.out.println("CpuLoad data fetched after :"+(timeEnded-timeStarted)+" miliseconds");
        
        assertNotNull(result);
        assertNotEquals(result, expResult);
        
    }
    
}
