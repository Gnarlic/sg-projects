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
public class TrimOneTest {
    
    private TrimOne trim = new TrimOne();
    
    public TrimOneTest() {
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
     * Test of trimOne method, of class TrimOne.
     */
    @Test
    public void testTrimOne() {
        assertEquals("ell", trim.trimOne("Hello"));
        assertEquals("av", trim.trimOne("java"));
        assertEquals("odin", trim.trimOne("coding"));
    }
    
}
