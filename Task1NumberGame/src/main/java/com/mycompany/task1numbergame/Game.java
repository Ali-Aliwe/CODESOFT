/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task1numbergame;

/**
 *
 * @author user
 */
import java.util.Random;
import java.util.Scanner;
public class Game {
    private int attempts;
    private static final int MAX_ATTEMPTS = 10;
    private int rounds_won = 0;

    public int getAttempts() {
        return attempts;
    }

    public int getRounds_won() {
        return rounds_won;
    }
    
    public void numberGame() {
        attempts = 0;
        Random random = new Random();
        int nbr = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        
        do {
            attempts++;
            if(attempts > MAX_ATTEMPTS ){
                System.out.println("Game Over ! Max attempts is " + MAX_ATTEMPTS + " !");
                break;
            } else {
                 System.out.println("Guess the Number between 0 and 100 : ");
                 int aux = scanner.nextInt();
                 if(aux == nbr){
                     System.out.println("Congrats ! You Guessed it after " + attempts + " attempts");
                     rounds_won++;
                     break;
                 }
                 else if(aux < nbr) {
                     System.out.println("Its too low try again ");
                 }
                 else {
                     System.out.println("Its too high try again");
                 }
                 
            }       
        }while(true);
    }
}
