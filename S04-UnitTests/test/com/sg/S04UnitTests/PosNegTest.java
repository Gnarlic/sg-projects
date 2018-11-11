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
public class PosNegTest {
    
    private PosNeg posNeg = new PosNeg();
    
    public PosNegTest() {
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
     * Test of posNeg method, of class PosNeg.
     */
    @Test
    public void testPosNeg() {
        assertTrue(posNeg.posNeg(1, -1, false));
        assertTrue(posNeg.posNeg(-1, 1, false));
        assertTrue(posNeg.posNeg(-4, -5, true));
    }
    
}
