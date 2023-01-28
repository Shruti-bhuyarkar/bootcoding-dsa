package com.bootcoding.dsa.Array.Sacnner;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size ");
        int a = sc.nextInt();
        int temp = 0;
        for (int j = 1; j <= a; j++) {
            for (int i = 2; i <= j- 1; i++) {
                if (j % i == 0) {
                    temp = temp + 1;
                }
            }
            if (temp == 0) {
                System.out.println(j + " is prime");
            }else {
                temp = 0;
                //System.out.println(j + " not prime");
            }
        }
    }
}

