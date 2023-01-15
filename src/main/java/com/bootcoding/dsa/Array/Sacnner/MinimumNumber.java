package com.bootcoding.dsa.Array.Sacnner;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter Number " + (i + 1));
            int number = sc.nextInt();
            numbers[i] = number;


        }
        printMinElement(numbers);
    }
        private static void printMinElement ( int[] numbers){
            int min = numbers[0];
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] < min) {
                    min = numbers[i];
                }
            }
                System.out.println("minimum number is " + min);
        }
    }


