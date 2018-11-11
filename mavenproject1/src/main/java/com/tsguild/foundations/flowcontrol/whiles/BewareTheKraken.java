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
public class BewareTheKraken {
    
    public static void main(String[] args) {
        
        System.out.println("Already, get those flippers and wetsuit on - we're going diving!");
        System.out.println("Here we goooOOooOooo.....! *SPLASH*");
        
        int depthDivedInFt = 0;
        
        while(depthDivedInFt < 36200) { // if changed to true it skips the loop entirely
            System.out.println("So far, we've swam " + depthDivedInFt + " feet");
            System.out.println("Do you want to stop? (y/n) ");
            
            Scanner userInput = new Scanner(System.in);
            String continueDiving = userInput.nextLine();
            
            
            
           
            
            /*if (fishType == 0) {
                System.out.println("We saw a fugu fish!");
            } else if (fishType ==1 ) {
                System.out.println("We saw a Humpback anglerfish!");
            } else if (fishType == 2) {
                System.out.println("We saw a Bigeye Tuna!");
            }*/
            
            
            
            
            if (continueDiving.equals("y")) {
                System.out.println("Ok up we go!");
                break;
            }
            
            Random fishSighting = new Random();
            int fishType = fishSighting.nextInt(3);
            switch (fishType) {
                case 0: System.out.println("We saw a fugu fish!");
                        break;
                case 1: System.out.println("We saw a Humpback anglerfish!");
                        break;
                case 2: System.out.println("We saw a Bigeye Tuna!");
                        break;
            }
            
            if(depthDivedInFt >= 20000) {
                System.out.println("Uhhh, I think I see a Kraken, guys....");
                System.out.println("TIME TO GO!");
                break;
            }
            
            depthDivedInFt += 1000;
        }
        
        System.out.println("");
        System.out.println("We ended up swimming " + depthDivedInFt + " feet down.");
        System.out.println("I bet we can do better next time!");
    }
    
}
