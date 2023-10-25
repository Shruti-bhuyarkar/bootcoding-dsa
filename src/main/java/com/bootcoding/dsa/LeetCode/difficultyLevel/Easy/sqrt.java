package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;

public class sqrt {
        public static void main(String[] args) {
            int x = 4; // The non-negative integer for which we want to find the square root
            int result = mySqrt(x);
            System.out.println("The square root of " + x + " is " + result);
        }
        public static int mySqrt(int x) {
            if (x == 0) {
                return 0;
            }
            int left = 1, right = x;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (mid <= x / mid && (mid + 1) > x / (mid + 1)) {
                    return mid;
                } else if (mid > x / mid) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            return -1; // Return -1 if x is negative
        }
    }


