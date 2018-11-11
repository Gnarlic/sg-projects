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
public class PlayOutside {
    
    public boolean playOutside(int temp, boolean isSummer) {
        boolean play = false;
        if (temp >= 60 && temp <= 90) {
            play = true;
        } else if (isSummer == true && temp >= 60 && temp <= 100) {
            play = true;
        } else {
            play = false;
        }
        return play;
    }
    
}
