package com.bootcoding.dsa.Recursion;

public class SequenceOrder {
    public static void main(String[] args) {
        int[] n ={10,20,30,40,50};
        printSequenceOrder(n , 0);
    }
    public static void printSequenceOrder(int[] n, int i) {
        if(i == n.length){
            return;
        }
        System.out.println(n[i]);
        printSequenceOrder(n,++i);
    }
}
