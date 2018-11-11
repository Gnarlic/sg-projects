/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.service;

import com.sg.vendingmachine.service.VendingMachineServiceLayer;
import com.sg.vendingmachine.service.VendingMachineServiceLayerImpl;
import com.sg.vendingmachine.dao.VendingMachineDao;
import com.sg.vendingmachine.dao.VendingMachineDaoFileImpl;
import com.sg.vendingmachine.dao.VendingMachineInventoryEmptyException;
import com.sg.vendingmachine.dao.VendingMachinePersistenceException;
import com.sg.vendingmachine.dto.Item;
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
public class VendingMachineServiceLayerTest {
    public VendingMachineDao dao; // = new VendingMachineDaoFileImpl();
    private VendingMachineServiceLayer service; //= new VendingMachineServiceLayerImpl(dao);
    
    public VendingMachineServiceLayerTest() {
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
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getItem method, of class VendingMachineServiceLayer.
     */
    @Test
    public void testGetItem() throws Exception {
        Item item = service.getItem("A1");
        BigDecimal cost = new BigDecimal("1.50");
        assertEquals(cost, item.getItemPrice());
    }

    /**
     * Test of addFunds method, of class VendingMachineServiceLayer.
     */
    @Test
    public void testAddFunds() throws Exception {
        service.addFunds(BigDecimal.ONE);
        assertEquals(new BigDecimal("1.00"), service.getFunds());
    }

    /**
     * Test of getFunds method, of class VendingMachineServiceLayer.
     */
    @Test
    public void testGetFunds() throws Exception {
        service.addFunds(BigDecimal.ONE);
        assertEquals(new BigDecimal("1.00"), service.getFunds());
    }

    /**
     * Test of displayAllItems method, of class VendingMachineServiceLayer.
     */
    @Test
    public void testDisplayAllItems() throws Exception {
        assertEquals(8, service.displayAllItems().size());
    }

    /**
     * Test of vendItem method, of class VendingMachineServiceLayer.
     */
    @Test
    public void testVendItem() throws Exception {
        service.addFunds(new BigDecimal("1.50"));
        Item item = service.getItem("A1");
        int count = dao.getItemCount(item.getItemId());
        service.vendItem(item.getItemId());
        int countAfterVend = dao.getItemCount(item.getItemId());
        assertEquals(count-1, countAfterVend);
        
    }
    
    @Test
    public void removeFunds() throws Exception {
        BigDecimal funds = new BigDecimal("0.00");
        service.removeFunds();
        assertEquals(funds, service.getFunds());
    }
    
}
