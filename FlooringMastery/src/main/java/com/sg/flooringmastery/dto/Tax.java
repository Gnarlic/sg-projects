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
public class Tax {
    
    private String state = "";
    private BigDecimal tax;
    
    public Tax(String state) {
        this.state = state;
    }
    
    public BigDecimal getTax() {
        return tax;
    }
    
    public String getState() {
        return state;
    }
    
    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }
    
    public void setState(String state) {
        this.state = state;
    }
}
