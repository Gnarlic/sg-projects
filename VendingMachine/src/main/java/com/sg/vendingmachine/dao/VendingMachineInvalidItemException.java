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
public class VendingMachineInvalidItemException extends Exception{
    public VendingMachineInvalidItemException(String message) {
        super(message);
}

    public VendingMachineInvalidItemException(String message, Throwable cause) {
        super(message);
}
}
