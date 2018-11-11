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
public class LongInMiddleTest {
    
    private LongInMiddle middle = new LongInMiddle();
    
    public LongInMiddleTest() {
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
     * Test of longInMiddle method, of class LongInMiddle.
     */
    @Test
    public void testLongInMiddle() {
        assertEquals("hiHellohi", middle.longInMiddle("Hello", "hi"));
        assertEquals("hiHellohi", middle.longInMiddle("hi", "Hello"));
        assertEquals("baaab", middle.longInMiddle("aaa", "b"));
    }
    
}
