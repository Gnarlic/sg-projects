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
public class SameFirstLast {
    
    public boolean sameFirstLast(int[] numbers) {
                
        if (numbers.length >= 1) {
            if (numbers[0] == numbers[numbers.length-1]) {
                return true;
            } else {
                return false;
            } 
        } else {
            return false;
        }
    }
    
}
