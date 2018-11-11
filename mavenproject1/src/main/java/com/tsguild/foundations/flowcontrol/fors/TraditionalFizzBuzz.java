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
public class TraditionalFizzBuzz {
    
    public static void main(String[] args) {
        
        System.out.println("How many units fizzing and buzzing do you need in your life?");
        Scanner userInput = new Scanner(System.in);
        String numEntry = userInput.nextLine();
        int fizzBuzz = Integer.parseInt(numEntry);
        int countFizzBuzz = 0;
        double count = 1;
        
        for (int i=0; i==i; i++) {
            
            if (count%3 == 0 && count%5 ==0) {
                System.out.println("fizz buzz");
                countFizzBuzz++;
            } else
            if (count%3 == 0) {
                System.out.println("fizz ");
                countFizzBuzz++;
                if(countFizzBuzz == fizzBuzz) {
                    System.out.println("TRADITION!!!!!");
                    break;
                }
            } else
            if (count%5 == 0) {
                System.out.println("buzz");
                countFizzBuzz++;
                if(countFizzBuzz == fizzBuzz) {
                    System.out.println("TRADITION!!!!!");
                    break;
                }
            } else
            if (count%3 != 0) {
                int countDis = (int) count;
                System.out.println(countDis);
            }
            
                count++;
        }
    }
    
}
