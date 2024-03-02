package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;

public class MaximumOddBinaryNum {

        public static void main(String[] args) {
            // Creating an instance of Solution
            MaximumOddBinaryNum maximumOddBinaryNum = new MaximumOddBinaryNum();

            // Example 1
            String binaryString1 = "101";
            String result1 = maximumOddBinaryNum.maximumOddBinaryNumber(binaryString1);
            System.out.println("Input: " + binaryString1);
            System.out.println("Maximum Odd Binary Number: " + result1);
            System.out.println();

            // Example 2
            String binaryString2 = "110";
            String result2 = maximumOddBinaryNum.maximumOddBinaryNumber(binaryString2);
            System.out.println("Input: " + binaryString2);
            System.out.println("Maximum Odd Binary Number: " + result2);
            System.out.println();

    }


        public String maximumOddBinaryNumber(String s) {
            int cnt1 = 0, cnt0 = 0;
            for (char a : s.toCharArray()) {
                if (a == '1') cnt1++;
                else if (a == '0') cnt0++;
            }
            StringBuilder ans = new StringBuilder();
            ans.append("1".repeat(cnt1 - 1));
            ans.append("0".repeat(cnt0));
            ans.append("1");
            return ans.toString();
        }
    }



