/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.dto;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Elnic
 */
public class Change {
    
    private BigDecimal numQuarters, numDimes, numNickels, numPennies;
    
    /*public Change(BigDecimal funds) {
        funds = funds.multiply(new BigDecimal("100"));
        numQuarters = funds.divide(new BigDecimal("25"), 0, RoundingMode.FLOOR);
        funds = funds.subtract(numQuarters.multiply(new BigDecimal("25")));
        numDimes = funds.divide(new BigDecimal("10"), 0, RoundingMode.FLOOR);
        funds = funds.subtract(numDimes.multiply(new BigDecimal("10")));
        numNickels = funds.divide(new BigDecimal("5"), 0, RoundingMode.FLOOR);
        funds = funds.subtract(numNickels.multiply(new BigDecimal("5")));
        numPennies = funds.divide(new BigDecimal("1"), 0, RoundingMode.FLOOR);
        funds = funds.subtract(numPennies);
        
        this.numQuarters = numQuarters;
        this.numDimes = numDimes;
        this.numNickels = numNickels;
        this.numPennies = numPennies;
    }    */
    
    public BigDecimal getQuarters() {
        return numQuarters;
    }
    
    public BigDecimal getDimes() {
        return numDimes;
    }
    
    public BigDecimal getNickels() {
        return numNickels;
    }
    
    public BigDecimal getPennies() {
        return numPennies;
    }
    
    public void setPennies(BigDecimal pennies) {
        this.numPennies = pennies;
    }
    
    public void setNickels(BigDecimal nickels) {
        this.numNickels = nickels;
    }
    
    public void setDimes(BigDecimal dimes) {
        this.numDimes = dimes;
    }
    
    public void setQuarters(BigDecimal quarters) {
        this.numQuarters = quarters;
    }
    
}
