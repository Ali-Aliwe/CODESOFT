/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.task2studentgradecalculator;

/**
 *
 * @author user
 */
import java.util.Scanner;
import java.util.ArrayList;


public class Task2StudentGradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Subjects> list = new ArrayList();
        Subjects sub = new Subjects();
        sub.newSubject();
        
       do{
            System.out.println("Do you have more subjects?");
            String ans = scanner.nextLine();           
            while(!ans.equals("yes") && !ans.equals("no")){
                System.out.println("Enter valid answer (yes or no) : ");
                ans = scanner.nextLine();
            }
            if(ans.equals("yes") || ans.equals("yes") ){
                sub.newSubject();
                
            }
            else {
                break;
            }
        }  while(true);    
       
        float AVG = sub.getTotal()/sub.getTotalCredits();
        
        System.out.println("Your average percentage is : " + AVG  + "%");
        
        if( AVG >90 ) {
            System.out.println("Mark : A , Excellent");
        }
        else if( AVG >80 ) {
            System.out.println("Mark : B , Very Good");
        }else if( AVG >70 ) {
            System.out.println("Mark : C , Good");
        }else if( AVG >60 ) {
            System.out.println("Mark : D , Fair");
        }else if( AVG >50 ) {
            System.out.println("Mark : E , On Average");
        }else {
            System.out.println("Mark : F , Below the Average");
        }
}
}
//Thank you for watching