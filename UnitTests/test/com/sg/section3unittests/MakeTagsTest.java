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
public class MakeTagsTest {
    
    MakeTags tags = new MakeTags();
    
    public MakeTagsTest() {
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
    public void testYay() {
        assertEquals("<i>Yay</i>", tags.makeTags("i","Yay"));
    }
    
    @Test
    public void testHello() {
        assertEquals("<i>Hello</i>", tags.makeTags("i","Hello"));
    }
    
    @Test
    public void testCite() {
        assertEquals("<cite>Yay</cite>", tags.makeTags("cite", "Yay"));
    }
    
}
