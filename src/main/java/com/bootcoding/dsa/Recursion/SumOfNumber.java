package com.bootcoding.dsa.Recursion;

public class SumOfNumber {
    public static void main(String[] args) {
        int n = 10 ;
        System.out.println(printNaturalNumbers(n));
    }
    public static int printNaturalNumbers(int n ){
        if(n<=1) {
            return n;
        }
        return n + printNaturalNumbers(n-1);
    }
}

