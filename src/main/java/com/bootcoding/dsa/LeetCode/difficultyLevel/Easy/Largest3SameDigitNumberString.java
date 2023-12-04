package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;

public class Largest3SameDigitNumberString {

        public static void main(String[] args) {
            Largest3SameDigitNumberString solution = new Largest3SameDigitNumberString();

            String num1 = "122345";
            String result1 = solution.largestGoodInteger(num1);
            System.out.println("Maximum good integer for " + num1 + ": " + result1);

            String num2 = "999876543";
            String result2 = solution.largestGoodInteger(num2);
            System.out.println("Maximum good integer for " + num2 + ": " + result2);

            String num3 = "87654321";
            String result3 = solution.largestGoodInteger(num3);
            System.out.println("Maximum good integer for " + num3 + ": " + result3);
        }

        public String largestGoodInteger(String num) {
            if (num.indexOf("999") != -1) {
                return "999";
            } else if (num.indexOf("888") != -1) {
                return "888";
            } else if (num.indexOf("777") != -1) {
                return "777";
            } else if (num.indexOf("666") != -1) {
                return "666";
            } else if (num.indexOf("555") != -1) {
                return "555";
            } else if (num.indexOf("444") != -1) {
                return "444";
            } else if (num.indexOf("333") != -1) {
                return "333";
            } else if (num.indexOf("222") != -1) {
                return "222";
            } else if (num.indexOf("111") != -1) {
                return "111";
            } else if (num.indexOf("000") != -1) {
                return "000";
            }

            return "";

        }
    }



