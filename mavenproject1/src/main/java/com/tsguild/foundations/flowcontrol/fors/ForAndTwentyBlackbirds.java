/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.foundations.flowcontrol.fors;

/**
 *
 * @author Elnic
 */
public class ForAndTwentyBlackbirds {
    
    public static void main(String[] args) {
        
        int birdsInPie = 0;
        for (int i = 1; i <= 24; i++) {
            System.out.println("Blackbird #" + i + " goes into the pie!");
            birdsInPie++;
        }
        
        System.out.println("There are " + (birdsInPie)+ " birds in there!");
        System.out.println("Quite the pie full!");// I changed the starting value for i to 1 so it starts on number 1, and changed the stop condition to less than or equal to 24
        
    }
    
}
