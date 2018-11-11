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
public class MultipleEndings {
    public String multipleEndings(String str) {
        String output = (str.substring(str.length()-2, str.length()-1)+str.substring(str.length()-1, str.length()));
        return output+output+output;
    }
}
