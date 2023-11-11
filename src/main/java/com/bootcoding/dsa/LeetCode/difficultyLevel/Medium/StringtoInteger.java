package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

public class StringtoInteger {
    public static void main(String[] args) {
        StringtoInteger stringtoInteger = new StringtoInteger();

        System.out.println("Test Case 1: " + StringtoInteger.myAtoi("42")); // Output: 42
        System.out.println("Test Case 2: " + StringtoInteger.myAtoi("   -42")); // Output: -42
        System.out.println("Test Case 3: " + StringtoInteger.myAtoi("4193 with words")); // Output: 4193
        System.out.println("Test Case 4: " + StringtoInteger.myAtoi("words and 987")); // Output: 0
        System.out.println("Test Case 5: " + StringtoInteger.myAtoi("-91283472332")); // Output: -2147483648
    }
        public static int myAtoi(String s) {

            if (s == null || s.length() == 0) {
                return 0;
            }

            int index = 0;
            int sign = 1;
            int result = 0;

            while (index < s.length() && s.charAt(index) == ' ') {
                index++;
            }

            if (index < s.length() && (s.charAt(index) == '+' || s.charAt(index) == '-')) {
                sign = (s.charAt(index) == '-') ? -1 : 1;
                index++;
            }

            while (index < s.length() && Character.isDigit(s.charAt(index))) {
                int digit = s.charAt(index) - '0';

                if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                    return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }

                result = result * 10 + digit;
                index++;
            }

            // Apply sign
            return result * sign;
        }


    }


