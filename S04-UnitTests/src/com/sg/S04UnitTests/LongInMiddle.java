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
public class LongInMiddle {
    public String longInMiddle(String a, String b) {
        String ends = "";
        String middle = "";
        if (a.length()<b.length()-1) {
            ends = a;
            middle = b;
        } else {
            ends = b;
            middle = a;
        }
        return ends+middle+ends;
    }
    
}
