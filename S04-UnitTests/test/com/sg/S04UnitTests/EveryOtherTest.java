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
public class EveryOtherTest {
    
    private EveryOther other = new EveryOther();
    
    public EveryOtherTest() {
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
     * Test of everyOther method, of class EveryOther.
     */
    @Test
    public void testEveryOther() {
        assertEquals("Hlo", other.everyOther("Hello"));
        assertEquals("H", other.everyOther("Hi"));
        assertEquals("Hello", other.everyOther("Heeololeo"));
    }
    
}
