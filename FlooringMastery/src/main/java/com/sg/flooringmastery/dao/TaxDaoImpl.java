/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.flooringmastery.dao;

import com.sg.flooringmastery.dto.Tax;
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
import org.omg.CORBA.DynAnyPackage.Invalid;

/**
 *
 * @author Elnic
 */
public class TaxDaoImpl implements TaxDao {
    
    private Map<String, Tax> taxRate = new HashMap<>();
    
    public static final String TAX_FILE = "tax.txt";
    public static final String DELIMITER = ",";
    
    public void loadTaxes() throws FlooringMasteryDaoPersistenceException {
        Scanner sc;
        
        try {
            sc = new Scanner(new BufferedReader(new FileReader(TAX_FILE)));
        } catch (FileNotFoundException e) {
            throw new FlooringMasteryDaoPersistenceException("Could not load tax data into memory.", e);
        }
        
        String currentLine;
        String[] currentTokens;
        
        while (sc.hasNextLine()) {
            currentLine = sc.nextLine();
            currentTokens = currentLine.split(DELIMITER);
            Tax currentTax = new Tax(currentTokens[0].toUpperCase());
            currentTax.setTax(new BigDecimal(currentTokens[1]));
            taxRate.put(currentTax.getState(), currentTax);
        }
        
        sc.close();
    }

    @Override
    public BigDecimal getTax(String state) throws FlooringMasteryDaoPersistenceException, InvalidInputException{
        loadTaxes();
        Tax currentTax = taxRate.get(state.toUpperCase());
        if (currentTax == null) {
            throw new InvalidInputException("Not a state available");
        }
        return currentTax.getTax();
    }
    
    @Override
    public List listStatesAndTax() throws FlooringMasteryDaoPersistenceException {
        loadTaxes();
        return new ArrayList<Tax>(taxRate.values());
    }
    
}
