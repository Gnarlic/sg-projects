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
public class MischeviousChildren {
    
    public boolean areWeInTrouble(boolean aSmile, boolean bSmile) {
        boolean trouble = false;
        
        if (aSmile == true && bSmile == true) {
            trouble = true;
        } else if (aSmile == false && bSmile == false) {
            trouble = true;
        } else {
            trouble = false;
        }
        return trouble;
    }
}
