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
public class CanHazTableTest {
    
    CanHazTable table = new CanHazTable();
    
    public CanHazTableTest() {
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
    public void tableTest5And10() {
        int expectedResult = 2;
        assertEquals(expectedResult, table.canHazTable(5, 10));
    }
    
    @Test
    public void tableTest5And2() {
        int expectedResult = 0;
        assertEquals(expectedResult, table.canHazTable(5, 2));
    }
    
    @Test
    public void tableTest5And5() {
        int expectedResult = 1;
        assertEquals(expectedResult, table.canHazTable(5, 5));
    }
    
}
