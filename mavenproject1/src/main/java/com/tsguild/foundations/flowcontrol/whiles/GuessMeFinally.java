/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.foundations.flowcontrol.whiles;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Elnic
 */
public class GuessMeFinally {
    
    public static void main(String[] args) {
        
        Random randomizer = new Random();
        Scanner userInput = new Scanner(System.in);
        
        int randomNum = randomizer.nextInt(201) -100;
        
        System.out.println("I've chosen a number between -100 and 100. Betcha can't guess it!");
        String userGuess = userInput.nextLine();
        int guessNum = Integer.parseInt(userGuess);
        
        System.out.println("Your guess: " + guessNum);
        
        while (guessNum != randomNum) {
            if (guessNum == randomNum) {
            System.out.println("Wow, nice guess! that was it!");
        } else if (guessNum < randomNum) {
            System.out.println("Ha, nice try - too low! Try again!");
        } else if (guessNum > randomNum) {
            System.out.println("Too bad, way too high. Try again!");
        } userGuess = userInput.nextLine();
            guessNum = Integer.parseInt(userGuess);
            if (guessNum == randomNum) {
                System.out.println("Wow, nice guess! that was it!");
                break;
            }
            
        }
        
    }
    
}
