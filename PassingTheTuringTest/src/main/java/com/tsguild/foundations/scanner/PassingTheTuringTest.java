/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.foundations.scanner;

import java.util.Scanner;

/**
 *
 * @author Elnic
 */
public class PassingTheTuringTest {
    
    public static void main(String[] args) {
        
        String name, color, food, numberFav;
        double sum = 0;
        
        Scanner userSubmit = new Scanner(System.in);
        
        System.out.println("Hello!");
        System.out.println("What is your name?");
        
        name = userSubmit.nextLine();
        
        System.out.println("Hi, " + name + ", What's your favorite color?");
        
        color = userSubmit.nextLine();
        
        System.out.println(color + " eh? My favorite color is aquamarine.");
        System.out.println();
        System.out.println("Aquamarine reminds me of my favorite food, Tropical Skittles.");
        System.out.println("What is your favorite food, " + name + "?");
        
        food = userSubmit.nextLine();
        
        System.out.println(food + "??? Not my first choice, but to each their own, I suppose.");
        System.out.println("On the subject of favorites, what's your favorite number?");
        
        numberFav = userSubmit.nextLine();
        
        double numberFavInt = Double.parseDouble(numberFav);
        
        System.out.println(numberFav + " is a neat number. Mine is 3.14159.");
        
        sum = numberFavInt * 3.14159;
        
        System.out.println("did you know " + numberFav + " * 3.14159 is " + sum + "? That's a nifty number too!");
        System.out.println();
        System.out.println("Well, thanks for the chat, " + name + "!");
        
        
    }
    
}
