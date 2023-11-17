package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

public class IntegertoRoman {
    public static void main(String[] args) {

        IntegertoRoman solution = new IntegertoRoman();
        int num = 3549;
        String result = solution.intToRoman(num);
        System.out.println("Result: " + result);
    }
        public String intToRoman(int num) {
            String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
            String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
            String[] hrns = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
            String[] ths = {"", "M", "MM", "MMM"};

            return ths[num / 1000] + hrns[(num % 1000) / 100] + tens[(num % 100) / 10] + ones[num % 10];
        }


    }


