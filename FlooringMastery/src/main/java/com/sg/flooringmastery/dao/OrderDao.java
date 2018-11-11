/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.dao;

import com.sg.flooringmastery.dto.Order;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Elnic
 */
public interface OrderDao {

    public List orderList(LocalDate orderDate) throws FlooringMasteryDaoPersistenceException;
    
    public Order addOrder(LocalDate orderDate, Order order) throws FlooringMasteryDaoPersistenceException;
    
    public void saveOrders(LocalDate orderDate) throws FlooringMasteryDaoPersistenceException;
    
    public List orderListByDate(LocalDate orderDate) throws FlooringMasteryDaoPersistenceException, NoOrderException;
    
    public int getOrderNumberAndIncrease() throws FlooringMasteryDaoPersistenceException;
    
    public void clearOrders();
    
    public Order orderToEdit(LocalDate date, int order) throws FlooringMasteryDaoPersistenceException, NoOrderException;

    public void removeOrder(LocalDate date, int orderNum) throws FlooringMasteryDaoPersistenceException, NoOrderException;
    
    
}
