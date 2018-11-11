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
public class MiniMadLibs {
    
    public static void main(String[] args) {
        
        String noun, adjOne, nounTwo, number, adjTwo, plurNounOne, plurNounTwo, plurNounThree, verbPresTense, verbPastTense;
        
        Scanner madLibs = new Scanner(System.in);
        
        System.out.println("Please enter a word for each line.");
        System.out.println();
        System.out.println("Noun:");
        
        noun = madLibs.nextLine();
        
        System.out.println("Adjective:");
        
        adjOne = madLibs.nextLine();
        
        System.out.println("Noun:");
        
        nounTwo = madLibs.nextLine();
        
        System.out.println("Number:");
        
        number = madLibs.nextLine();
        
        System.out.println("Adjective:");
        
        adjTwo = madLibs.nextLine();
        
        System.out.println("Plural Noun:");
        
        plurNounOne = madLibs.nextLine();
        
        System.out.println("Plural Noun:");
        
        plurNounTwo = madLibs.nextLine();
        
        System.out.println("Plural Noun:");
        
        plurNounThree = madLibs.nextLine();
        
        System.out.println("Verb, Present Tense:");
        
        verbPresTense = madLibs.nextLine();
        
        System.out.println("Same Verb, but Past Tense:");
        
        verbPastTense = madLibs.nextLine();
        
        System.out.println();
        System.out.println(noun + ": the " + adjOne + " frontier. These are the voyages of the starship ");
        System.out.println(nounTwo + ". Its " + number + " year mission: to explore strange " + adjTwo + " " + plurNounOne + ", to seek out " + adjTwo + " " + plurNounTwo);
        System.out.println("and " + adjTwo + " " + plurNounThree + ", to boldly " + verbPresTense + " where no one has " + verbPastTense + " before.");
        
        
        
        
        
    }
    
}
