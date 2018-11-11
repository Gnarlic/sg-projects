/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.foundations.scanner;

import java.util.Scanner;



/**
 *
 * @author Elnic
 */
public class DontForgetToStoreIt {
    
    public static void main(String[] args) {
        
        int meaningOfLifeAndEverything = 0;
        double pi = 0;
        String cheese, color;
        
        
        Scanner inputReader = new Scanner(System.in);
        
        String stringMeaningOfLifeAndEverything = "";
        
        System.out.println("Give me pi to at least 5 decimals: ");
        String stringPi = inputReader.nextLine();
        
        pi = Double.parseDouble(stringPi);
        
        System.out.println("What is the meaning of life, the universe, & everything? ");
        
        stringMeaningOfLifeAndEverything = inputReader.nextLine();
        
        meaningOfLifeAndEverything = Integer.parseInt(stringMeaningOfLifeAndEverything);
        
        System.out.println("What is your favorite kind of cheese? ");
        cheese = inputReader.nextLine();
        
        System.out.println("Do you like the color red or blue more? ");
        color = inputReader.nextLine();
        
        System.out.println("Ooh, " + color + " " + cheese + " sounds delicious!");
        System.out.println("The circumference of life is " +(2 * pi * meaningOfLifeAndEverything));
        
        
    }
    
}
