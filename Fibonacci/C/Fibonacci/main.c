/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: kiptubei
 *
 * Created on September 21, 2020, 6:34 PM
 */

#include <stdio.h>
#include <stdlib.h>

/*
 * 
 */

int fib(int n){
    
    switch(n){
        case 0:
            return 0;   
        case 1:
            return 1;
        default:
             return (fib(n-1)+fib(n-2));       
    }

}



int main(int argc, char** argv) {
    
    int n;
    int sum = 0;
    int result = 0;
    
    puts ("Enter a number greater than or equal to zero to calculate its fibonacci sequence ");
    scanf("%d",&n);
    
    if(n>0)
    {  result = fib(n); 
        printf("Fib of %d is %d \n",n,result);
    }else
    {
        puts("Invalid number");
        
    }
    
    for(int i = 1;i<=n;i++){
    
        if(fib(i)%2 == 0){
            sum = sum + fib(i);
        }
            
    }
    
    printf("Sum of even members of the fibonacci sequence of %d is equal to %d \n" ,n,sum);
    
    return (EXIT_SUCCESS);
}

