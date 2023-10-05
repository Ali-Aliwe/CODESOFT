/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.task1numbergame;

/**
 *
 * @author user
 */
import java.util.Random;
import java.util.Scanner;

public class Task1NumberGame {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       Game Round = new Game();
       Round.numberGame();
       
       do {
           System.out.println("You have win till now " + Round.getRounds_won() + " rounds !! \n Enter 1 if you want to play again \n Enter 2 if you want to stop playing");
           int another_round = scanner.nextInt();
           while(another_round !=1 && another_round != 2){
               System.out.println("please enter a valid number: 1 or 2");
               another_round = scanner.nextInt();
           }
           if(another_round == 1){
               Round.numberGame();
           }
           else if(another_round == 2){
               System.exit(0);
           }
       }while(true);
    }
}
//Thanks for watching!