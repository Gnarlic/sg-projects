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
public class BirthStones {
    
    public static void main(String[] args) {
        
        int gemStone = 0;
        
        Scanner birthMonth = new Scanner(System.in);
        String stringGemStone = "";
        
        System.out.println("Please enter the number of your birth month find out your birthstone.");
        stringGemStone = birthMonth.nextLine();
        
        gemStone = Integer.parseInt(stringGemStone);
        
        if (gemStone == 1) {
            System.out.println("January - Garnet");
        } else if ( gemStone == 2) {
            System.out.println("February - Amethyst");
        } else if (gemStone ==3){
            System.out.println(" March - Aquamarine");
        } else if (gemStone ==4) { 
            System.out.println("April - Diamond");
        } else if (gemStone == 5) {
            System.out.println("May - Emerald");
        } else if (gemStone == 6) {
            System.out.println("June - Pearl");
        } else if (gemStone == 7) {
            System.out.println("July - Ruby");
        } else if (gemStone == 8) {
            System.out.println("August - Peridot");
        } else if (gemStone == 9) {
            System.out.println("September - Sapphire");
        } else if (gemStone == 10) {
            System.out.println("October = Opal");
        } else if (gemStone == 11) {
            System.out.println("November - Topaz");
        } else if (gemStone == 12) {
            System.out.println("December - Turquoise");
        } else {
            System.out.println("Invalid Number");
        }
        
    }
    
}
