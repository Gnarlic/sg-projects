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
public class PosNeg {
    public boolean posNeg(int a, int b, boolean negative) {
        boolean output = false;
        if(negative) {
            if(a < 0 && b <0) {
                output = true;
            } else {
                output = false;
            }
        } else if (a<0 && b>0) {
            output = true;
        } else if (b<0 && a >=0) {
            output = true;
        }
        return output;
    }
}
