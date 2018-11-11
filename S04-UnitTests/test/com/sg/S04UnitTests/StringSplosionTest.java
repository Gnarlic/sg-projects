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
public class StringSplosionTest {
    
    private StringSplosion splosion = new StringSplosion();
    
    public StringSplosionTest() {
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
     * Test of stringSplosion method, of class StringSplosion.
     */
    @Test
    public void testStringSplosion() {
        assertEquals("CCoCodCode", splosion.stringSplosion("Code"));
        assertEquals("aababc", splosion.stringSplosion("abc"));
        assertEquals("aab", splosion.stringSplosion("ab"));
    }
    
}
