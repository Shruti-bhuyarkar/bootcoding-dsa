package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;

public class HalvesAreAlike {
    public static void main(String[] args) {
        String s = "AbCdEfGh";
        boolean result = halvesAreAlike(s);
        System.out.println(result);
    }

    public static boolean halvesAreAlike(String s) {
        int length = s.length();
        int mid = length / 2;

        // Split the string into two halves
        String a = s.substring(0, mid);
        String b = s.substring(mid);

        // Count vowels in both halves
        int countA = countVowels(a);
        int countB = countVowels(b);

        // Check if the counts are equal
        return countA == countB;
    }

    private static int countVowels(String str) {
        // Set of vowels
        String vowels = "aeiouAEIOU";
        int count = 0;

        // Count vowels in the given string
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }

        return count;
    }
}

