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
public class CommonEndTest {
    
    private CommonEnd common = new CommonEnd();
    
    public CommonEndTest() {
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
     * Test of commonEnd method, of class CommonEnd.
     */
    @Test
    public void testCommonEnd() {
        assertTrue(common.commonEnd(new int[]{1,2,3}, new int[]{7,3}));
        assertFalse(common.commonEnd(new int[] {1,2,3},new int[]{7,3,2}));
        assertTrue(common.commonEnd(new int[]{1,2,3}, new int[]{1,3}));
    }
    
}
