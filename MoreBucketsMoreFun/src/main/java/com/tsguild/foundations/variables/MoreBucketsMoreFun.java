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
public class MoreBucketsMoreFun {
    
    public static void main(String[] args) {
        
        int butterflies, beetles, bugs;
        String color, size, shape, thing;
        double number;
        
        butterflies = 2;
        beetles = 4;
        
        bugs = butterflies + beetles;
        System.out.println("There are only " + butterflies + " butterflies");
        System.out.println("but " + bugs + " bugs total.");
        
        System.out.println("Uh oh, my dog ate one.");
        butterflies--;
        System.out.println("Now there are only " + butterflies + " butterflies left.");
        System.out.println("But still " + bugs + " bugs left, wait a minute!!!");
        System.out.println("Maybe I just counted wrong the first time...");
        
        //The operator -- is used to decrease the number of butterflies by 1
        //The number of bugs does not change because the bugs variable is defined
        //in the lines
        //before the butterflies variable is decreased by the use of the -- operator.
    }
    
}