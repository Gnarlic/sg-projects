/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.foundations.flowcontrol.whiles;

/**
 *
 * @author Elnic
 */
public class LovesMe {
    
    public static void main(String[] args) {
        
        int petals = 34;
        
        System.out.println("Well here goes nothing...");
        
        while (petals > 0) { //while loop, since the int petals is always started at 34 it's simple to make the loop this way.
            System.out.println("It loves me NOT!");
            petals--;
            System.out.println("It LOVES me!");
            petals--;
            
        }
        
        System.out.println("I knew it! It LOVES ME!");
                
                
    }
    
}
