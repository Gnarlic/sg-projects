/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.section3unittests;

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
public class SleepingInTest {
    
    SleepingIn sleep = new SleepingIn();
    
    public SleepingInTest() {
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

    @Test
    public void testWeekend() {
        assertTrue(sleep.canSleepIn(false, false));
    }
    
    @Test
    public void testWeekday() {
        assertFalse(sleep.canSleepIn(true, false));
    }
    
    @Test
    public void testVaction() {
        assertTrue(sleep.canSleepIn(false, true));
    }
    
}
