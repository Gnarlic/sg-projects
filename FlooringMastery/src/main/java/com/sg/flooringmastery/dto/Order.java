/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.dto;

import java.math.BigDecimal;

/**
 *
 * @author Elnic
 */
public class Order {
    
    private int orderNum;
    private String customerName = "";
    private String state = "";
    private BigDecimal taxRate;
    private String productType = "";
    private BigDecimal area;
    private BigDecimal costPerSqFt;
    private BigDecimal laborPerSqFt;
    private BigDecimal materialCost;
    private BigDecimal laborCost;
    private BigDecimal tax;
    private BigDecimal orderTotal;
    
    public Order(int orderNum) {
        this.orderNum = orderNum;
    }
    
    public void setOrderTotal(BigDecimal orderTotal) {
        this.orderTotal = orderTotal;
    }
    
    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }
    
    public void setLaborCost(BigDecimal laborCost) {
        this.laborCost = laborCost;
    }
    
    public void setMaterialCost(BigDecimal materialCost) {
        this.materialCost = materialCost;
    }
    
    public BigDecimal getOrderTotal() {
        return orderTotal;
    }
    
    public BigDecimal getTax() {
        return tax;
    }
    
    public BigDecimal getLaborCost() {
        return laborCost;
    }
    
    public BigDecimal getMaterialCost() {
        return materialCost;
    }
    
    public int getOrderNum() {
        return orderNum;
    }
    
    public String getCustomerName() {
        return customerName;
    }
    
    public String getState() {
        return state;
    }
    
    public BigDecimal getTaxRate() {
        return taxRate;
    }
    
    public String getProductType() {
        return productType;
    }
    
    public BigDecimal getArea() {
        return area;
    }
    
    public BigDecimal getCostPerSqFt() {
        return costPerSqFt;
    }
    
    public BigDecimal getLaborPerSqFt() {
        return laborPerSqFt;
    }
    
    public void setLaborPerSqFt(BigDecimal laborPerSqFt) {
        this.laborPerSqFt = laborPerSqFt;
    }
    
    public void setCostPerSqFt(BigDecimal costPerSqFt) {
        this.costPerSqFt = costPerSqFt;
    }
    
    public void setArea(BigDecimal area) {
        this.area = area;
    }
    
    public void setProductType(String productType) {
        this.productType = productType;
    }
    
    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    public void setOrderNumber(int orderNum) {
        this.orderNum = orderNum;
    }
    
}
