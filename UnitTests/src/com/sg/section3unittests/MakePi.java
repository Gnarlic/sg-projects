/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.section3unittests;

import java.util.Arrays;

/**
 *
 * @author Elnic
 */
public class MakePi {
    
    public int[] makePi(int n) {
        int[] sixteenPi= {3,1,4,1,5,9,2,6,5,3,5,8,9,7,9,3};
        int[] partialPi = Arrays.copyOfRange(sixteenPi, 0, n);
        
        
        return partialPi;
    }
    
}
