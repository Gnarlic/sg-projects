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
public class FirstLast6Test {
    
    FirstLast6 firstLast6 = new FirstLast6();
    
    public FirstLast6Test() {
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
    public void test6Last() {
        int[] numbers = {1, 2, 6};
        assertTrue(firstLast6.firstLast6(numbers));
    }
    
    @Test
    public void test6First() {
        int [] numbers = {6, 1, 2, 3};
        assertTrue(firstLast6.firstLast6(numbers));
    }
    
    @Test
    public void test6Middle() {
        int [] numbers = {13, 6, 1, 2, 3};
        assertFalse(firstLast6.firstLast6(numbers));
    }
    
    
    
}
