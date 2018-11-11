/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.foundations.variables;

/**
 *
 * @author Elnic
 */
public class InABucket {
    public static void main(String[] args) {
        
        
        String walrus;
        double piesEaten;
        float weightOfTeacupPig;
        int grainsOfSand;
        
        walrus = "Sir Leroy Jenkins III";
        piesEaten = 42.1;
        weightOfTeacupPig = 30;
        grainsOfSand = 1736021;
        
        System.out.println("Meet my pet Walrus, " + walrus);
        System.out.print("He was a bit hungry today, and ate this many pies : ");
        System.out.println(piesEaten);
        System.out.println("Which is the same weight as " + piesEaten * 1.5 % weightOfTeacupPig + " Teacup Pigs.");
        System.out.println("Or as much as " + grainsOfSand + " grains of sand!");
        
    }
    
}
