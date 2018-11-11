/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.foundations.flowcontrol.fors;

/**
 *
 * @author Elnic
 */
public class ForByFor {
    
    public static void main(String[] args) {
        
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            
            if (i == 0 || i == 2) for (int j = 0; j < 3; j++) {
                if (j == 0 || j == 2) for (int k = 0; k <3; k++) {
                    System.out.print("*");                                    
                } else if ( j == 1) for (int l = 0; l <3; l++) {
                    System.out.print("$");
                }
                System.out.print("|");
            } else if (i == 1) for (int m=0; m<3; m++) {
                if (m == 0 || m == 2) for (int r=0; r<3; r++) {
                    System.out.print("@");
                } else if (m == 1) for (int h=0; h<3; h++) {
                    
                    System.out.print("#");
                }
                System.out.print("|");
            }
            System.out.println("");
        }
    }
    
}
