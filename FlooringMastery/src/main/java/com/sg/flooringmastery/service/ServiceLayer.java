/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.service;

import com.sg.flooringmastery.dao.FlooringMasteryDaoPersistenceException;
import com.sg.flooringmastery.dao.NoOrderException;
import com.sg.flooringmastery.dto.Order;
import com.sg.flooringmastery.dto.Products;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Elnic
 */
public interface ServiceLayer {
    
    public List<Order> displayOrders(LocalDate orderDate) throws FlooringMasteryDaoPersistenceException, NoOrderException;

    public Order collectOrderInfo(LocalDate date, String name, String state, String productType, BigDecimal area) throws FlooringMasteryDaoPersistenceException, InvalidInputException;
    
    public List listTax() throws FlooringMasteryDaoPersistenceException;

    public void setWorkMode(boolean mode);
    
    public Order editOrder(LocalDate date, int orderNum) throws FlooringMasteryDaoPersistenceException, NoOrderException;
    
    public void saveWork() throws FlooringMasteryDaoPersistenceException;
    
    public void clearOrders();

    public List<Products> listProducts() throws FlooringMasteryDaoPersistenceException;
    
    public int orderNum() throws FlooringMasteryDaoPersistenceException;

    public void removeOrder(LocalDate date, int orderNum) throws FlooringMasteryDaoPersistenceException, NoOrderException;
    
    public void addOrder(LocalDate date, Order order) throws FlooringMasteryDaoPersistenceException;
    
    public boolean getWorkMode();

    public void compareOrders(Order newOrder, Order editedOrder, int orderNum, LocalDate orderDate) throws FlooringMasteryDaoPersistenceException, NoOrderException;
    
}
