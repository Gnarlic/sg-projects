/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.ui;

import com.sg.vendingmachine.dto.Change;
import com.sg.vendingmachine.dto.Item;
import com.sg.vendingmachine.service.VendingMachineServiceLayer;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Elnic
 */
public class VendingMachineView {
    
    private UserIO io;
    public VendingMachineView(UserIO io) {
        this.io = io;
    }
        
    public int printMenuAndGetSelection() {
        io.print("Vendo-o-Tron Menu");
        io.print("1. List Items");
        io.print("2. Add Funds");
        io.print("3. Vend Item");
        io.print("4. Return Change");
        io.print("5. Exit");
        
        return io.readInt("Please Select Menu Option", 1, 5);
    }
    
    public void displayItems(List<Item> itemList) {
        for (Item currentItem : itemList) {
            if(currentItem.getItemCount() > 0) {
            io.print(currentItem.getItemId() + ": "
                + currentItem.getItemName() + ":$"
                + currentItem.getItemPrice());
        }
            }
    }
    
    public void displayItemListBanner() {
        io.print("=== Vending Menu ===");
    }
        
    public void vendItemBanner() {
        io.print("=== Select Item ===");
    }
    
    public String selectItemToVend() {
        String itemId = io.readString("Please Enter Item Id number.");
        return itemId;
    }
    
    public void displayErrorMessage(String errorMsg) {
        io.print("=== ERROR ===");
        io.print(errorMsg);
    }

    public void displayUserFunds(BigDecimal totalFunds) {
        io.print("You currently have $"+ totalFunds +" to spend.");
        io.readString("Please hit enter to continue.");
    }
    
    public void unknownCommand() {
        io.print("Unknown Command");
    }

    public void displayVendSuccessBanner() {
        io.print("Item successfully vended.");
    }

    public BigDecimal addFunds(BigDecimal funds) {
        BigDecimal newFunds = io.readBigDecimal("Please enter funds (0.00)");
        return newFunds;
    }

    public void displayChangeReturned(Change change) {
        
        io.print("Your change is: " + change.getQuarters() + " quarters,\n"
                + change.getDimes() + " dimes\n"
                + change.getNickels() + " nickels\n"
                + change.getPennies() + " pennies");
    }
    
    public void displayExitBanner() {
        io.print("May the Force be with you! ...and our products.");
        
    }
    
}
