package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;

public class MinCostClimbingStairs {

    public static void main(String[] args) {
        int[] cost = {10, 15, 20};
        int result = minCostClimbingStairs(cost);
        System.out.println("Minimum cost to climb the stairs: " + result);
    }
    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        if (n <= 1) {
            return 0;  // No cost if there are 0 or 1 steps.
        }

        int[] minCost = new int[n];
        minCost[0] = cost[0];
        minCost[1] = cost[1];

        for (int i = 2; i < n; i++) {
            minCost[i] = cost[i] + Math.min(minCost[i - 1], minCost[i - 2]);
        }

        return Math.min(minCost[n - 1], minCost[n - 2]);
    }

}

