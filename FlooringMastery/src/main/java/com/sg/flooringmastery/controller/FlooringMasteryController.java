/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.controller;

import com.sg.flooringmastery.dao.FlooringMasteryDaoPersistenceException;
import com.sg.flooringmastery.dao.NoOrderException;
import com.sg.flooringmastery.dto.Order;
import com.sg.flooringmastery.service.InvalidInputException;
import com.sg.flooringmastery.service.ServiceLayer;
import com.sg.flooringmastery.ui.FlooringMasteryView;
import java.time.DateTimeException;
import java.time.LocalDate;

/**
 *
 * @author Elnic
 */
public class FlooringMasteryController {
    private FlooringMasteryView view;
    private ServiceLayer service;
    
    public void run() throws FlooringMasteryDaoPersistenceException, NoOrderException, InvalidInputException, NumberFormatException {
        boolean keepGoing = true;
        int menuSelection = 0;
        
        try {
        
        while(keepGoing) {
            menuSelection = getMenuSelection();
            
            switch(menuSelection) {
                case 1:
                    displayOrders();
                    break;
                case 2:
                    addOrder();
                    break;
                case 3:
                    editOrder();
                    break;
                case 4:
                    removeOrder();
                    break;
                case 5:
                    saveWork();
                    break;
                case 6:
                    setWorkMode();
                    break;
                case 7:
                    saveWork();
                    exit();
                    keepGoing = false;
                    break;
                default:
                    unknownCommand();
                    break;
            }
        }
    } catch (FlooringMasteryDaoPersistenceException e) {
        view.displayErrorMessage(e.getMessage());
    } 
    }
    
    private void setWorkMode() {
        int workModeChoice = 0;

        view.displayWorkModeBanner();

            workModeChoice = view.getWorkModeChoice();
            switch(workModeChoice) {
                case 1:
                    service.setWorkMode(true);
                    break;
                case 2:
                    service.setWorkMode(false);
                    break;
                default:
                    unknownCommand();
            }
    

    }
    
    private int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }
    
    private void displayOrders() throws FlooringMasteryDaoPersistenceException, NoOrderException {
        view.displayOrdersBanner();
        try{ 
        view.displayOrders(service.displayOrders(view.getOrderDate()));
        } catch (FlooringMasteryDaoPersistenceException | DateTimeException | NoOrderException e) {
            view.displayErrorMessage(e.getMessage());
        }
        service.clearOrders();
    }
    
    private void addOrder() throws FlooringMasteryDaoPersistenceException {
        view.displayAddOrderBanner();
        try {
        Order newOrder = service.collectOrderInfo(LocalDate.now(),
                view.enterCustomerName(),
                view.enterState(service.listTax()),
                view.enterProductType(service.listProducts()),
                view.enterArea());
        boolean confirm = view.confirmOrder(newOrder);
        if (confirm && service.getWorkMode()) {
            newOrder.setOrderNumber(service.orderNum());
            service.addOrder(LocalDate.now(), newOrder);
        } else {
            view.displayCancelOrder();
        }
        } catch (InvalidInputException e) {
            view.displayErrorMessage(e.getMessage());
        }
    }
    
    private void editOrder() throws FlooringMasteryDaoPersistenceException {
        view.displayEditOrderBanner();
        LocalDate orderDate = view.getOrderDate();
        int orderNum = view.getOrderNum();
        try {
        Order orderToEdit = service.editOrder(orderDate, orderNum);
        Order newOrder = view.orderToEdit(orderToEdit, service.listTax(), service.listProducts());
        Order editedOrder = service.collectOrderInfo(orderDate, newOrder.getCustomerName(), newOrder.getState(), newOrder.getProductType(), newOrder.getArea());
        service.compareOrders(newOrder, editedOrder, orderNum, orderDate);
        } catch (FlooringMasteryDaoPersistenceException | NoOrderException | NumberFormatException | InvalidInputException e) {
            view.displayErrorMessage(e.getMessage());
        }
        
        
    }
    
    private void removeOrder() throws FlooringMasteryDaoPersistenceException{
        view.displayRemoveOrderBanner();
        try{
        service.removeOrder(view.getOrderDate(), view.getOrderNum());
        view.displayRemoveOrderSuccess();
        } catch (NoOrderException | NumberFormatException e) {
            view.displayErrorMessage(e.getMessage());
        }
    }
    
    private void saveWork() throws FlooringMasteryDaoPersistenceException {
        view.displaySaveWorkBanner();
        service.saveWork();
    }
    
    private void exit() {
        view.displayExitBanner();
    }
    
    private void unknownCommand() {
        view.unknownCommand();
    }
    
    public FlooringMasteryController(ServiceLayer service, FlooringMasteryView view) {
        this.service = service;
        this.view = view;
    }
    
}
