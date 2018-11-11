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
public class CountXXTest {
    
    CountXX count = new CountXX();
    
    public CountXXTest() {
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
     * Test of countXX method, of class CountXX.
     */
    @Test
    public void testCountXXabcxx() {
        assertEquals(1, count.countXX("abcxx"));
    }
    
    @Test
    public void testCountXXxxx() {
        assertEquals(2, count.countXX("xxx"));
    }
    
    @Test
    public void testCountXXxxxx() {
        assertEquals(3, count.countXX("xxxx"));
    }
    
}
