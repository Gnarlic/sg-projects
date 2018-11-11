/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.service;

import com.sg.flooringmastery.dao.FlooringMasteryDaoPersistenceException;
import com.sg.flooringmastery.dao.NoOrderException;
import com.sg.flooringmastery.dao.OrderDao;
import com.sg.flooringmastery.dao.ProductDao;
import com.sg.flooringmastery.dao.TaxDao;
import com.sg.flooringmastery.dto.Order;
import com.sg.flooringmastery.dto.Products;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Elnic
 */
public class ServiceLayerImpl implements ServiceLayer {
    
    private OrderDao oDao;
    private TaxDao tDao;
    private ProductDao pDao;
    private boolean workMode = true;
    
    public ServiceLayerImpl(OrderDao oDao, ProductDao pDao, TaxDao tDao) {
        this.oDao = oDao;
        this.pDao = pDao;
        this.tDao = tDao;
    }
    
    @Override
    public List<Order> displayOrders(LocalDate orderDate) throws FlooringMasteryDaoPersistenceException, NoOrderException {
        return oDao.orderListByDate(orderDate);
    }

    @Override
    public Order collectOrderInfo(LocalDate date, String name, String state, String productType, BigDecimal area) throws FlooringMasteryDaoPersistenceException, InvalidInputException {
        
        Order currentOrder = new Order(1);
        
        currentOrder.setCustomerName(name);
        currentOrder.setState(state.toUpperCase());
        try{
        currentOrder.setTaxRate(tDao.getTax(state));
        } catch (InvalidInputException e) {
            throw new InvalidInputException("Invalid State");
        }
        currentOrder.setProductType(productType.toUpperCase());
        currentOrder.setArea(area);
        try{
        currentOrder.setCostPerSqFt((pDao.getProductCostPerSqFt(productType)));
        currentOrder.setLaborPerSqFt(pDao.getLaborCostPerSqFt(productType));
        } catch (InvalidInputException e) {
            throw new InvalidInputException("Invalid Product");
        }
        currentOrder.setMaterialCost(pDao.getProductCostPerSqFt(productType).multiply(area));
        currentOrder.setLaborCost(pDao.getLaborCostPerSqFt(productType).multiply(area));
        currentOrder.setTax((tDao.getTax(state).divide(new BigDecimal("100")))
            .multiply(currentOrder.getLaborCost().add(currentOrder.getMaterialCost())).setScale(2, RoundingMode.HALF_EVEN));
        currentOrder.setOrderTotal(currentOrder.getMaterialCost().add(currentOrder.getLaborCost().add(currentOrder.getTax())).setScale(2, RoundingMode.HALF_EVEN));
        
        return currentOrder;
    }
    
    @Override
    public void addOrder(LocalDate date, Order order) throws FlooringMasteryDaoPersistenceException{
        oDao.addOrder(date, order);
    }

    @Override
    public List listTax() throws FlooringMasteryDaoPersistenceException {
        return tDao.listStatesAndTax();
    }    

    @Override
    public void setWorkMode(boolean mode) {
        this.workMode = mode;
    }
    
    @Override
    public boolean getWorkMode() {
        return workMode;
    }

    @Override
    public Order editOrder(LocalDate date, int orderNum) throws FlooringMasteryDaoPersistenceException, NoOrderException {
        return oDao.orderToEdit(date, orderNum);        
    }

    @Override
    public void saveWork() throws FlooringMasteryDaoPersistenceException {
        oDao.saveOrders(LocalDate.now());
        clearOrders();
    }
    
    @Override
    public void clearOrders() {
        oDao.clearOrders();
    }

    @Override
    public List<Products> listProducts() throws FlooringMasteryDaoPersistenceException{
        return pDao.listProducts();
    }

    @Override
    public int orderNum() throws FlooringMasteryDaoPersistenceException{
        return oDao.getOrderNumberAndIncrease();
    }

    @Override
    public void removeOrder(LocalDate date, int orderNum) throws FlooringMasteryDaoPersistenceException, NoOrderException {
        
        oDao.removeOrder(date, orderNum);
    }

    @Override
    public void compareOrders(Order newOrder, Order editedOrder, int orderNum, LocalDate orderDate) throws FlooringMasteryDaoPersistenceException, NoOrderException{
        if (!newOrder.equals(editedOrder)){
            removeOrder(orderDate, orderNum);
        }
    }
    
}
