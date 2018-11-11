/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.foundations.random;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Elnic
 */
public class GuessMeMore {
    
    public static void main(String[] args) {
        
        int guessMasterFlash = 0;
        String userGuess = "";
        
        Random numGuess = new Random();
        
        int randomNum = (numGuess.nextInt(201) - 100);
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("I've chose a number between -100 and 100. Betcha can't guess it!");
        System.out.print("Your guess: ");
        userGuess = userInput.nextLine();
        
        guessMasterFlash = Integer.parseInt(userGuess);
        
        if (guessMasterFlash == randomNum) {
            System.out.println("Wow, nice guess! That was it!");
        } else if ( guessMasterFlash < randomNum) {
            System.out.println("Ha, nice try - too low! Try again!");
            userGuess = userInput.nextLine();
            guessMasterFlash = Integer.parseInt(userGuess);
            if (guessMasterFlash == randomNum) {
                System.out.println("Wow, nice guess! Second time's the charm.");
            } else {
                System.out.println("Aw. Wrong again. The number was " + randomNum);
            }
        } else if (guessMasterFlash > randomNum) {
            System.out.println("Nice try - too high! Try again!");
            userGuess = userInput.nextLine();
            guessMasterFlash = Integer.parseInt(userGuess);
            if (guessMasterFlash == randomNum) {
                System.out.println("Wow, nice guess! Second time's the charm.");
            } else {
                System.out.println("Aw. Wrong again. The number was " + randomNum);
            }
        } 
    }
    
}
