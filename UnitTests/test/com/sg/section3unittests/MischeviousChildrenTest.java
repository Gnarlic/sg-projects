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
public class MischeviousChildrenTest {
    
    MischeviousChildren mischief = new MischeviousChildren();
    
    public MischeviousChildrenTest() {
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
    public void bothSmiling() {
        assertTrue(mischief.areWeInTrouble(true, true));
    }
    
    @Test
    public void neitherSmiling() {
        assertTrue(mischief.areWeInTrouble(false, false));
    }
    
    @Test
    public void oneSmiling() {
        assertFalse(mischief.areWeInTrouble(true, false));
    }
    
}
