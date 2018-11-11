/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.main.java.com.sg.statecapitals2;

import java.util.Scanner;

/**
 *
 * @author Elnic
 */
public class App {
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        StateCapitals2 stateCapital = new StateCapitals2();
        
        int lowLimit;
        
        stateCapital.printStateCapitals();
        
        System.out.println("");
        System.out.println("Please input the lower limit for state capital population: ");
        lowLimit = userInput.nextInt();
        
        System.out.println("");
        System.out.println("LISTING CAPITALS WITH POPULATIONS GREATER THAN " + lowLimit);
        System.out.println("");
        
        stateCapital.printLowLimitPopulation(lowLimit);
        
    }
    
}
