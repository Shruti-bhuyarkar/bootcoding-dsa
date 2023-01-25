package com.bootcoding.dsa.Recursion;

public class ArrayElement {
    public static void main(String[] args) {
        int[] n = {10,20,30,40,50,60};
        printArrayElement(n , 0);
    }
    public static void printArrayElement(int[] n, int a){
        if(a == n.length){
            return;

        }
        System.out.println(n[a]);
        printArrayElement(n , ++a);
    }

}
