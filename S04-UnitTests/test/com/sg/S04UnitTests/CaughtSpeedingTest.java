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
public class CaughtSpeedingTest {
    private CaughtSpeeding speeding = new CaughtSpeeding();
    
    public CaughtSpeedingTest() {
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
     * Test of caughtSpeeding method, of class CaughtSpeeding.
     */
    @Test
    public void testCaughtSpeeding() {
        assertEquals(0, speeding.caughtSpeeding(60, false));
        assertEquals(1, speeding.caughtSpeeding(65, false));
        assertEquals(0, speeding.caughtSpeeding(65, true));
    }
    
}
