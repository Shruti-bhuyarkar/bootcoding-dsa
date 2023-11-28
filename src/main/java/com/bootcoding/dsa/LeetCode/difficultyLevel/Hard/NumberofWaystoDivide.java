package com.bootcoding.dsa.LeetCode.difficultyLevel.Hard;

public class NumberofWaystoDivide {
    public static void main(String[] args) {
        NumberofWaystoDivide solution = new NumberofWaystoDivide();
        String corridor = "SSPPSPS";
        int result = solution.numberOfWays(corridor);

        System.out.println("Number of ways to divide the corridor: " + result);
    }
        public int numberOfWays(String corridor) {
            int x = 1; // 0 seat
            int y = 0; // 1 seat
            int z = 0; // 2 seats
            int mod = (int)1e9 + 7;
            for (int i = 0; i < corridor.length(); ++i)
                if (corridor.charAt(i) == 'S') {
                    x = (x + z) % mod;
                    z = y;
                    y = x;
                    x = 0;
                } else {
                    x = (x + z) % mod;
                }
            return z;
        }
    }

