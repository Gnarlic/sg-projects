/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.dao;

import com.sg.vendingmachine.dto.Change;
import com.sg.vendingmachine.dto.Item;
import com.sg.vendingmachine.service.VendingMachineInsufficientFundsException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Elnic
 */
public class VendingMachineDaoFileImpl implements VendingMachineDao {

    private final Map<String, Item> items = new HashMap<>();

    public static final String INVENTORY_LIST = "vendingMachineInventory.txt";
    public static final String DELIMITER = "::";

    private void loadInventory() throws VendingMachinePersistenceException {
        Scanner sc;
        try {
            sc = new Scanner(new BufferedReader(new FileReader(INVENTORY_LIST)));
        } catch (FileNotFoundException e) {
            throw new VendingMachinePersistenceException("Could not load Vending Machine Inventory", e);
        }
        String currentLine;
        String[] currentTokens;

        while (sc.hasNextLine()) {

            currentLine = sc.nextLine();
            currentTokens = currentLine.split(DELIMITER);

            Item currentItem = new Item(currentTokens[0]);
            currentItem.setItemName(currentTokens[1]);
            currentItem.setItemPrice(new BigDecimal(currentTokens[2]));
            currentItem.setItemCount(Integer.parseInt(currentTokens[3]));

            items.put(currentItem.getItemId(), currentItem);
        }
        sc.close();
    }

    private void writeInventory() throws VendingMachinePersistenceException {
        PrintWriter out;

        try {
            out = new PrintWriter(new FileWriter(INVENTORY_LIST));
        } catch (IOException e) {
            throw new VendingMachinePersistenceException("Could not save inventory", e);
        }

        List<Item> itemsInInventory = this.displayAllItems();
        for (Item currentItem : itemsInInventory) {
            out.println(currentItem.getItemId() + DELIMITER
                    + currentItem.getItemName() + DELIMITER
                    + currentItem.getItemPrice() + DELIMITER
                    + currentItem.getItemCount());
            out.flush();
        }
        out.close();
    }

    @Override
    public List<Item> displayAllItems() throws VendingMachinePersistenceException {
        loadInventory();
        return new ArrayList<>(items.values());

    }

    @Override
    public Item getItem(String itemId) throws VendingMachinePersistenceException {
        loadInventory();
        return items.get(itemId);
    }

    @Override
    public int getItemCount(String itemId) throws VendingMachinePersistenceException {
        Item item = items.get(itemId);
        return item.getItemCount();
    }
    
    @Override
    public Item editItem(String itemId, Item item) throws VendingMachinePersistenceException {
        loadInventory();
        Item itemToEdit = items.get(itemId);
        if (itemToEdit != null) {
            items.remove(itemToEdit.getItemId());
            items.put(item.getItemId(), item);
        }
        writeInventory();
        return item;
    }

}
