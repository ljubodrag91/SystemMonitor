/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.misc;

import java.awt.Graphics;
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
public class CustomPanelNGTest {
    
    public CustomPanelNGTest() {
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
     * Test of updateProgress method, of class CustomPanel.
     */
    @Test
    public void testUpdateProgress() {
        System.out.println("updateProgress");
        double progress_value = 100.0;
        CustomPanel instance = new CustomPanel();
        
        // TODO review the generated test code and remove the default call to fail.
        while(progress_value>0){
            instance.updateProgress(progress_value);
            progress_value-=10;
        }
        if(progress_value ==100.0){
        fail("Not Changing");
        }
    }

    /**
     * Test of paint method, of class CustomPanel.
     
    @Test
    public void testPaint() {
        System.out.println("paint");
        Graphics g = null;
        CustomPanel instance = new CustomPanel();
        instance.paint(g);
    }
    */
}
