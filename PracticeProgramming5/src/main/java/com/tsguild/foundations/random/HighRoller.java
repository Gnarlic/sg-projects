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
public class HighRoller {
    
    public static void main(String[] args) {
        
        int diceSides = 0;
        int diceOutcome = 0;
        
        Scanner diceRoll = new Scanner(System.in);
        Random rollIt = new Random();
        
        String stringDiceSides = "";
        
        System.out.println("Welcome to High Roller! Let me roll your dice for you!");
        System.out.println("Please enter how many sides your dice has!");
        
        stringDiceSides = diceRoll.nextLine();
        
        diceSides = Integer.parseInt(stringDiceSides);
        
        diceOutcome = rollIt.nextInt(diceSides) + 1;
        
        if (diceOutcome == diceSides) {
            System.out.println("You rolled a critical! Nice Job!");
        }else if (diceOutcome == 1) {
            System.out.println("You rolled a critical failure! Ouch.");
        } else {
            System.out.println("You rolled a " + diceOutcome + "!");
    }
  }
    
}
