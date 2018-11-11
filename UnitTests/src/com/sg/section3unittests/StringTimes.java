/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.section3unittests;

/**
 *
 * @author Elnic
 */
public class StringTimes {

    
    
    public String stringTimes(String str, int n) {      
    
    int x = 1;
    String baseString = str;
    
    while( x < n) {
        x++;
        str = str + baseString;
    }
    return str;    
    }
    
}
