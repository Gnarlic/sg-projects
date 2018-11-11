/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BiggerBetterAdder;

import java.util.Scanner;

/**
 *
 * @author Elnic
 */
public class BiggerBetterAdder {
    
    public static void main(String[] args) {
        
        int entry1 = 0;
        int entry2 = 0;
        int entry3 = 0;
        int sum = 0;
        
        Scanner myScanner = new Scanner(System.in);
        
        String stringEntry1 = "";
        String stringEntry2 = "";
        String stringEntry3 = "";
        
        System.out.println("1st Number to be added:");
        
        stringEntry1 = myScanner.nextLine();
        
        System.out.println("2nd Number to be added:");
        
        stringEntry2 = myScanner.nextLine();
        
        System.out.println("3rd Number to be added");
        
        stringEntry3 = myScanner.nextLine();
        
        entry1 = Integer.parseInt(stringEntry1);
        entry2 = Integer.parseInt(stringEntry2);
        entry3 = Integer.parseInt(stringEntry3);
        
        System.out.println("1st Number: " + entry1);
        System.out.println("2nd Number: " + entry2);
        System.out.println("3rd number: " + entry3);
        
        
        sum = entry1 + entry2 + entry3;
        
        System.out.println("Sum is: " + sum);
        System.out.println("Sum is: " + sum);
    }
    
}
