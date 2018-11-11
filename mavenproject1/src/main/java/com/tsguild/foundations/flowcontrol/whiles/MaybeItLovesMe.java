/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.foundations.flowcontrol.whiles;

import java.util.Random;

/**
 *
 * @author Elnic
 */
public class MaybeItLovesMe {
    
    public static void main(String[] args) {
        
        Random petalNumber = new Random();
        
        int petals = petalNumber.nextInt(76) +14;
        
        System.out.println("Well here goes nothing...");
        
        while (petals > 0) {
            if (petals > 0) {System.out.println("It LOVES me!");
            petals--;
                if (petals == 0 ) {
                    System.out.println("Oh, wow! It really LOVES me!");
                }
            }
            if (petals > 0 ) {
                System.out.println("It loves ME NOT!");
                petals--;
                if (petals == 0) {
                    System.out.println("Awwww, bummer.");
                }
            }
            
        }
        
        
        
    }
    
}
