/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibrary.ui;

import java.util.Scanner;

/**
 *
 * @author Elnic
 */
public class UserIOConsoleImpl implements UserIO {
    Scanner sc = new Scanner(System.in);
    
    @Override
    public void print(String message) {
        System.out.println(message);
    }
    
    @Override
    public double readDouble(String prompt) {
        System.out.println(prompt);
        String userInputString = sc.nextLine();
        double userInput = Double.parseDouble(userInputString);
        return userInput;
    }
    
    @Override
    public double readDouble(String prompt, double min, double max) {
        double userInput = 0.0;
        do {
            System.out.println(prompt);
            String userInputString = sc.nextLine();
            userInput = Double.parseDouble(userInputString);
        } while (userInput < min || userInput > max);
          
        return userInput;
        }
    
    @Override
    public float readFloat(String prompt) {
        System.out.println(prompt);
        String userInputString = sc.nextLine();
        float userInput = Float.parseFloat(userInputString);
        return userInput;
    }
    
    @Override
    public float readFloat(String prompt, float min, float max) {
        float userInput = 0;
        do { 
            System.out.println(prompt);
            String userInputString = sc.nextLine();
            userInput = Float.parseFloat(userInputString);
        } while (userInput < min || userInput > max);
    
        return userInput;
    }
    
    @Override
    public int readInt(String prompt) {
        System.out.println(prompt);
        String userInputString = sc.nextLine();
        int userInput = Integer.parseInt(userInputString);
        return userInput;
        
    }
    
    @Override
    public int readInt(String prompt, int min, int max) {
        int userInput = 0;
        do {
            System.out.println(prompt);
            String userInputString = sc.nextLine();
            userInput = Integer.parseInt(userInputString);
        } while (userInput < min || userInput > max);
        
        return userInput;
    }
    
    @Override
    public long readLong(String prompt) {
        System.out.println(prompt);
        String userInputString = sc.nextLine();
        long userInput = Long.parseLong(userInputString);
        return userInput;
    }
    
    @Override
    public long readLong(String prompt, long min, long max) {
        long userInput = 0;
        do {
            System.out.println(prompt);
            String userInputString = sc.nextLine();
            userInput = Long.parseLong(userInputString);
        } while (userInput < min || userInput > max);
        
        return userInput;
    }
    
    @Override
    public String readString(String prompt) {
        System.out.println(prompt);
        String userInput = sc.nextLine();
        return userInput;
    }
}

    

    


