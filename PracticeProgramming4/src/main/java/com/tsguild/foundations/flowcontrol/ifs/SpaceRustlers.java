/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.foundations.flowcontrol.ifs;

/**
 *
 * @author Elnic
 */
public class SpaceRustlers {
    
    public static void main(String[] args) {
        
        int spaceships = 10;
        int aliens = 25;
        int cows = 100;
        
        if(aliens > spaceships){
            System.out.println("Vrroom, vroom! Let's get going!");
        } else {
            System.out.println("There aren't enough green guys to drive these ships!");
        }
        
        //'else if' is a conditional statement that runs code when the original 'if' statement doesn't run, if conditions match. 
        //'if' is a condition that uses a boolean to determine whether or not to run code
        //If you remove the 'else' from 'else if' then the code following isn't offered as a second condition to match.
        
        if(cows == spaceships){
            System.out.println("Wow, way to plan ahead! JUST enough room for all these walking hamburgers!");
        } else if (cows > spaceships){
            System.out.println("Dangit! I don't know how we're going to fit all these cows in here!");
        } else {
            System.out.println("Too many ships! Not enough cows.");
        }
        
        if (aliens > cows){
            System.out.println("Hurrah, we've got the grub! Hamburger party on Alpha Centauri!");
        } else if (cows >= aliens){
            System.out.println("Oh no! The herds got restless and took over! Looks like _we're_ hamburger now!");
        }
        
    }
    
}
