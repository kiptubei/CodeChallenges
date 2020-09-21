/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kiptubei;

/**
 *
 * @author kiptubei
 */
public class FizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Solution();
    }
    
        public static void Solution()
    {
//        String response = "";
//        
//        for(int i = 1;i<=100;i++){
//            if(i%3 == 0){
//                response = "Fizz";
//            }
//            
//            if(i%5 == 0) {
//                response =  response.concat("Buzz");
//            }
//            
//            if(response.length()>1){
//                System.out.println(response);
//                response = "";
//            }
//            else{
//                System.out.println(i);
//            }
//        }
        
        int  j = 1;
        
        while(j<=100)
        {
            if(j%15 == 0){
                System.out.println("FizzBuzz");
            }
            else if(j%3 == 0){
            
                System.out.println("Fizz");
            }
            else if(j%5 == 0){
            
                System.out.println("Fizz");
            }
            else{
            
                System.out.println(j);
            }
          j++;
        }
        
    }
    
}
