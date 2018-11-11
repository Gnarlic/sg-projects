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
public class Products {
    private String productType = "";
    private BigDecimal costPerSqFt;
    private BigDecimal laborCostPerSqFt;
    
    public Products(String productType) {
        this.productType = productType;
    }
    
    public String getProductType() {
        return productType;
    }
    
    public BigDecimal getCostPerSqFt() {
        return costPerSqFt;
    }
    
    public BigDecimal getLaborCostPerSqFt() {
        return laborCostPerSqFt;
    }
    
    public void setProductType(String productType) {
        this.productType = productType;
    }
    
    public void setCostPerSqFt(BigDecimal costPerSqFt) {
        this.costPerSqFt = costPerSqFt;
    }
    
    public void setLaborCostPerSqFt(BigDecimal laborCostPerSqFt) {
        this.laborCostPerSqFt = laborCostPerSqFt;
    }
}
