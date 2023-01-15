package com.bootcoding.dsa.Array.Sacnner;

import java.util.Scanner;

public class DuplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size ");
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter array element " + (i + 1));
            int number = sc.nextInt();
            numbers[i] = number;
        }
        getDuplicateNumbers(numbers);
    }
    public static void getDuplicateNumbers(int[] nums){

                for (int i=0; i< nums.length; i++){
            for (int j = i+1; j< nums.length; j++){
                 if(nums[i] == nums[j]){
                    System.out.println("Duplicate Number is = "+ nums[j]);
                }
            }
        }

    }
}
