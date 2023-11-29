package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;

public class NumberOf1Bits {
    public static void main(String[] args) {
        NumberOf1Bits solution = new NumberOf1Bits();

        int n = 25;
        int result = solution.hammingWeight(n);

        System.out.println("Number of set bits (Hamming weight) in " + n + ": " + result);
    }
         public int hammingWeight(int n) {
            int cnt = 0;
            while(n != 0){
                n = n & (n-1);
                cnt++;
            }

            return cnt;
        }
    }

