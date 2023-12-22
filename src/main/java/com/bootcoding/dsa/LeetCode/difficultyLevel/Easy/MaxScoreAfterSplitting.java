package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;

public class MaxScoreAfterSplitting {

    public static void main(String[] args) {
        MaxScoreAfterSplitting solution = new MaxScoreAfterSplitting();
        String inputString = "011101";

        int result = solution.maxScore(inputString);
        System.out.println("Maximum Score: " + result);
    }
        public int maxScore(String s) {
            int maxScore = 0;
            int countZerosLeft = 0;
            int countOnesRight = (int) s.chars().filter(ch -> ch == '1').count();


            for (int i = 0; i < s.length() - 1; i++) {
                countZerosLeft += s.charAt(i) == '0' ? 1 : 0;
                countOnesRight -= s.charAt(i) == '1' ? 1 : 0;
                maxScore = Math.max(maxScore, countZerosLeft + countOnesRight);
            }

            return maxScore;
        }
    }


