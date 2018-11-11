/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.S04UnitTests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Elnic
 */
public class Makes10Test {
    
    private Makes10 makes = new Makes10();
    
    public Makes10Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of makes10 method, of class Makes10.
     */
    @Test
    public void testMakes10() {
        assertTrue(makes.makes10(9, 10));
        assertFalse(makes.makes10(9, 9));
        assertTrue(makes.makes10(1, 9));
    }
    
}
