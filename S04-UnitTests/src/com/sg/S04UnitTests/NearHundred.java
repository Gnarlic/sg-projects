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
public class NearHundred {
    public boolean nearHundred(int n) {
        int oneHundred = 100 -n;
        int twoHundred = 200 -n;
        
        return(Math.abs(oneHundred) <=10 || Math.abs(twoHundred) <= 10);
    }
}
