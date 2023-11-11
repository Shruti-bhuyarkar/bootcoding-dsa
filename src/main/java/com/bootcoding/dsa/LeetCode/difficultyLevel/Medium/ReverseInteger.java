package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

public class ReverseInteger {
    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();

        System.out.println("Test Case 1: " + reverseInteger.reverse(123)); // Output: 321
        System.out.println("Test Case 2: " + reverseInteger.reverse(-123)); // Output: -321
        System.out.println("Test Case 3: " + reverseInteger.reverse(120)); // Output: 21
        System.out.println("Test Case 4: " + reverseInteger.reverse(0)); // Output: 0
    }
    public int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            result = result * 10 + digit;
        }

        return result;
    }
}
