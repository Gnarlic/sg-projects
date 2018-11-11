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
public class SumDoubleTest {
    
    SumDouble doubleSum = new SumDouble();
    
    public SumDoubleTest() {
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
    public void test1And2() {
        assertEquals(3, doubleSum.sumDouble(1, 2));
    }
    
    @Test
    public void test3And2() {
        assertEquals(5, doubleSum.sumDouble(3,2));
    }
    
    @Test
    public void test2And2() {
        assertEquals(8, doubleSum.sumDouble(2,2));
    }
    
}
