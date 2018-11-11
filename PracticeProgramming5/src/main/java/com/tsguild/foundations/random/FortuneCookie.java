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
public class FortuneCookie {
    
    public static void main(String[] args) {
        
        Random quotes = new Random();
        
        int num = quotes.nextInt(10);
        
        if (num == 0) {
            System.out.println("Those aren't the droid you're looking for.");
        }else if (num == 1) {
            System.out.println("Never go in against a Sicilian when death is on the line!");
        }else if (num == 2) {
            System.out.println("Goonies never say die.");
        }else if (num == 3) {
            System.out.println("With great power there must also come - great responsibility.");
        }else if (num == 4) {
            System.out.println("Never argue with the data.");
        }else if (num == 5) {
            System.out.println("Try not. Do, or do not. There is not try.");
        }else if (num == 6) {
            System.out.println("You are a leaf on the wind, watch how you soar.");
        }else if (num == 7) {
            System.out.println("Do absolutely nothing, and it will be everything that you thought it could be.");
        }else if (num == 8) {
            System.out.println("Kneel before Zod.");
        }else if (num == 9) {
            System.out.println("Make it so.");
        }        
        
        
                
    }
    
}
