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
public class CaughtSpeeding {
    public int caughtSpeeding(int speed, boolean isBirthday) {
        int ticket = 0;
        
        if (speed > 60 && speed <= 80) {
            if (isBirthday == true && speed >= 65 && speed <= 85) {
                ticket = 0;
            } else {
                ticket = 1;
            }
        } else if (speed > 80) {
            if (isBirthday == true && speed > 85) {
                ticket = 2;
            } else {
                ticket = 1;
            }
        }
        
        return ticket;
    }
}
