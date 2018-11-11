/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.enums.howmanydaysuntilfriday;

import java.util.Scanner;

/**
 *
 * @author Elnic
 */
public class FridayCountdown {
    
    public enum DaysOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    
    public int daysLeft(DaysOfWeek day) {
        switch(day) {
            case MONDAY:
                return 4;
            case TUESDAY:
                return 3;
            case WEDNESDAY:
                return 2;
            case THURSDAY:
                return 1;
            case FRIDAY:
                return 0;
            case SATURDAY:
                return 6;
            case SUNDAY:
                return 5;
            default:
                throw new UnsupportedOperationException();
                    
        }
    }
    
    public String getDay() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Day: ");
        return input.nextLine();
    }
    
    
}
