package com.bootcoding.dsa.Array.Sacnner;

import java.util.Scanner;

public class Arraydemo {
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
        // privateArray(numbers);
        // printEven(numbers);
        //printOdd(numbers);
       //printMinElement(numbers);
        //printMaxElement(numbers);
    }

    private static void privateArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    private static int[] printEven(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
                return numbers;
            }
        }
        return numbers;
    }

    private static int[] printOdd(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                System.out.println(numbers[i]);
                return numbers;
            }

        }
        return numbers;
    }

//    private static int[] printMinElement(int[] numbers) {
//        int min = numbers[0];
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = i+1; j < numbers.length; j++) {
//                if (numbers[i] > min) {
//                    min = numbers[i];
//                    System.out.println(numbers[i]);
//                    return numbers;
//                }
//            }
//            return numbers;
//        }
//        return numbers;
//    }
//    private static int[] printMaxElement ( int[] numbers){
//            int max = numbers[0];
//            for (int i = 0; i < numbers.length; i++) {
//
//                if (max > numbers[i]) {
//                    max = numbers[i];
//                    System.out.println(numbers[i]);
//                    return numbers;
//                }
//            }
//            return numbers;
//        }
}




