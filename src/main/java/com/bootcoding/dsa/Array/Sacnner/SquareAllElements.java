package com.bootcoding.dsa.Array.Sacnner;

import java.util.Scanner;

public class SquareAllElements {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array size ");
    int size = sc.nextInt();
    int numbers[] = new int[size];
    for (int i = 0; i < numbers.length; i++) {
        System.out.println("Enter array element " + (i + 1));
        int number = sc.nextInt();
        numbers[i] = number;
    }
    getSquareAllElements(numbers);
}
    public static void getSquareAllElements(int[] num){
    for (int i = 0; i< num.length; i++){
        num[i] = num[i] * num[i];
        System.out.println("Square is = " + num[i]);
    }
    }
}
