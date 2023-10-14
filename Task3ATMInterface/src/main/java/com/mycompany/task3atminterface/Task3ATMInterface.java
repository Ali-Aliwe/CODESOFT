/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.task3atminterface;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class Task3ATMInterface {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        ATM user1 = new ATM();
     System.out.println("Hey Sir!");
        do{
            System.out.println("* Write 'deposit' if you want to deposit in your bank account");            
            System.out.println("* Write 'check' if you want to check your balance of your bank account");            
            System.out.println("* Write 'withdraw' if you want to withdraw from your bank account");            
            System.out.println("* Write 'exit' if you have finished all your operations");
            String s = scanner.nextLine();
            while(!s.equals("withdraw") && !s.equals("deposit") && !s.equals("check") && !s.equals("exit")){
                System.out.println("Your input is not valid, please enter a valid option(deposit,check,withdraw,exit) :");
                s = scanner.nextLine();
            }
            if(s.equals("withdraw")){
                System.out.println("Enter the amount you want to withdraw : ");
                float amount = scan.nextFloat();
                user1.withdraw(amount);
                
            }else if(s.equals("deposit")){
                System.out.println("Enter the amount you want to deposit : ");
                float amount = scan.nextFloat();
                user1.deposit(amount);
                
            }else if(s.equals("check")){
                user1.check();
               
            }else if (s.equals("exit")){
                System.exit(0);
            }
                    
         }while(true);
}
}