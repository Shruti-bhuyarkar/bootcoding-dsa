package com.bootcoding.dsa.Recursion;

public class Power {
    public static void main(String[] args) {
        int n = 2 , p = 4;
        int  res = printPower( n , p );
       System.out.println(res);
    }
    public static int printPower(int n , int p){
        if(p <= 0){
            return 1;
        }
        return n * printPower(n , p - 1) ;
    }
}
