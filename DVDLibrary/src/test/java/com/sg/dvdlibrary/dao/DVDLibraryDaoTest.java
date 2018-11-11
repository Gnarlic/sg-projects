/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary.dao;

import com.sg.dvdlibrary.dto.Dvd;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Elnic
 */
public class DVDLibraryDaoTest {
    
    private DVDLibraryDao dao = new DVDLibraryDaoFileImpl();
    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    
    public DVDLibraryDaoTest() {
                
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
     * Test of addTitle method, of class DVDLibraryDao.
     */
    @Test
    public void testAddTitle() throws Exception {
        Dvd dvd = new Dvd("Flash Gordon");
        dvd.setDirectorName("Mike Hodges");
        dvd.setMpaaRating("PG");
        dvd.setReleaseDate(LocalDate.parse("05/12/1980", formatter));
        dvd.setStudio("Universal Pictures");
        dvd.setUserRating("8");
        
        dao.addTitle(dvd.getTitle(), dvd);
        
        Dvd fromDao = dao.getDvd(dvd.getTitle());
        
        assertEquals(dvd.getTitle(), fromDao.getTitle());
    }

    /**
     * Test of listAllDvds method, of class DVDLibraryDao.
     */
    @Test
    public void testListAllDvds() throws Exception {
        assertEquals(1, dao.listAllDvds().size());
    }

    /**
     * Test of getDvd method, of class DVDLibraryDao.
     */
    @Test
    public void testGetDvd() throws Exception {
        Dvd dvd = dao.getDvd("Flash Gordon");
        assertEquals("Flash Gordon", dvd.getTitle());
    }

    /**
     * Test of editDvd method, of class DVDLibraryDao.
     */
    @Test
    public void testEditDvd() throws Exception {
        Dvd dvd = dao.getDvd("Flash Gordon");
        dvd.setDirectorName("Rick Steves");
        dao.editDvd("Flash Gordon", dvd);
        assertTrue(dvd != dao.getDvd("Flash Gordon"));
        dvd.setDirectorName("Mike Hodges");
        dao.editDvd("Flash Gordon", dvd);
    }

    /**
     * Test of removeDvd method, of class DVDLibraryDao.
     */
    @Test
    public void testRemoveDvd() throws Exception {
        int size = dao.listAllDvds().size();
        Dvd dvd = dao.getDvd("Flash Gordon");
        dao.removeDvd("Flash Gordon");
        assertEquals((size-1), dao.listAllDvds().size());
        
        dao.addTitle("Flash Gordon", dvd);
    }
    
}
