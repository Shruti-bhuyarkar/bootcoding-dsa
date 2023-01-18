package com.bootcoding.dsa.Recursion;

public class SumOfNumber {
    public static void main(String[] args) {
        int n = 99 ;
        System.out.println(printNaturalNumbers(n));}
    public static int printNaturalNumbers(int n ){
        if(n < 10) {
            return n;
        }
        return n % 10 + printNaturalNumbers(n / 10);
    }
}

