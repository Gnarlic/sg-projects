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
public class MultipleEndingsTest {
    
    private MultipleEndings endings = new MultipleEndings();
    
    public MultipleEndingsTest() {
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
     * Test of multipleEndings method, of class MultipleEndings.
     */
    @Test
    public void testMultipleEndings() {
        assertEquals("lololo", endings.multipleEndings("Hello"));
        assertEquals("ababab", endings.multipleEndings("ab"));
        assertEquals("HiHiHi", endings.multipleEndings("Hi"));
    }
    
}
