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
public class FirstHalf {
    public String firstHalf(String str) {
        String half = "";
        if(str.length()%2 == 0) {
            half = str.substring(0, (str.length()/2));
        }
        return half;
    }
}
