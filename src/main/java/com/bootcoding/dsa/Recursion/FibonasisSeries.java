package com.bootcoding.dsa.Recursion;

public class FibonasisSeries {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(printFibonasisSeries(n));
    }
    public static int  printFibonasisSeries(int n){
        if(n <= 1){
            return n;
        }
        return printFibonasisSeries(n-1) + printFibonasisSeries(n-2);

    }
    }

