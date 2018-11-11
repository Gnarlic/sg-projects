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
public class CountXX {
    
    public int countXX(String str) {
        int xNum = 0;
        
        if(str.length() >1) {
            for (int i = 0; i <= str.length()-2; i++) {
                if((Character.toString(str.charAt(i)) + Character.toString(str.charAt(i + 1))).equals("xx")) {
                xNum++;
                }
            }
            return xNum;
        } else {
            return xNum;
        }
        
    }
    
}
