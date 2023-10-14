/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task3atminterface;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class ATM extends BankAccount {
    public ATM(){
        setAccountBalance(0);
    }
    public void withdraw(float amount){
        Scanner scanner = new Scanner(System.in);
        while(amount > getAccountBalance()){
            System.out.println("The amount you want to withdraw is greater than your balance , please enter a valid withdraw amount");
            amount = scanner.nextFloat();                   
        }
        setAccountBalance(getAccountBalance() - amount);
       
        System.out.println("Your transaction is succefully done , " + amount + "$ is withdrawn from your balance .");
        System.out.println("--------------------------------------------------------------------------------------");
    }
    
    public void deposit(float amount){
        
        setAccountBalance(getAccountBalance() + amount);
        System.out.println("Your transaction is succefully done , " + amount + "$ is added to your balance .");
         System.out.println("--------------------------------------------------------------------------------------");
   
    }
    
    public void check(){
        System.out.println("Your current bank account balance is : " + getAccountBalance() + "$");
        System.out.println("--------------------------------------------------------------------------------------");

    }
            
}
