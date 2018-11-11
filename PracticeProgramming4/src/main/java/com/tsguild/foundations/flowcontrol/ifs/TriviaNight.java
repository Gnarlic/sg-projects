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
public class TriviaNight {
    
    public static void main(String[] args) {
        
        int numCor = 0;
        int firstQu = 0;
        int secondQu = 0;
        int thirdQu = 0;
        
        System.out.println("It's TRIVIA NIGHT! Are you ready?!");
        
        Scanner triviaNight = new Scanner(System.in);
        
        String stringFirstQu = "";
        String stringSecondQu = "";
        String stringThirdQu = "";
        
        System.out.println();
        System.out.println("FIRST QUESTION!");
        System.out.println("What is the device that makes time travel possible?");
        System.out.print("1) The Warp Core");
        System.out.println("        2) The Hyperdrive");
        System.out.print("3) The Flux Capacitor");
        System.out.println("        4) The Tardis Door");
        
        stringFirstQu = triviaNight.nextLine();
        firstQu = Integer.parseInt(stringFirstQu);
        
        System.out.println("Your answer = " + stringFirstQu);
        
        System.out.println();
        System.out.println("SECOND QUESTION!");
        System.out.println("What was Master Chief's Callsign?");
        System.out.print("1) Tango-918");
        System.out.println("        2) Quebec-242");
        System.out.print("3) Amber-311");
        System.out.println("        4) Sierra-117");
        
        stringSecondQu = triviaNight.nextLine();
        secondQu = Integer.parseInt(stringSecondQu);
        
        System.out.println("Your Answer = " + stringSecondQu);
        
        System.out.println("LAST QUESTION!");
        System.out.println("Which bounty hunter rescued Boba Fett from the Sarlacc Pit?");
        System.out.print("1) IG-88");
        System.out.println("        2) Dengar");
        System.out.print("3) 4-LOM and Zuckuss");
        System.out.println("        4) Bossk");
        
        stringThirdQu = triviaNight.nextLine();
        thirdQu = Integer.parseInt(stringThirdQu);
        
        System.out.println("Your Answer = " + stringThirdQu);
        
        System.out.println();
        
        
        
        
        
        if (firstQu == 3) {
            numCor++;
        } 
        
        if (secondQu == 4) {
            numCor++;
        } 
        
        if (thirdQu == 2) {
            numCor++;
        }
        
        if (numCor >= 1) {
            System.out.println("Congratulations! You got " + numCor + " answers correct!");
        } else if (numCor == 0) {
            System.out.println("You got 0 questions correct. These were easy!");
        }
    }
    
}
