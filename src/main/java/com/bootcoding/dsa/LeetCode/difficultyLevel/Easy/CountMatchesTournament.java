package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;

public class CountMatchesTournament {
    public static void main(String[] args) {
        CountMatchesTournament solution = new CountMatchesTournament();

        int n = 7;
        int result = solution.numberOfMatches(n);

        System.out.println("Number of matches played: " + result);
    }
        public int numberOfMatches(int n) {
            int matchesPlayed = 0;

            while (n > 1) {
                if (n % 2 == 0) {
                    matchesPlayed += n / 2;
                    n /= 2;
                } else {
                    matchesPlayed += (n - 1) / 2;
                    n = (n - 1) / 2 + 1;
                }
            }

            return matchesPlayed;
        }



}


