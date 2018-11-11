/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.programming.concepts;

import java.util.Scanner;

/**
 *
 * @author Elnic
 */
public class HealthyHearts {
    
    public static void main(String[] args) {
        
        int age = 0;
        int maxHr = 0;
        double minHeartTarg = 0;
        double maxHeartTarg = 0;
        
        Scanner heartRate = new Scanner(System.in);
        
        String stringAge = "";
        
        System.out.println("What is your age?");
        
        stringAge = heartRate.nextLine();
        
        age = Integer.parseInt(stringAge);
        maxHr = 220 - age;
        minHeartTarg = maxHr * 0.5;
        maxHeartTarg = maxHr * 0.85;
        
        System.out.println("Your maximum heart rate should be " + maxHr + " beats per minute.");
        System.out.println("Your target HR Zone is " + minHeartTarg + " - " + maxHeartTarg + " beats per minute.");
        
        
        
        
    }
    
}