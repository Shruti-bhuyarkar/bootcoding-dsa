package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;

public class LargestOddNumberString {
            public static void main(String[] args) {
            LargestOddNumberString solution = new LargestOddNumberString();

                        String num1 = "123456";
                        String result1 = solution.largestOddNumber(num1);
                        System.out.println("Largest odd number for " + num1 + ": " + result1);

                        String num2 = "24680";
                        String result2 = solution.largestOddNumber(num2);
                        System.out.println("Largest odd number for " + num2 + ": " + result2);

                        String num3 = "13579";
                        String result3 = solution.largestOddNumber(num3);
                        System.out.println("Largest odd number for " + num3 + ": " + result3);


        }
        public String largestOddNumber(String num) {
            if((int)num.charAt(num.length()-1)%2==1) return num;
            int i=num.length()-1;
            while(i>=0){
                int n=num.charAt(i);
                if(n%2==1) return num.substring(0,i+1);
                i--;
            }
            return "";
        }
    }



