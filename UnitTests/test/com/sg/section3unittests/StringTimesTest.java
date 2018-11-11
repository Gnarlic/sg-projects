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
public class StringTimesTest {
    
    StringTimes stringTimes = new StringTimes();
    
    public StringTimesTest() {
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
     * Test of stringTimes method, of class StringTimes.
     */
    @Test
    public void testStringTimesOne() {
        String expectedResult = "Hi";
        assertEquals(expectedResult, stringTimes.stringTimes("Hi", 1));
    }
    
    @Test
    public void testStringTimesTwo() {
        String expectedResult = "HiHi";
        assertEquals(expectedResult, stringTimes.stringTimes("Hi", 2));
    }
    
    @Test
    public void testStringTimesThree() {
        String expectedResult = "HiHiHi";
        assertEquals(expectedResult, stringTimes.stringTimes("Hi", 3));
    }
        
    
}
