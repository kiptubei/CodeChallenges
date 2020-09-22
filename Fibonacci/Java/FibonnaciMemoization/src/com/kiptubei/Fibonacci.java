/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kiptubei;

import java.util.Scanner;

/**
 *
 * @author kiptubei
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fibber fibb = new Fibber();
       
    System.out.println("Enter an integer ");
        Scanner in = new Scanner(System.in); 
        
        int a = in.nextInt(); 
        System.out.println("You entered integer "+a); 
        
        double fib =fibb.fib(a);
        double sum =  0;
        
        
        System.out.println("The fibonacci of "+a+" is = "+ fib);
        

        
        for(int i=0;i<=a;i++){
                      
                   if(fibb.fib(i)%2 == 0 && fibb.fib(i)<=a)
            {
                
                System.out.println("The even fibonacci series");
                System.out.println(fibb.fib(i));
                sum =  sum + fibb.fib(i);
                
               
            }
            
        }
        
         System.out.println("The sum of the fibonacci series is  = " + sum);
    }
    
}
