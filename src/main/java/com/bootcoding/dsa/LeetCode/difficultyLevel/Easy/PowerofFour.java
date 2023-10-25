package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;

public class PowerofFour {
    public static void main(String[] args) {
        PowerofFour powerofFour = new PowerofFour();

        // Test cases
        int num1 = 16;  // 16 is a power of 4 (4^2)
        int num2 = 8;   // 8 is not a power of 4
        int num3 = 1;   // 1 is a power of 4 (4^0)

        System.out.println("Is " + num1 + " a power of 4? " + powerofFour.isPowerOfFour(num1));
        System.out.println("Is " + num2 + " a power of 4? " + powerofFour.isPowerOfFour(num2));
        System.out.println("Is " + num3 + " a power of 4? " + powerofFour.isPowerOfFour(num3));
    }
            public boolean isPowerOfFour(int n) {
                if (n > 0 && (n & (n - 1)) == 0) {
                    int zero_count = 0;
                    while (n > 1) {
                        zero_count++;
                        n >>= 1;
                    }
                    return zero_count % 2 == 0;
                }
                return false;
            }
        }



