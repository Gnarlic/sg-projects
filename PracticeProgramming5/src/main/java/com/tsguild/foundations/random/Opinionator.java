/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.foundations.random;

import java.util.Random;

/**
 *
 * @author Elnic
 */
public class Opinionator {
    
    public static void main(String[] args) {
        
        Random randomizer = new Random();
        System.out.println("I can't decide what animal I like the best.");
        System.out.println("I know! Random can decide FOR ME!");
        
        int x = randomizer.nextInt(6); // the bug was that r.nextInt(5) only provides a random number up to 4, because the 1st integer is 0.
        //so changing the 5 to a 6 provides a random number between 0 and 5, thus allowing the chance for any number stated in the if segments
        
        System.out.println("The number we chose was: " + x);
        
        if (x == 0) {
            System.out.println("Llamas are the best!");
        } else if (x == 1 ) {
            System.out.println("Dodos are the best!");
        } else if (x == 2 ) {
            System.out.println("Wooly Mammoths are DEFINITELY the best!");
        } else if (x == 3) {
            System.out.println("Sharks are the greatest, they have their own week!");
        } else if (x == 4) {
            System.out.println("Cockatoos are just so awesome!");
        } else if (x == 5) {
            System.out.println("Have you ever met a Mole-Rat? They're GREAT!");
        }
        
        System.out.println("Thanks Random, maybe YOU'RE the best!");
    }
    
}