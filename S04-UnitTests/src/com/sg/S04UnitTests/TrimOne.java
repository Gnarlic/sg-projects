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
public class TrimOne {
    public String trimOne(String str) {
        String output = str.substring(1, str.length()-1);
        return output;
    }
}
