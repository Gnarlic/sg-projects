/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.classroster.dao;

import com.sg.classroster.dto.Student;
import java.util.List;
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
public class ClassRosterDaoTest {
    
    private ClassRosterDao dao = new ClassRosterDaoFileImpl();
    
    public ClassRosterDaoTest() {
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
     * Test of addStudent method, of class ClassRosterDao.
     */
    @org.junit.Test
    public void testAddStudent() throws Exception {
        
    }

    /**
     * Test of getAllStudents method, of class ClassRosterDao.
     */
    @org.junit.Test
    public void testGetAllStudents() throws Exception {
        System.out.println("getAllStudents");
        ClassRosterDao instance = new ClassRosterDaoImpl();
        List<Student> expResult = null;
        List<Student> result = instance.getAllStudents();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudent method, of class ClassRosterDao.
     */
    @org.junit.Test
    public void testGetStudent() throws Exception {
        System.out.println("getStudent");
        String studentId = "";
        ClassRosterDao instance = new ClassRosterDaoImpl();
        Student expResult = null;
        Student result = instance.getStudent(studentId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeStudent method, of class ClassRosterDao.
     */
    @org.junit.Test
    public void testRemoveStudent() throws Exception {
        System.out.println("removeStudent");
        String studentId = "";
        ClassRosterDao instance = new ClassRosterDaoImpl();
        Student expResult = null;
        Student result = instance.removeStudent(studentId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class ClassRosterDaoImpl implements ClassRosterDao {

        public Student addStudent(String studentId, Student student) throws ClassRosterPersistenceException {
            return null;
        }

        public List<Student> getAllStudents() throws ClassRosterPersistenceException {
            return null;
        }

        public Student getStudent(String studentId) throws ClassRosterPersistenceException {
            return null;
        }

        public Student removeStudent(String studentId) throws ClassRosterPersistenceException {
            return null;
        }
    }
    
}
