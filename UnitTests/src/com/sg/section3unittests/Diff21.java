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
public class Diff21 {
    
    public int diff21(int n) {
        
        if (n > 21) {
            return 2* Math.abs(n-21);
        } else {
            return Math.abs(n-21);
        }
    }
    
}
