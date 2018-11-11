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
public class CanHazTable {
    
    public int canHazTable(int yourStyle, int dateStyle) {
        int result = 0;
        
        if (yourStyle >= 8 || dateStyle >= 8) {
            result = 2;
        } else if (yourStyle <= 2 || dateStyle <= 2) {
            result = 0;
        } else {
            result = 1;
        }
        return result;
    }
    
}
