/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.interestcalculator;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Elnic
 */
public class InterestCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double interestRate;
        double initialAmount;
        double yearsAccrued;
        double accruedBalance;
        int compoundingSelection;
        double contribution = 0;
        int daysInYear = 0;
        
        System.out.println("Please enter the annual interest rate: ");
        String rateInput = sc.nextLine();
        interestRate = Double.parseDouble(rateInput);
        System.out.println("Please enter the initial investment: ");
        String amountInput = sc.nextLine();
        initialAmount = Double.parseDouble(amountInput);
        System.out.println("Will you make monthly contributions? y/n");
        String monthlyCont = sc.nextLine();
        if (monthlyCont.equalsIgnoreCase("y")) {
            System.out.println("Please enter monthly contribution: ");
            String monthlyInput = sc.nextLine();
            contribution = Double.parseDouble(monthlyInput);
        }
        System.out.println("How many years will the investment accrue interest?");
        String yearInput = sc.nextLine();
        yearsAccrued = (Double.parseDouble(yearInput));
        accruedBalance = initialAmount;
        System.out.println("Please select how often the interest will be compounded:");
        System.out.println("1. Quarterly");
        System.out.println("2. Monthly");
        System.out.println("3. Daily");
        compoundingSelection = sc.nextInt();
        
        switch(compoundingSelection) {
            
            case 1:
                yearsAccrued = yearsAccrued * 4;
                for (int i = 1; i <= yearsAccrued; i++) {
                    initialAmount = initialAmount + (contribution*3);
                    accruedBalance = initialAmount * (1 + ((interestRate/4)/100));
                    initialAmount = accruedBalance;
                }
                break;
            case 2:
                yearsAccrued = yearsAccrued * 12;
                for (int i = 1; i <= yearsAccrued; i++) {
                    initialAmount = initialAmount + contribution;
                    accruedBalance = initialAmount * (1 + ((interestRate/12)/100));
                    initialAmount = accruedBalance;
                }
                break;
            case 3:
                yearsAccrued = yearsAccrued * 365;
                for (int i = 1; i <= yearsAccrued; i++) {                    
                    accruedBalance = initialAmount * (1 + ((interestRate/365)/100));
                    initialAmount = accruedBalance;                    
                    daysInYear = daysInYear + 1;
                    if (daysInYear==31 || daysInYear==59 || daysInYear==90 || daysInYear==120 || 
                        daysInYear==151 || daysInYear==181 || daysInYear==212 || daysInYear==243 || daysInYear==274 || 
                        daysInYear==304 || daysInYear==334) {
                        initialAmount = initialAmount + contribution;
                    } else if (daysInYear==365) {
                        initialAmount = initialAmount + contribution;
                        daysInYear = 0;
                        }
                    }
                break;
                                                            
                
        }
        
        DecimalFormat dff = new DecimalFormat(".##");
        System.out.println("$" + dff.format(accruedBalance));
        
        
    }

}
