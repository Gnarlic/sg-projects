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
public class SameFirstLastTest {
    
    SameFirstLast sameFirstLast = new SameFirstLast();
    
    public SameFirstLastTest() {
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
     * Test of sameFirstLast method, of class SameFirstLast.
     */
    @Test
    public void test123() {
        int[] numbers = {1, 2, 3};
        assertFalse(sameFirstLast.sameFirstLast(numbers));
    }
    
    @Test
    public void test1231() {
        int[] numbers = {1, 2, 3, 1};
        assertTrue(sameFirstLast.sameFirstLast(numbers));
    }
    
    @Test
    public void test121() {
        int[] numbers = {1, 2, 1};
        assertTrue(sameFirstLast.sameFirstLast(numbers));
    }
    
}
