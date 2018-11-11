/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.S04UnitTests;

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
public class RotateLeftTest {
    
    private RotateLeft rotate = new RotateLeft();
    
    public RotateLeftTest() {
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
     * Test of rotateLeft method, of class RotateLeft.
     */
    @Test
    public void testRotateLeft() {
        Assert.assertArrayEquals(new int[]{2,3,1}, rotate.rotateLeft(new int[]{1,2,3}));
        Assert.assertArrayEquals(new int[]{11,9,5}, rotate.rotateLeft(new int[]{5,11,9}));
        Assert.assertArrayEquals(new int[]{0,0,7}, rotate.rotateLeft(new int[]{7,0,0}));
    }
    
}
