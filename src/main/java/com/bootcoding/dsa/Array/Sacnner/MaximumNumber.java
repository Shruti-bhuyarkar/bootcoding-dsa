package com.bootcoding.dsa.Array.Sacnner;

import java.util.Scanner;

public class MaximumNumber {
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
        printMaxElement(numbers);
    }
    private static void printMaxElement ( int[] numbers){
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (max > numbers[i]) {
                numbers[i] = max;
            }
        }
        System.out.println("maximum number is " + max);
    }
}
