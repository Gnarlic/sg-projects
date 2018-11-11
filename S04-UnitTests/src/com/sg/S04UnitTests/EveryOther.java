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
public class EveryOther {
    public String everyOther(String str) {
        String output = str.substring(0,1);
        for (int i = 0; i < str.length(); i++) {
            if(i%2 == 0 && i !=0) {
            output = output + str.substring(i, i+1);
            }
        }
        return output;
    }
}
