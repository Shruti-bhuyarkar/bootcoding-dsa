package com.bootcoding.dsa.Recursion;
//WAP to calculate factorial of a given number using recursion
public class Factorial {
    public static void main(String[] args) {
        int n = 4 ;
        System.out.println(printFactorial(n));
    }
    public  static int printFactorial(int n){
        if(n == 1){
            return n;
        }
        return  n * printFactorial(n-1);
    }
}
