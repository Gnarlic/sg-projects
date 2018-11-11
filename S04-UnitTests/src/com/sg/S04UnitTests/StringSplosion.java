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
public class StringSplosion {
    public String stringSplosion(String str) {
        String output = "";

        for(int i = 0; i<=str.length(); i++) {
            if (i!=0) {
                output += str.substring(0, i);
            }
        }
        
        return output;
    }
}
