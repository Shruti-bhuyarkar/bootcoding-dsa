package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;
import java.util.Arrays;
public class MaximumNumberofCoins {

    public static void main(String[] args) {
        MaximumNumberofCoins solution = new MaximumNumberofCoins();

        int[] piles = {2, 4, 1, 2, 7, 8};
        int result = solution.maxCoins(piles);

        System.out.println("Maximum Number of Coins: " + result);
    }
        public int maxCoins(int[] piles) {
            Arrays.sort(piles);

            int n = piles.length / 3;
            int maxCoins = 0;

            for (int i = piles.length - 2; i >= n; i -= 2) {
                maxCoins += piles[i];
            }

            return maxCoins;
        }


    }


