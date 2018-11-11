/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.section3unittests;

/**
 *
 * @author Elnic
 */
public class SleepingIn {
    
    public boolean canSleepIn(boolean isWeekday, boolean isVacation) {
        
        boolean result = false;
        
        if (isWeekday == false || isVacation == true) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
    
}
