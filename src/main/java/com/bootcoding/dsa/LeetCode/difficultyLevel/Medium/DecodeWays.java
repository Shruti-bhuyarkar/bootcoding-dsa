package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

public class DecodeWays {
    public static void main(String[] args) {
        DecodeWays solution = new DecodeWays();
        String inputString = "11106";

        int result = solution.numDecodings(inputString);
        System.out.println("Number of ways to decode: " + result);
    }
    public int numDecodings(String s) {
        if (s == null || s.length() == 0 || s.charAt(0) == '0') {
            return 0; // Invalid input
        }

        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1; // Empty string has one decoding
        dp[1] = (s.charAt(0) != '0') ? 1 : 0;

        for (int i = 2; i <= n; i++) {
            int oneDigit = Integer.parseInt(s.substring(i - 1, i));
            int twoDigits = Integer.parseInt(s.substring(i - 2, i));

            if (oneDigit >= 1 && oneDigit <= 9) {
                dp[i] += dp[i - 1];
            }

            if (twoDigits >= 10 && twoDigits <= 26) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[n];
    }


}
