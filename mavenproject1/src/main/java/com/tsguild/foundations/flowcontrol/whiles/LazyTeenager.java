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
public class LazyTeenager {
    
    public static void main(String[] args) {
        
        Random chances = new Random();
        
        int cleanRoom = 0;      
        int cleanChance = 5;
        int runTimes = 1;
        do {
            System.out.println("Clean your room!! (x" + runTimes + ")");
            cleanRoom = chances.nextInt(100) + 1;
            cleanChance += 5;
            runTimes += 1;
            //System.out.println(cleanRoom);
            if (runTimes == 15) {
                break;
            }
            
        } while (cleanRoom > cleanChance); 
        
        if (cleanRoom <= cleanChance) {
            System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS.");
        } else { System.out.println("That's IT, I'm doint it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
        
        
        }
    }
}
    

