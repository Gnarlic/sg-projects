/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.S04UnitTests;

/**
 *
 * @author Elnic
 */
public class InsertWord {
    public String insertWord(String container, String word) {
        return container.substring(0,2)+word+container.substring(2,4);      
    }
}
