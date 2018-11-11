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
public class RotateLeft {
    public int[] rotateLeft(int[] numbers) {
        int[] array = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++) {
            if (i == 0) {
                array[array.length-1] = numbers[i];
            } else {
                array[i-1] = numbers[i];
            }
        }
        
        return array;
    }
}
