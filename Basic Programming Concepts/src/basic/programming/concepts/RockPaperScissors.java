/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.programming.concepts;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Elnic
 */
public class RockPaperScissors {
    
    public static void main(String[] args) {
        
        
        String roundsPicked = "";
        String r = "Rock";
        String p = "Paper";
        String s = "Scissors";
        String keepPlaying = "y";
        int timesToPlay = 0;
        int wins = 0;
        int losses = 0;
        int ties = 0;
        
        Scanner userInput = new Scanner(System.in);
        Random rps = new Random();
        
        while (keepPlaying.equals("y")) {            
            wins = 0;
            losses = 0;
            ties = 0;
            
            System.out.println("Let's Play Rock, Paper, Scissors!");
            System.out.println("How many rounds would you like to play?:");
        
            roundsPicked = userInput.nextLine();
            timesToPlay = Integer.parseInt(roundsPicked);
        
            
            while (timesToPlay < 1 || timesToPlay > 10) {
                System.out.println("Please pick a number between 1 and 10.");
                roundsPicked = userInput.nextLine();
                timesToPlay = Integer.parseInt(roundsPicked);
            }
            
            for (int i = 0; i < timesToPlay; i++) {
                
                System.out.println("Make your choice! 1 for Rock, 2 for Paper, and 3 for Scissors!");
                String playerChoice = userInput.nextLine();
                int choiceNum = Integer.parseInt(playerChoice);
                int computerChoice = rps.nextInt(3) + 1;
                String stringCompChoice = "";
                
                switch (computerChoice) {
                    case 1: {
                        stringCompChoice = r;
                        break;
                    }
                    case 2: {
                        stringCompChoice = p;
                        break;
                    }
                    case 3: {
                        stringCompChoice = s;
                        break;
                    }
                }
                
                System.out.println("I pick " + stringCompChoice + "!");
                switch (choiceNum) {
                    case 1: {
                        if (choiceNum == computerChoice) {
                            System.out.println("It's a tie!");
                            ties++;                             
                        }else if (computerChoice == 2) {
                                System.out.println("Loser!");
                                losses++;                                 
                        }else if (computerChoice == 3) {
                                    System.out.println("You Win!");
                                    wins++;                                    
                                }
                        } break;
                    case 2: {
                        if (choiceNum == computerChoice) {
                            System.out.println("It's a tie!");
                            ties++;                            
                        }else if (computerChoice == 3) {
                                System.out.println("Loser!");
                                losses++;
                        }else if (computerChoice == 1) {
                                    System.out.println("You Win!");
                                    wins++;                                                                    
                                }                        
                        } break;
                    case 3: {
                        if (choiceNum == computerChoice) {
                            System.out.println("It's a tie!");
                            ties++;                             
                        } else if (computerChoice == 1) {
                                System.out.println("Loser!");
                                losses++;                                 
                        } else if (computerChoice == 2) {
                                    System.out.println("You Win!");
                                    wins++;                                    
                                }
                        } break;
                        
                }
                    
               }
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
            System.out.println("Ties: " + ties);
                if (wins > losses) {
                System.out.println("You are the winner!");
                } else if (wins < losses) {
                    System.out.println("I win!");
                } else if (wins == losses) {
                    System.out.println("It's a Tie!");
                }
            System.out.println("Would you like to play again? (y/n)");
                keepPlaying = userInput.nextLine();
          }
        }                       
    }          
