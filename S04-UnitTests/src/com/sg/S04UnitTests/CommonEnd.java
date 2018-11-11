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
public class CommonEnd {
    public boolean commonEnd(int[] a, int[] b) {
        
        int firstArray = a.length - 1;
        int secondArray = b.length - 1;
        boolean commonEnd = false;
        
        if (a[0] == b[0] || a[firstArray] == b[secondArray]) {
            commonEnd = true;
        }
        
        return commonEnd;
    }
}
