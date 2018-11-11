/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.dao;

/**
 *
 * @author Elnic
 */
public class VendingMachineInventoryEmptyException extends Exception {
     public VendingMachineInventoryEmptyException(String message) {
        super(message);
    }
    
    public VendingMachineInventoryEmptyException(String message, Throwable cause) {
        super(message, cause);
    }
}
