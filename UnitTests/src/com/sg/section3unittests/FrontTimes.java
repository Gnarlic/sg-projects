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
public class FrontTimes {
    
    public String frontTimes(String str, int n) {
        String result = "";
        if (str.length() > 3) {
            for(int i = 1; i<=n; i++) {
                result += str.substring(0, 3);
            }
        } else if (str.length() > 0 && str.length() <= 3) {
            for(int i = 1; i <=n; i++) {
                result += str;
            }
        }
        return result;
    }
    
}
