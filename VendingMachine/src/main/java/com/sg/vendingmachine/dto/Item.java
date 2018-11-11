/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.vendingmachine.dto;

import java.math.BigDecimal;
import java.util.Objects;

/**
 *
 * @author Elnic
 */
public class Item {
    private String itemName;
    private String itemId;
    private BigDecimal itemPrice;
    private int itemCount = 0;
    

    public Item(String itemId) {
        this.itemId = itemId;
    }
        
    public String getItemName() {
        return itemName;
    }
    
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    
    public BigDecimal getItemPrice() {
        return itemPrice;
    }
    
    public void setItemPrice(BigDecimal itemPrice) {
        this.itemPrice = itemPrice;
    }
    
    public int getItemCount() {
        return itemCount;
    }
    
    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }
    
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }
    
    public String getItemId() {
        return itemId;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.itemName);
        hash = 89 * hash + Objects.hashCode(this.itemId);
        hash = 89 * hash + Objects.hashCode(this.itemPrice);
        hash = 89 * hash + this.itemCount;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (this.itemCount != other.itemCount) {
            return false;
        }
        if (!Objects.equals(this.itemName, other.itemName)) {
            return false;
        }
        if (!Objects.equals(this.itemId, other.itemId)) {
            return false;
        }
        if (!Objects.equals(this.itemPrice, other.itemPrice)) {
            return false;
        }
        return true;
    }
}
