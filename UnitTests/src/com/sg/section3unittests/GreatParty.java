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
public class GreatParty {
    
    public boolean greatParty(int cigars, boolean isWeekend) {
        boolean greatParty = false;
        
        if (isWeekend == false) {
            if (cigars > 39) {
                if (cigars < 61) {
                    greatParty = true;
                } else {
                    greatParty = false;
                }
            } else {
                greatParty = false;
            }
        } else if (isWeekend == true) {
            if (cigars > 39) {
                greatParty = true;
            } else {
                greatParty = false;
            }
        }
        return greatParty;
    }
    
}
