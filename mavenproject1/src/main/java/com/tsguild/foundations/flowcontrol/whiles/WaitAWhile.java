package com.tsguild.foundations.flowcontrol.whiles;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Elnic
 */
public class WaitAWhile {
    
    public static void main(String[] args) {
        int timeNow =5;
        int bedTime = 10;//when changed from 10 to eleven the while loop runs an additional time.
        //when timeNow is set to 11, the while loop does not run because the condition is not met.
        
        while (timeNow<bedTime) {
            System.out.println("It's only " + timeNow + " o'clock!");
            System.out.println("I think I'll stay up just a liiiiiiitle longer....");
            timeNow++;//if this is taken out, the loop runs infinitely because the value for timeNow will never increase
            
        }
        
        System.out.println("Oh. It's " + timeNow + " o'clock");
        System.out.println("Guess I should go to bed...");
    }
}
