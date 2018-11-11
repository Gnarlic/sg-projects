 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.controller;

import com.sg.vendingmachine.dao.VendingMachineDao;
import com.sg.vendingmachine.dao.VendingMachineInvalidItemException;
import com.sg.vendingmachine.dao.VendingMachineInventoryEmptyException;
import com.sg.vendingmachine.dao.VendingMachinePersistenceException;
import com.sg.vendingmachine.dto.Item;
import com.sg.vendingmachine.service.VendingMachineInsufficientFundsException;
import com.sg.vendingmachine.service.VendingMachineServiceLayer;
import com.sg.vendingmachine.ui.VendingMachineView;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Elnic
 */
public class VendingMachineController {

    private VendingMachineView view;
    private VendingMachineServiceLayer service;
    //private VendingMachineDao dao;

    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        try {
            while (keepGoing) {
                menuSelection = getMenuSelection();

                switch (menuSelection) {
                    case 1:
                        listItems();
                        break;
                    case 2:
                        addFunds();
                        break;
                    case 3:
                        vendItem();
                        break;
                    case 4:
                        returnChange();
                        break;
                    case 5:
                        exit();
                        keepGoing = false;
                        break;
                    default:
                        unknownCommand();
                }
            }
        } catch (VendingMachinePersistenceException e) {
            view.displayErrorMessage(e.getMessage());

        }
    }

    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }

    private void listItems() throws VendingMachinePersistenceException {
        view.displayItemListBanner();
        List<Item> itemList = service.displayAllItems();
        view.displayItems(itemList);
        view.displayUserFunds(service.getFunds());
    }

    private void addFunds() throws VendingMachinePersistenceException {
        BigDecimal userFunds = service.getFunds();
        BigDecimal totalFunds = view.addFunds(userFunds);
        service.addFunds(totalFunds);
        view.displayUserFunds(service.getFunds());
    }

    private void vendItem() throws VendingMachinePersistenceException {
        view.vendItemBanner();
        String itemId = view.selectItemToVend();
        try {
                    service.vendItem(itemId);
                    view.displayVendSuccessBanner();
                    returnChange();
        } catch (VendingMachineInsufficientFundsException | VendingMachineInventoryEmptyException | VendingMachineInvalidItemException e) {
            view.displayErrorMessage(e.getMessage());
        }
    }

    private void unknownCommand() {
        view.unknownCommand();
    }
    
    private void returnChange() throws VendingMachinePersistenceException {
        service.calculateChange();
        view.displayChangeReturned(service.getChange());
        service.removeFunds();
    }

    public VendingMachineController(VendingMachineServiceLayer service, VendingMachineView view) {
        this.service = service;
        this.view = view;
    }
    
    public void exit() {
        view.displayExitBanner();
    }

}
