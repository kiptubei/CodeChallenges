/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: kiptubei
 *
 * Created on September 21, 2020, 5:11 PM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */
int main(int argc, char** argv) {
    
    int i = 0;
    i= Solution();
    return (EXIT_SUCCESS);
}

 int Solution(){
    
    int i = 1;
   
    while (i<=100){
        if(i%15 == 0){
            puts ("FizzBuzz");
        }else if(i%3 == 0){
            puts("Fizz");
        }else if(i%5 == 0){
            puts("Buzz");
        }else{
            printf("%d \n",i);
        }
        
        i=i+1;
    }
    
    return 0;
}
