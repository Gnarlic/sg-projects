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
public class DoubleX {
    public boolean doubleX(String string) {
        boolean doubleX = false;
        if (string.length() >1) {
            for(int i = 0; i <= string.length(); i++) {
                if ((Character.toString(string.charAt(i)).equalsIgnoreCase("x") && !Character.toString(string.charAt(i+1)).equalsIgnoreCase("x"))) {
                doubleX = false;
                break;
            }
                if((Character.toString(string.charAt(i)).equalsIgnoreCase("x") && Character.toString(string.charAt(i+1)).equalsIgnoreCase("x"))) {
                    doubleX = true;
                    break;
                }
            }
        }
    return doubleX;
}
}
