/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.foundations.flowcontrol.fors;

import java.util.Scanner;

/**
 *
 * @author Elnic
 */
public class ForTimesFor {
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        System.out.println("Which times table shall I recite? ");
        String userNum = userInput.nextLine();
        
        int numInput = Integer.parseInt(userNum);
        double correct = 0;
        
        for (int i = 1; i <= 15; i++) {
            System.out.println(i + " * " + numInput + " is: ");
            String answer = userInput.nextLine();
            int numAnswer = Integer.parseInt(answer);
            if (numAnswer == (i * numInput)) {
                System.out.println("Correct!");
                correct++;
            } else if (numAnswer != (i * numInput)){
                
                System.out.println("Sorry no, the answer is " + (i * numInput));
            }
        }
        int correctAnswer = (int) correct;
        System.out.print("You got " + correctAnswer + " correct.");
        if ((correct / 15) < 0.5 ) {
            System.out.println(" You need to study more. You scored less than 50%");
        } else if ((correct / 15) > 0.9) {
            System.out.println(" Good work! You got over 90% correct!");
        } else {
            System.out.println();
            
        }
        
        
        
    }
    
}
