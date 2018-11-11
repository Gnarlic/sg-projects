/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.dao;

import com.sg.flooringmastery.dto.Order;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Elnic
 */
public class OrderDaoImpl implements OrderDao {

    private final Map<LocalDate, Map<Integer, Order>> orders = new HashMap<>();
    private Map<Integer, Order> savedOrders = new HashMap<>();
    private Map<Integer, Order> addedOrders = new HashMap<>();
    
    public static final String ORDER_NUMBER = "OrderNumber.txt";
    public static final String DELIMITER = ",";
    
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMddyyyy");    

    private void loadOrders(LocalDate orderDate) throws FlooringMasteryDaoPersistenceException {
        Scanner sc;
        String currentLine;
        String[] currentToken;
        Map<Integer, Order> newOrders = new HashMap<>();
        try {
            sc = new Scanner(new BufferedReader(new FileReader("Orders_" + orderDate.format(formatter) + ".txt")));
        } catch (FileNotFoundException e) {
            throw new FlooringMasteryDaoPersistenceException("This file does not exist", e);
        }
        try {
            while (sc.hasNextLine()) {
                currentLine = sc.nextLine();
                currentToken = currentLine.split(DELIMITER);
                Order order = new Order(Integer.parseInt(currentToken[0]));
                order.setOrderNumber(Integer.parseInt(currentToken[0]));
                order.setCustomerName(currentToken[1]);
                order.setState(currentToken[2]);
                order.setTaxRate(new BigDecimal(currentToken[3]));
                order.setProductType(currentToken[4]);
                order.setArea(new BigDecimal(currentToken[5]));
                order.setCostPerSqFt(new BigDecimal(currentToken[6]));
                order.setLaborPerSqFt(new BigDecimal(currentToken[7]));
                order.setMaterialCost(new BigDecimal(currentToken[8]));
                order.setLaborCost(new BigDecimal(currentToken[9]));
                order.setTax(new BigDecimal(currentToken[10]));
                order.setOrderTotal(new BigDecimal(currentToken[11]));

                newOrders.put(order.getOrderNum(), order);
            }
            this.savedOrders = newOrders;
            orders.put(orderDate, newOrders);
            sc.close();
        } catch (InputMismatchException | NumberFormatException e) {
            throw new FlooringMasteryDaoPersistenceException("There was an error reading the file", e);
        }

    }
    
    private void writeOrders(LocalDate date, boolean append) throws FlooringMasteryDaoPersistenceException{
        PrintWriter out;
        
        try {
            out = new PrintWriter(new FileWriter("Orders_" + date.format(formatter) + ".txt", append));
        } catch (IOException e) {
            throw new FlooringMasteryDaoPersistenceException("Could not persist orders to file.", e);
        }
        
        List<Order> orderList = this.orderList(date);
        for (Order currentOrder : orderList) {
            out.println(currentOrder.getOrderNum() + DELIMITER
                + currentOrder.getCustomerName() + DELIMITER
                + currentOrder.getState() + DELIMITER
                + currentOrder.getTaxRate() + DELIMITER
                + currentOrder.getProductType() + DELIMITER
                + currentOrder.getArea() + DELIMITER
                + currentOrder.getCostPerSqFt() + DELIMITER
                + currentOrder.getLaborPerSqFt() + DELIMITER
                + currentOrder.getMaterialCost() + DELIMITER
                + currentOrder.getLaborCost() + DELIMITER
                + currentOrder.getTax() + DELIMITER
                + currentOrder.getOrderTotal());
            out.flush();
        }
        out.close();
    }
    
    @Override
    public int getOrderNumberAndIncrease() throws FlooringMasteryDaoPersistenceException {
        Scanner sc;
        int currentLine = 0;
        try{
            sc = new Scanner(new BufferedReader(new FileReader(ORDER_NUMBER)));
        } catch (FileNotFoundException e) {
            throw new FlooringMasteryDaoPersistenceException("could not read order number from file.", e);
        }
        try {
            while(sc.hasNextInt()) {
                currentLine = sc.nextInt();
            } 
        } catch (NumberFormatException e) {
                    throw new NumberFormatException();
        }
        
        PrintWriter out;
        try {
            out = new PrintWriter(new FileWriter(ORDER_NUMBER));
        } catch (IOException e) {
            throw new FlooringMasteryDaoPersistenceException("Could not write order number to file.", e);
        }
        out.println(currentLine + 1);
        out.flush();
        out.close();
        
        return currentLine;
    }
        
    

    @Override
    public List orderList(LocalDate orderDate) throws FlooringMasteryDaoPersistenceException {
        return new ArrayList<>(addedOrders.values());
    }
    
    @Override
    public List orderListByDate(LocalDate orderDate) throws FlooringMasteryDaoPersistenceException, NoOrderException {
        loadOrders(orderDate);
        if (savedOrders.isEmpty()) {
            throw new NoOrderException("No orders in file.");
        }
        return new ArrayList<>(savedOrders.values());
    }
    
    @Override
    public void clearOrders() {
        savedOrders.clear();
        addedOrders.clear();
    }

    @Override
    public Order addOrder(LocalDate orderDate, Order order) throws FlooringMasteryDaoPersistenceException {
        this.addedOrders.put(order.getOrderNum(), order);
        orders.put(orderDate, addedOrders);
        return order;
    }
    
    @Override
    public void saveOrders(LocalDate orderDate) throws FlooringMasteryDaoPersistenceException {
        writeOrders(orderDate, true);
        savedOrders.clear();
    }

    @Override
    public Order orderToEdit(LocalDate date, int order) throws FlooringMasteryDaoPersistenceException, NoOrderException {
        loadOrders(date);
        Order editedOrder = savedOrders.get(order);
        if (editedOrder == null) {
            throw new NoOrderException("No such Order");
        }
        return editedOrder;
    }

    @Override
    public void removeOrder(LocalDate date, int orderNum) throws FlooringMasteryDaoPersistenceException, NoOrderException {
        String string = date.toString();
        LocalDate orderDate = LocalDate.parse(string);
        loadOrders(orderDate);
        Order order = savedOrders.get(orderNum);
        if (order == null) {
            throw new NoOrderException("No Such Order.");
        } else {
        savedOrders.remove(orderNum);
        addedOrders = savedOrders;
        writeOrders(orderDate, false);
        clearOrders();
        }
    }
    
    
}
