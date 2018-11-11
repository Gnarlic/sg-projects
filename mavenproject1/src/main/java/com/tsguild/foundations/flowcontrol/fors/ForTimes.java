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
public class ForTimes {
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        System.out.println("Let's do times tables! Enter a number: ");
        String userNum = userInput.nextLine();
        
        int numInput = Integer.parseInt(userNum);
        
        for (int i = 1; i <= 15; i++) {
            System.out.println(i + " * " + numInput + " is: " + (numInput * i));
        }
        
    }
    
}
