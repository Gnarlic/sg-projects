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
public class MakeTags {
    
    public String makeTags(String tag, String content) {
        String result = "<"+tag+">"+content+"</"+tag+">";
        return result;
    }
    
}
