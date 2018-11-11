/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.enums.howmanydaysuntilfriday;

import com.sg.enums.howmanydaysuntilfriday.FridayCountdown.DaysOfWeek;

/**
 *
 * @author Elnic
 */
public class App {
    
    public static void main(String[] args) {
        FridayCountdown days = new FridayCountdown();
        String day = days.getDay();
        DaysOfWeek dayChoice = DaysOfWeek.valueOf(day.toUpperCase());
        int daysCount = days.daysLeft(dayChoice);
        System.out.println(daysCount + " days till Friday.");
    }
    
}
