package com.bootcoding.dsa.Array.Sacnner;


import java.util.Scanner;

public class scannerk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int value = sc.nextInt();
        boolean res = isEven(value);
        if(res){
            System.out.println(value + " even ");
        }else {
            System.out.println(value + " odd");
        }
    }
    private static boolean isEven(int value) {
        return value % 2 == 0;
    }
}
