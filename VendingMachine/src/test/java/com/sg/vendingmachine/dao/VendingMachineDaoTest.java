/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.dao;

import com.sg.vendingmachine.dao.VendingMachineDaoFileImpl;
import com.sg.vendingmachine.dao.VendingMachineDao;
import com.sg.vendingmachine.dto.Item;
import com.sg.vendingmachine.service.VendingMachineInsufficientFundsException;
import com.sg.vendingmachine.service.VendingMachineServiceLayer;
import com.sg.vendingmachine.service.VendingMachineServiceLayerImpl;
import java.math.BigDecimal;
import java.util.List;
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
public class VendingMachineDaoTest {
    
    private VendingMachineDao dao; // = new VendingMachineDaoFileImpl();
    private VendingMachineServiceLayer service; // = new VendingMachineServiceLayerImpl(dao);
    
    public VendingMachineDaoTest() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        service = ctx.getBean("serviceLayer", VendingMachineServiceLayer.class);
        dao = ctx.getBean("vendingMachineDao", VendingMachineDao.class);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws Exception {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of displayAllItems method, of class VendingMachineDao.
     */
    @Test
    public void testDisplayAllItems() throws Exception {
        assertEquals(8, dao.displayAllItems().size());
    }

    /**
     * Test of getItem method, of class VendingMachineDao.
     */
    @Test
    public void testGetItem() throws Exception {
        assertEquals("Coke", dao.getItem("A1").getItemName());
    }

    /**
     * Test of vendItem method, of class VendingMachineDao.
     */
    


}
