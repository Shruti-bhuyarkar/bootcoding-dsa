package com.bootcoding.dsa.LeetCode.difficultyLevel.Hard;

public class PaintWalls {
    public static void main(String[] args) {
        PaintWalls paintWalls = new PaintWalls();
        int[] cost = {2, 5, 3};
        int[] time = {1, 2, 1};
        int result = paintWalls.minPaintWalls(cost, time);
        System.out.println("Minimum cost to paint all walls: " + result);
    }
        public int minPaintWalls(int[] cost, int[] time) {
            int n = cost.length;
            Long[][] memo = new Long[n][n + 1];
            return (int) paintWallsHelper(cost, time, 0, 0, memo);
        }

        private long paintWallsHelper(int[] cost, int[] time, int index, int total, Long[][] memo) {
            if (total >= cost.length) return 0;
            if (index >= cost.length) return Integer.MAX_VALUE;
            if (memo[index][total] != null) return memo[index][total];

            long with = cost[index] + paintWallsHelper(cost, time, index + 1, total + time[index] + 1, memo);
            long without = paintWallsHelper(cost, time, index + 1, total, memo);
            return memo[index][total] = Math.min(with, without);
        }


    }


