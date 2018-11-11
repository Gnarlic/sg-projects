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
public class InsertWordTest {
    
    private InsertWord insert = new InsertWord();
    
    public InsertWordTest() {
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
     * Test of insertWord method, of class InsertWord.
     */
    @Test
    public void testInsertWord() {
        assertEquals("<<Yay>>", insert.insertWord("<<>>", "Yay"));
        assertEquals("<<WooHoo>>", insert.insertWord("<<>>", "WooHoo"));
        assertEquals("[[word]]", insert.insertWord("[[]]", "word"));
    }
    
}
