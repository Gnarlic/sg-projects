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
public class SpringForwardFallBack {
    
    public static void main(String[] args) {
        
        System.out.println("It's Spring...!");
        for (int i = 1; i <=10; i++) {
            System.out.print(i + ", ");
        }
        
        System.out.println("\nOh no, it's fall...");
        for (int i =10; i > 0; i--) {
            System.out.print(i + ", ");
        }//the range for loop 1 is 0-9, and 10-1 for loop 2.
    }
    
}
