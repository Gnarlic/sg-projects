/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.foundations.flowcontrol.whiles;

import java.util.Scanner;

/**
 *
 * @author Elnic
 */
public class RollerCoaster {
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("We're going to go on a roller coaster...");
        System.out.println("Let me know when you want to get off...!");
        
        String keepRiding = "y";
        int loopsLooped = 0;
        //while (keepRiding.equals("y")) { //when changed to check for a no it skips the code because keepRiding is initially set to yes.
            while (keepRiding.equals("n")) {
            System.out.println("WHEEEEEEEEeEeEEEeEeeee.......!!!");
            System.out.println("Want to keep going? (y/n) :");
            keepRiding = userInput.nextLine();
            loopsLooped++; //no 'int' here because loopsLooped has already been declared above the while condition, and here the value is being increased.
        }
        
        
        System.out.println("Wow, that was FUN!");
        System.out.println("We looped that loop " + loopsLooped + " times!!");
        
    }
}
