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
public class AlarmClockTest {
    
    private AlarmClock aClock = new AlarmClock();
    
    public AlarmClockTest() {
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
     * Test of alarmClock method, of class AlarmClock.
     */
    @Test
    public void testAlarmClock() {
        assertEquals("7:00", aClock.alarmClock(1, false));
        assertEquals("7:00", aClock.alarmClock(5, false));
        assertEquals("10:00", aClock.alarmClock(0, false));
    }
    
}
