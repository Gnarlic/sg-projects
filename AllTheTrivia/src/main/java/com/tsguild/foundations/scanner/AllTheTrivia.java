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
public class AllTheTrivia {
    
    public static void main(String[] args) {
        
        String kCrystal, kRun, soroSuub, inCom; 
        
        Scanner triviaPursuit = new Scanner(System.in);
        
        System.out.println("What is a Kyber Crystal?");
        
        kCrystal = triviaPursuit.nextLine();
        
        System.out.println("What starship made the Kessel Run in less than 12 parsecs?");
        
        kRun = triviaPursuit.nextLine();
        
        System.out.println("What was the name of Han Solo's first ship, a SoroSuub manufactured light freighter?");
        
        soroSuub = triviaPursuit.nextLine();
        
        System.out.println("What popular Rebel starfighter did the Incom Corporation produce?");
        
        inCom = triviaPursuit.nextLine();
        
        System.out.println();
        
        System.out.println("I never knew that " + kRun + " were used in lightsaber construction!");
        System.out.println(soroSuub + " sounds like a pretty fast ship!");
        System.out.println("It seems like he could have picked a better name than " + inCom + " to be honest.");
        System.out.println("So the " + kCrystal + " was responsible for blowing up the first Death Star?");
        
        
        
        
    }
    
}
