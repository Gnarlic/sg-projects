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
public class FirstLast6 {
    
    public boolean firstLast6(int[] numbers) {
        if(numbers.length >= 1) {
            if (numbers[0] == 6 || numbers[numbers.length-1] == 6) {
                return true;
            } else {
                return false;
            }
        } else if (numbers[0] == 6) {
            return true;
        }
        else return false;
    }
    
}
