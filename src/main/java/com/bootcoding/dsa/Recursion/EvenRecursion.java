package com.bootcoding.dsa.Recursion;

public class EvenRecursion {
    public static void main(String[] args) {
        int n = 100;
        printEvenRecursion(n);
    }
    public static void printEvenRecursion(int n ){
        if(n == 0){
            return;
        }
        printEvenRecursion(n -1 );
        if(n % 2 == 0){
            System.out.println(n );
        }



    }
}
