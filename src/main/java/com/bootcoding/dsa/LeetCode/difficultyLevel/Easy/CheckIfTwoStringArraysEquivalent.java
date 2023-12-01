package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;

public class CheckIfTwoStringArraysEquivalent {

    public static void main(String[] args) {
        CheckIfTwoStringArraysEquivalent solution = new CheckIfTwoStringArraysEquivalent();

        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        boolean result = solution.arrayStringsAreEqual(word1, word2);

        System.out.println("Are the two arrays equivalent? " + result);
    }
        public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
            return concatenateStrings(word1).equals(concatenateStrings(word2));
        }

        private String concatenateStrings(String[] words) {
            StringBuilder result = new StringBuilder();
            for (String word : words) {
                result.append(word);
            }
            return result.toString();
        }

    }


