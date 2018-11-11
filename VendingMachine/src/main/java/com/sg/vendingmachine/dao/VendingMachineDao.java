/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.dao;

import com.sg.vendingmachine.dto.Change;
import com.sg.vendingmachine.dto.Item;
import com.sg.vendingmachine.service.VendingMachineInsufficientFundsException;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Elnic
 */
public interface VendingMachineDao {
    
    public List<Item> displayAllItems() throws VendingMachinePersistenceException;

    public Item getItem(String itemId) throws VendingMachinePersistenceException ;
    
    public int getItemCount(String itemId) throws VendingMachinePersistenceException;
    
    public Item editItem(String itemId, Item item) throws VendingMachinePersistenceException;

}
