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
public class YourLifeInMovies {
    
    public static void main(String[] args){
        
        int userAge = 0;
        String userName = "";
        String stringUserAge = "";
        
        Scanner ageQuery = new Scanner(System.in);
        
        System.out.println("Let's play a game. What is your name?");
        
        userName = ageQuery.nextLine();
        
        System.out.println("Ok, " + userName + ", when were you born?");
        
        stringUserAge = ageQuery.nextLine();
        
        userAge = Integer.parseInt(stringUserAge);
        
        System.out.println("Well " + userName + "...");
        
        if (userAge < 2005){
            System.out.println("Did you know that Pixar's 'UP' came out half a decade ago?");
        }
        
        if (userAge < 1995){
            System.out.println("And that the first Harry Potter came out over 15 years ago?");
        }
        
        if (userAge < 1985){
            System.out.println("Also, Space Jame came out not last decade, but the one before THAT.");
        }
        
        if (userAge < 1975){
            System.out.println("Jurassic Park was released closer to the lunar landing than to the present.");
        }
        
        if (userAge < 1965){
            System.out.println("And Mash has been around for almost half a century!");
        }
    }
    
}
