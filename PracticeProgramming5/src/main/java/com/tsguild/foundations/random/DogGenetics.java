/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.foundations.random;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Elnic
 */
public class DogGenetics {
    
    public static void main(String[] args) {
        
        int breedOne = 0;
        int breedTwo = 0;
        int breedThree = 0;
        int breedFour = 0;
        int breedFive = 0;
        
        Scanner dogBreed = new Scanner(System.in);
        
        System.out.println("What is your dog's name?");
        
        String dogName = dogBreed.nextLine();
        
        System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here.");
        System.out.println();
        System.out.println(dogName + " is: ");
        
        Random breedNames = new Random();
        
        breedOne = breedNames.nextInt(75) + 1;
        breedTwo = breedNames.nextInt((100 - breedOne) -3) +1;
        breedThree = breedNames.nextInt((100 - breedOne - breedTwo) -2) +1;
        breedFour = breedNames.nextInt((100 - breedOne - breedTwo - breedThree) -1) +1;
        breedFive = 100 - breedOne - breedTwo - breedThree - breedFour;
        
        
        
        if (breedOne >= 0) {
            System.out.println("Fluffy Cur: %" + breedOne);
        }
        if (breedTwo >= 0) {
            System.out.println("Speckled Pigeon Hound: %" + breedTwo);
        }
        if (breedThree >= 0 ) {
            System.out.println("Mottled Boxer: %" + breedThree);
        }
        if (breedFour >= 0) {
            System.out.println("Hairless Schnauser: %" + breedFour);
        }
        if (breedFive >= 0) {
            System.out.println("New Guinean Pickledog: %" + breedFive);
        }
       System.out.println(breedOne + breedTwo + breedThree + breedFour + breedFive);
    }
    
}
