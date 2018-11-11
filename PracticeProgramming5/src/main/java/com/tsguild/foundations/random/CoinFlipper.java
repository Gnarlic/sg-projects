/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.foundations.random;

import java.util.Random;
/**
 *
 * @author Elnic
 */
public class CoinFlipper {
    
    public static void main(String[] args) {
        
        System.out.println("Welcom to Coin Flipper Ultra!");
        System.out.println("Ready, set, Flip....!!");
        
        Random coinFlip = new Random();
        
        boolean flipMaster = false;
        
        flipMaster = coinFlip.nextBoolean();
        
        if (flipMaster == true) {
            System.out.println("You got Heads!");
        } else if (flipMaster == false) {
            System.out.println("You got Tails!");
        }
    }
    
}
