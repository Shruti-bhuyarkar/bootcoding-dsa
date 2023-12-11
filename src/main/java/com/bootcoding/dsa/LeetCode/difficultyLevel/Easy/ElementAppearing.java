package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;

public class ElementAppearing {
    public static void main(String[] args) {
        ElementAppearing solution = new ElementAppearing();

        int[] arr = {1, 2, 2, 6, 6, 6, 6, 7, 10};
        int result = solution.findSpecialInteger(arr);

        System.out.println("The integer occurring more than 25% of the time is: " + result);
    }

    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int threshold = n / 4;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + threshold]) {
                return arr[i];
            }
        }

        return arr[0];
    }
}
