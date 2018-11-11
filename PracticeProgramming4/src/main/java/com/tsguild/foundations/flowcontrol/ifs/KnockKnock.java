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
public class KnockKnock {
    
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.print("Knock Knock! Guess who!! ");
        String nameGuess = inputReader.nextLine();
        
        if(nameGuess.equals("Marty Mcfly")) {
            System.out.println("Hey! That's right! I'm back!");
            System.out.println("....from the Future");
        } else {
            System.out.println("Dude, do I -look- like " + nameGuess + "?");
            // if you change the .equals to == , with a string, it doesn't recognize the correct answer
        }
    }
    
}
