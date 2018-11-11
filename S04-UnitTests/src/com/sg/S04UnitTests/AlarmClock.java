/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.S04UnitTests;

/**
 *
 * @author Elnic
 */
public class AlarmClock {
    public String alarmClock(int day, boolean vacation) {
        String alarmTime = "";
        
        if(vacation == true) {
            if(day < 1 || day > 5) {
                alarmTime = "OFF";
            } else {
                alarmTime = "10:00";
            }           
        } else if (vacation == false) {
            if(day > 0 && day <6) {
                alarmTime = "7:00";
            } else {
                alarmTime = "10:00";
            }
        }
        return alarmTime;
    }
}
