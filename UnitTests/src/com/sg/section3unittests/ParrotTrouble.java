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
public class ParrotTrouble {
    
    public boolean parrotTrouble(boolean isTalking, int hour) {
        
        boolean trouble = false;
        
        if (isTalking == true && hour < 7 || hour > 20) {
            trouble = true;
        } else {
            trouble = false;
        }
        return trouble;        
    }
    
}
