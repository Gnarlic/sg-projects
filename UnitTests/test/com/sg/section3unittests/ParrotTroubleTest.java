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
public class ParrotTroubleTest {
    
    ParrotTrouble parrot = new ParrotTrouble();
    
    public ParrotTroubleTest() {
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
    public void testTalkAt6() {
        assertTrue(parrot.parrotTrouble(true, 6));
    }
    
    @Test
    public void testTalkAt7() {
        assertFalse(parrot.parrotTrouble(true, 7));
    }
    
    @Test
    public void testSilentAt6() {
        assertFalse(parrot.parrotTrouble(false, 6));
    }
    
}
