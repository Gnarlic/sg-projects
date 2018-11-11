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
public class NearHundredTest {
    
    private NearHundred near = new NearHundred();
    
    public NearHundredTest() {
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
     * Test of nearHundred method, of class NearHundred.
     */
    @Test
    public void testNearHundred() {
        assertTrue(near.nearHundred(103));
        assertTrue(near.nearHundred(90));
        assertFalse(near.nearHundred(89));
    }
    
}
