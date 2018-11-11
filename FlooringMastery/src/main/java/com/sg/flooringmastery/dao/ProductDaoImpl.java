/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.dao;

import com.sg.flooringmastery.dto.Products;
import com.sg.flooringmastery.service.InvalidInputException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


/**
 *
 * @author Elnic
 */
public class ProductDaoImpl implements ProductDao {

    private Map<String, Products> products = new HashMap<>();
    
    public static final String PRODUCT_FILE = "products.txt";
    public static final String DELIMITER = ",";
    
    public void loadProducts() throws FlooringMasteryDaoPersistenceException {
        Scanner sc;
        
        try {
            sc = new Scanner(new BufferedReader(new FileReader(PRODUCT_FILE)));
        } catch (FileNotFoundException e) {
            throw new FlooringMasteryDaoPersistenceException("Could not load product data into memory", e);
        }
        
        String currentLine;
        String[] currentTokens;
        
        while (sc.hasNextLine()) {
            currentLine = sc.nextLine();
            currentTokens = currentLine.split(DELIMITER);
            Products currentProduct = new Products(currentTokens[0].toUpperCase());
            currentProduct.setCostPerSqFt(new BigDecimal(currentTokens[1]));
            currentProduct.setLaborCostPerSqFt(new BigDecimal(currentTokens[2]));
            products.put(currentProduct.getProductType(), currentProduct);
        }
        sc.close();
    }
    
    @Override
    public BigDecimal getProductCostPerSqFt(String product) throws FlooringMasteryDaoPersistenceException, InvalidInputException{
        loadProducts();
        Products currentProduct = products.get(product.toUpperCase());
        if (currentProduct == null) {
            throw new InvalidInputException("Not an available product");
        }
        BigDecimal cpsf = currentProduct.getCostPerSqFt();
        return cpsf;//currentProduct.getProductCostPerSqFt();
    }

    @Override
    public BigDecimal getLaborCostPerSqFt(String product) throws FlooringMasteryDaoPersistenceException, InvalidInputException {
        loadProducts();
        Products currentProduct =products.get(product.toUpperCase());
        if (currentProduct == null) {
            throw new InvalidInputException("Not an available product");
        }
        return currentProduct.getLaborCostPerSqFt();
    }

    @Override
    public List<Products> listProducts() throws FlooringMasteryDaoPersistenceException{
        loadProducts();
        return new ArrayList<Products>(products.values());
    }
    
    
    
}
