/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author Elnic
 */
public class GuessMe {
    
    public static void main(String[] args) {
        
        int guess = 345;
        int numGuess = 0;
        String stringNumGuess = "";
        
        Scanner userGuess = new Scanner(System.in);
        
        System.out.println("Please pick a number.");
        stringNumGuess = userGuess.nextLine();
        
        numGuess = Integer.parseInt(stringNumGuess);
        
        if (numGuess == guess){
            System.out.println("Wow, nice guess! That was it!");
        }
        
        if (numGuess < guess){
            System.out.println("Ha, nice try - too low! I chose " + guess + ".");
        }
        
        if (numGuess > guess){
            System.out.println("Too bad, way too high. I chose " + guess + ".");
        }
        
        
    }
    
}
