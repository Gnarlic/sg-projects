/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.ui;


import com.sg.flooringmastery.dto.Order;
import com.sg.flooringmastery.dto.Products;
import com.sg.flooringmastery.dto.Tax;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;



/**
 *
 * @author Elnic
 */
public class FlooringMasteryView {
    
    private UserIO io;
    public FlooringMasteryView(UserIO io) {
        this.io = io;
    } 
    final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMddyyyy");
        
    public int printMenuAndGetSelection() {
       
        io.print("********************");
        io.print("* ");
        io.print("*  <<Flooring Program>>");
        io.print("* ");
        io.print("* 1. Display Orders");
        io.print("* 2. Add an Order");
        io.print("* 3. Edit an Order");
        io.print("* 4. Remove an Order");
        io.print("* 5. Save Current Work");
        io.print("* 6. Set Mode");
        io.print("* 7. Exit Program");
        io.print("* ");
        io.print("********************");
        
        return io.readInt("Please enter menu choice: ", 1, 7);
        
    }
    
    public void displayOrders(List<Order> orderList) {
        for (Order currentOrder : orderList) {
            io.print("Order Number: " +currentOrder.getOrderNum()+ " Customer Name: "
                + currentOrder.getCustomerName() + " Order Total: $"
                + currentOrder.getOrderTotal());
        }
        io.readString("Please hit enter to continue.");
    }
    
    public String enterCustomerName() {
        return io.readString("Please enter customer name: ");
    }
    
    public String enterState(List<Tax> tax) {
        io.print("States available to Order:");
        displayStates(tax);
        return io.readString("Please enter state in which order is being placed: ");
        
    }
    
    public void displayStates(List<Tax> tax) {
        for (Tax currentTax : tax) {
            io.printList(currentTax.getState() + " ");
        }
        io.print("");
    }
    
    public void displayProducts(List<Products> products) {
        for (Products currentProduct : products) {
            io.printList(currentProduct.getProductType() + " ");
        }
        io.print("");
    }
    
    public String enterProductType(List<Products> products) {
        io.print("Products available to purchase: ");
        displayProducts(products);
        return io.readString("Please enter product type: ");
    }
    
    public BigDecimal enterArea() throws NumberFormatException {
        BigDecimal area = BigDecimal.ZERO;
        try{
        area = new BigDecimal(io.readString("Please enter total floor area for order: "));
        } catch (NumberFormatException e) {
            displayErrorMessage("Please enter a number");
        }
        return area;
    }

    public void displayOrdersBanner() {
        io.print("*-- Flooring Orders --*");
    }

    public void displayAddOrderBanner() {
        io.print("*-- Add Order --*");
    }

    public void displayEditOrderBanner() {
        io.print("*-- Edit Order --*");
    }

    public void displayRemoveOrderBanner() {
        io.print("*-- Remove Order --*");
    }    

    public void displaySaveWorkBanner() {
        io.print("*-- Work Saved --*");
    }

    public void displayExitBanner() {
        io.print("Exiting Program");
    }

    public void unknownCommand() {
        io.print("Unknown Command");
    }

    public LocalDate getOrderDate() {
        String dateString = io.readString("Please enter date of order (MMDDYYYY)");
        LocalDate date = LocalDate.now();
        try{
        date = LocalDate.parse(dateString, formatter);
        } catch (DateTimeParseException e) {
            throw new DateTimeParseException("Please Enter Date", "a", 1);
        }
        return date;
    }

    public int getWorkModeChoice() {
        return io.readInt("Choose 1 for Production mode, and 2 for Training mode.",1,2);
    }

    public void displayWorkModeBanner() {
        io.print("*-- Program operating mode Menu --*");
    }
    
    public int getOrderNum() {
        int orderNum = io.readInt("Please enter order number: ");
        return orderNum;
    }

    public Order orderToEdit(Order order, List<Tax> tax, List<Products> products) {
        
        Order currentOrder = order;
        String newName = null;
        String newProductType = null;
        String newState = null;
        BigDecimal newArea = null;
        newName = io.readString("Please enter new customer name or hit enter to skip (" + currentOrder.getCustomerName() +")");
        if (newName != null && !"".equals(newName)) {
            currentOrder.setCustomerName(newName);
        }
        displayProducts(products);
        newProductType = io.readString("Please enter new product type for order or hit enter to skip (" + currentOrder.getProductType() + ")");
        if (newProductType != null && !"".equals(newProductType)) {
            currentOrder.setProductType(newProductType);
        }
        displayStates(tax);
        newState = io.readString("Please enter new state for order or hit enter to skip (" + currentOrder.getState() + ")");
        if (newState != null && !"".equals(newState)) {
            currentOrder.setState(newState);
        }
        newArea = io.readBigDecimal("Please enter new floor area or hit enter to skip (" + currentOrder.getArea() + ")");
        if (newArea != null && !"".equals(newArea)) {
            currentOrder.setArea(newArea);
        }
        return currentOrder;
    }

    public void displayErrorMessage(String message) {
        io.print("=== Error ===");
        io.print(message);
    }

    public void displayRemoveOrderSuccess() {
        io.print("Order removed.");
    }

    public boolean confirmOrder(Order newOrder) {
        io.print("=== Confirm Order ===");
        io.print("Customer: " + newOrder.getCustomerName());
        io.print("State: " + newOrder.getState());
        io.print("Product: " + newOrder.getProductType());
        io.print("Area: " + newOrder.getArea());
        io.print("Tax: " + newOrder.getTax());
        io.print("Total: " + newOrder.getOrderTotal());
        String confirm = io.readString("Enter Y or N to confirm order or cancel.");
        if (confirm.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }
        
    }

    public void displayCancelOrder() {
        io.print("=== Order Cancelled ===");
    }
    
    
}
