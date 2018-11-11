/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.dao;

import com.sg.flooringmastery.service.InvalidInputException;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Elnic
 */
public interface TaxDao {
    public BigDecimal getTax(String state) throws FlooringMasteryDaoPersistenceException, InvalidInputException;
    
    public List listStatesAndTax() throws FlooringMasteryDaoPersistenceException;
}
