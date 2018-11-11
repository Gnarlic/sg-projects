/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.enums.mathoperators;


import static com.sg.enums.mathoperators.MathOperator.DIVIDE;
import static com.sg.enums.mathoperators.MathOperator.PLUS;
import static com.sg.enums.mathoperators.MathOperator.MINUS;
import static com.sg.enums.mathoperators.MathOperator.MULTIPLY;
import java.util.Scanner;

/**
 *
 * @author Elnic
 */
public class App {
    public static void main(String[] args) {
        
        IntMath math = new IntMath();
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Please enter 1st number");
        String firstNum = userInput.nextLine();
        double firstNumber = Double.parseDouble(firstNum);
        System.out.println("Please enter 2nd number");
        String secondNum = userInput.nextLine();
        double secondNumber = Double.parseDouble(secondNum);
        System.out.println("PLUS: "+ (math.calculate(PLUS, firstNumber, secondNumber)));
        System.out.println("MINUS: "+ (math.calculate(MINUS, firstNumber, secondNumber)));
        System.out.println("MULTIPLY: "+ (math.calculate(MULTIPLY, firstNumber, secondNumber)));
        System.out.println("DIVIDE: "+ (math.calculate(DIVIDE, firstNumber, secondNumber)));
       
    }
}
