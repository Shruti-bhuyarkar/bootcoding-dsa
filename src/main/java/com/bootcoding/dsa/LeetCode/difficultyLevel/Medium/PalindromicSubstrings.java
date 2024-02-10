package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

public class PalindromicSubstrings {
    public static void main(String[] args) {
        PalindromicSubstrings solution = new PalindromicSubstrings();
        String s = "abc";
        int result = solution.countSubstrings(s);

        System.out.println("Number of palindromic substrings: " + result);  // Output: 3
    }
    public int countSubstrings(String s) {
        int n = s.length();
        int count = 0;

        // Create a 2D array to represent whether substrings are palindromes or not
        boolean[][] isPalindrome = new boolean[n][n];

        // All substrings of length 1 are palindromes
        for (int i = 0; i < n; i++) {
            isPalindrome[i][i] = true;
            count++;
        }

        // Check for palindromes of length 2
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                isPalindrome[i][i + 1] = true;
                count++;
            }
        }

        // Check for palindromes of length 3 or more
        for (int len = 3; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                if (isPalindrome[i + 1][j - 1] && s.charAt(i) == s.charAt(j)) {
                    isPalindrome[i][j] = true;
                    count++;
                }
            }
        }

        return count;
    }


}

