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
public class TheCount {
    
    public static void main(String[] args) {
        
        System.out.println("*** I LOVE TO COUNT! LET ME SHARE MY COUNTING WITH YOU! ***");
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Start at : ");
        String start = userInput.nextLine();
        System.out.println("Stop at: ");
        String stop = userInput.nextLine();
        System.out.println("Count by: ");
        String countBy = userInput.nextLine();
        
        int startNum = Integer.parseInt(start);
        int stopNum = Integer.parseInt(stop);
        int countByNum = Integer.parseInt(countBy);
        int runTimes = 0;
        
        for (int i = startNum; i <= stopNum; i+=countByNum) {
            System.out.print(i + " ");
            runTimes++;
            if (runTimes % 3 == 0) {
                System.out.println(" - Ah ah ah!");
            }
        }
        
        
        
    }
    
}
