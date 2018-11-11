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
public class FrontTimesTest {
    
    FrontTimes times = new FrontTimes();
    
    public FrontTimesTest() {
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
    public void testChocolate2() {
        String expectedResult = "ChoCho";
        assertEquals(expectedResult, times.frontTimes("Chocolate", 2));
    }
    
    @Test
    public void testChocolate3() {
        String expectedResult = "ChoChoCho";
        assertEquals(expectedResult, times.frontTimes("Chocolate", 3));
    }
    
    @Test
    public void testAbc3() {
        String expectedResult = "AbcAbcAbc";
        assertEquals(expectedResult, times.frontTimes("Abc", 3));
    }
    
}
