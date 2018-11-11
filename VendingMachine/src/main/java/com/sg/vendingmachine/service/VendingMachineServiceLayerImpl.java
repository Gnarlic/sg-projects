/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.service;

import com.sg.vendingmachine.dao.VendingMachineDao;
import com.sg.vendingmachine.dao.VendingMachineInvalidItemException;
import com.sg.vendingmachine.dao.VendingMachineInventoryEmptyException;
import com.sg.vendingmachine.dao.VendingMachinePersistenceException;
import com.sg.vendingmachine.dto.Change;
import com.sg.vendingmachine.dto.Item;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

/**
 *
 * @author Elnic
 */
public class VendingMachineServiceLayerImpl implements VendingMachineServiceLayer{
    private VendingMachineDao dao;
    BigDecimal totalFunds;
    Change change = new Change();
    
    public VendingMachineServiceLayerImpl(VendingMachineDao dao) {
        this.dao = dao;
    }
    

    @Override
    public Item getItem(String itemId) throws VendingMachinePersistenceException {
        return dao.getItem(itemId);
    }

    @Override
    public BigDecimal addFunds(BigDecimal funds) throws VendingMachinePersistenceException {
        if (totalFunds == null) {
            totalFunds = BigDecimal.ZERO;
        }
        this.totalFunds = totalFunds.add(funds).setScale(2, RoundingMode.CEILING);
        return totalFunds;
    }

    @Override
    public BigDecimal getFunds() throws VendingMachinePersistenceException {
        if (totalFunds == null) {
            totalFunds = BigDecimal.ZERO;
        }
        return totalFunds.setScale(2, RoundingMode.CEILING);
    }

    @Override
    public List<Item> displayAllItems()throws VendingMachinePersistenceException{
        return dao.displayAllItems();
    }

    @Override
    public void vendItem(String itemId) throws VendingMachinePersistenceException, VendingMachineInsufficientFundsException, VendingMachineInventoryEmptyException, VendingMachineInvalidItemException {
        
        Item item = dao.getItem(itemId);
        if (item == null) {
            throw new VendingMachineInvalidItemException("Invalid item");
        }
        if (item.getItemCount() == 0) {
            throw new VendingMachineInventoryEmptyException("This item is out of stock.");
        }
        if (item.getItemPrice().compareTo(getFunds()) > 0) {
            throw new VendingMachineInsufficientFundsException("Insufficient Funds.");
        }
        Item itemToVend = dao.getItem(itemId);
        if (itemToVend.getItemCount() > 0) {
            itemToVend.setItemCount(itemToVend.getItemCount()-1);
        }
        dao.editItem(itemId, itemToVend);
        totalFunds = totalFunds.subtract(item.getItemPrice());
        
        
        }
    
    @Override
    public void calculateChange() throws VendingMachinePersistenceException {
        BigDecimal returnChange = totalFunds.multiply(new BigDecimal("100"));
        change.setQuarters(returnChange.divide(new BigDecimal("25"), 0, RoundingMode.FLOOR));
        returnChange = returnChange.subtract(change.getQuarters().multiply(new BigDecimal("25")));
        change.setDimes(returnChange.divide(new BigDecimal("10"), 0, RoundingMode.FLOOR));
        returnChange = returnChange.subtract(change.getDimes().multiply(new BigDecimal("10")));
        change.setNickels(returnChange.divide(new BigDecimal("5"), 0, RoundingMode.FLOOR));
        returnChange = returnChange.subtract(change.getNickels().multiply(new BigDecimal("5")));
        change.setPennies(returnChange.divide(new BigDecimal("1"), 0, RoundingMode.FLOOR));
        returnChange = returnChange.subtract(change.getPennies());
    }
    
    @Override
    public void removeFunds() {
        totalFunds = BigDecimal.ZERO;
    }
    
    public Change getChange() throws VendingMachinePersistenceException {
        return change;
    }
    
    

}
