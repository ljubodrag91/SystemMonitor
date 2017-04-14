/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.misc;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import org.testng.Assert;
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
public class SetIconNGTest {
    
    public SetIconNGTest() {
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
     * Test of setIcon method, of class SetIcon.
     */
    @Test
    public void testSetIcon() {
        System.out.println("setIcon");
        JFrame frame = new JFrame();
        SetIcon instance = new SetIcon();
        instance.setIcon(frame);
        // TODO review the generated test code and remove the default call to fail.
        
        Image actual = frame.getIconImage();
        Image expected = new ImageIcon(getClass().getClassLoader().getResource("resources/icon.png")).getIma‌​ge();
        Assert.assertEquals(actual, expected, null);
    }
    
}
