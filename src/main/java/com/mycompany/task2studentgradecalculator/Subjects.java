/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task2studentgradecalculator;

/**
 *
 * @author user
 */
import java.util.Scanner ;
import java.util.ArrayList ;
public class Subjects {
    private String Subject;
    private float Grade;
    private int credits;
    ArrayList<Subjects> list = new ArrayList();
    float Total = 0;
    float Tot_credits = 0;
       


    public String getSubject() {
        return Subject;
    }

    public float getGrade() {
        return Grade;
    }
    
    public int getCredits() {
        return credits;
    }
    public Subjects(){
        
    }
    
    public Subjects(String Subject,float Grade,int credits) {
        this.Subject = Subject;
        this.Grade = Grade;
        this.credits = credits;
    }
    
    public float getTotal(){
        return Total;
    }
    
    public float getTotalCredits(){
        return Tot_credits;
    }
    public void newSubject(){
        Scanner scanner = new Scanner(System.in);
        
     do {  
            System.out.println("Enter the Subject name : ");
            String s = scanner.nextLine();
            
            System.out.println("Enter your " + s + " grade : " );
            float grade = scanner.nextFloat();
            while(grade < 0 || grade > 100){
                System.out.println("Enter a valid number between 0 and 100 :");
                grade = scanner.nextFloat();
            }
            System.out.println("Enter number of credits for " + s + "(Between 3 and 6) : ");  
            int cred = scanner.nextInt();
            while(cred < 3 || cred > 6){
                System.out.println("Invalid nbr of credits , please enter a number between 3 and 6 :");
                cred = scanner.nextInt();
            }
            Subjects sub = new Subjects(s,grade,cred);
            list.add(sub);
            Total += (grade * cred);
            Tot_credits += cred;
            break;
     }while(true);
       
    
    
    }
    
}
