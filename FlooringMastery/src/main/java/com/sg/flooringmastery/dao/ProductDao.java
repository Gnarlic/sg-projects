/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.dao;

import com.sg.flooringmastery.dto.Products;
import com.sg.flooringmastery.service.InvalidInputException;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Elnic
 */
public interface ProductDao {
    public BigDecimal getProductCostPerSqFt(String product) throws FlooringMasteryDaoPersistenceException, InvalidInputException;
    
    public BigDecimal getLaborCostPerSqFt(String product) throws FlooringMasteryDaoPersistenceException, InvalidInputException;

    public List<Products> listProducts() throws FlooringMasteryDaoPersistenceException;
}
