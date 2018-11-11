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
public class StayPositive {
    
    public static void main(String[] args) {
        
        int countDown = 0;
        
        Scanner startNum = new Scanner(System.in);
        
        System.out.println("Are you ready to count down?!? Let's start with a number of your choosing!");
        
        String stringCountDown = startNum.nextLine();
        
        countDown = Integer.parseInt(stringCountDown);
        
        while (countDown >= 0) {
            System.out.println(countDown--); 
        }
        
        System.out.println("Whew, better stop there....!");
    
    }
    
}
