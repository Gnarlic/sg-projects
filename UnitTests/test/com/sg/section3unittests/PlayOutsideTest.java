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
public class PlayOutsideTest {
    
    PlayOutside play = new PlayOutside();
    
    public PlayOutsideTest() {
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
    public void testPlay70() {
        assertTrue(play.playOutside(70, false));
    }
    
    @Test
    public void testPlay95() {
        assertFalse(play.playOutside(95, false));
    }
    
    @Test
    public void testPlay95Summer() {
        assertTrue(play.playOutside(95, true));
    }
    
}
