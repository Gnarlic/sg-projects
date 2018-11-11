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
public class SkipSumTest {
    
    private SkipSum sum = new SkipSum();
    
    public SkipSumTest() {
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
     * Test of skipSum method, of class SkipSum.
     */
    @Test
    public void testSkipSum() {
        assertEquals(7, sum.skipSum(3, 4));
        assertEquals(20, sum.skipSum(9, 4));
        assertEquals(21, sum.skipSum(10, 11));
    }
    
}
