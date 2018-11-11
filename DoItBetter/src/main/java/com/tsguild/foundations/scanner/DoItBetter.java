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
public class DoItBetter {
    
    public static void main(String[] args) {
        
        int milesRun = 0;
        int hotDogs = 0;
        int spokenLang = 0;
        
        Scanner oneUp = new Scanner(System.in);
        
        String stringMilesRun = "";
        String stringHotDogs = "";
        String stringSpokenLang = "";
        
        System.out.println("How many miles can you run?");
        
        stringMilesRun = oneUp.nextLine();
        
        milesRun = Integer.parseInt(stringMilesRun);
        
        System.out.println("Oh, well I can run " + (milesRun * 2 + 1) + " miles!");
        
        System.out.println("How many hot dogs can you eat?");
        
        stringHotDogs = oneUp.nextLine();
        
        hotDogs = Integer.parseInt(stringHotDogs);
        
        System.out.println("Well I can eat " + (hotDogs * 2 + 1) + " hot dogs!");
        
        System.out.println("How many languages can you speak?");
        
        stringSpokenLang = oneUp.nextLine();
        
        spokenLang = Integer.parseInt(stringSpokenLang);
        
        System.out.println("Well I can speak " + (spokenLang * 2 + 1) + " languages!");
        
        
    }
    
}
