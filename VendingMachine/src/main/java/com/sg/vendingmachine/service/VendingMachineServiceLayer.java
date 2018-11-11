/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.service;

import com.sg.vendingmachine.dao.VendingMachineInvalidItemException;
import com.sg.vendingmachine.dao.VendingMachineInventoryEmptyException;
import com.sg.vendingmachine.dao.VendingMachinePersistenceException;
import com.sg.vendingmachine.dto.Change;
import com.sg.vendingmachine.dto.Item;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Elnic
 */
public interface VendingMachineServiceLayer {
    public Item getItem(String itemId) throws VendingMachinePersistenceException;
    
    public BigDecimal addFunds(BigDecimal funds) throws VendingMachinePersistenceException ;
    
    public BigDecimal getFunds() throws VendingMachinePersistenceException;
    
    public List<Item> displayAllItems() throws VendingMachinePersistenceException;
    
    public void vendItem(String itemId) throws VendingMachinePersistenceException, VendingMachineInsufficientFundsException, VendingMachineInventoryEmptyException, VendingMachineInvalidItemException;
    
    public void removeFunds() throws VendingMachinePersistenceException;
    
    public Change getChange() throws VendingMachinePersistenceException;
    
    public void calculateChange() throws VendingMachinePersistenceException;
    
    
   
}
