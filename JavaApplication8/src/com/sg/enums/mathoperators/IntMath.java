/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.enums.mathoperators;

import static javafx.scene.input.KeyCode.PLUS;

/**
 *
 * @author Elnic
 */
public class IntMath {
    
    public double calculate(MathOperator operator, double operand1, double operand2) {
        
        switch(operator) {
            case PLUS:
                return operand1 + operand2;
            case MINUS:
                return operand1 - operand2;
            case MULTIPLY:
                return operand1 * operand2;
            case DIVIDE:
                return operand1 / operand2;
            default:
                throw new UnsupportedOperationException();
                
        }
    }   
    
}

