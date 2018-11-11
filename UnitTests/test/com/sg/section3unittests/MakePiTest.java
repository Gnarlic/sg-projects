/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.section3unittests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Elnic
 */
public class MakePiTest {
    
    MakePi pi = new MakePi();
    
    public MakePiTest() {
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
     * Test of makePi method, of class MakePi.
     */
    @Test
    public void testMakePi() {
        int[] expectedResult = {3,1,4};
        Assert.assertArrayEquals(expectedResult, pi.makePi(3));
    }
    
}
