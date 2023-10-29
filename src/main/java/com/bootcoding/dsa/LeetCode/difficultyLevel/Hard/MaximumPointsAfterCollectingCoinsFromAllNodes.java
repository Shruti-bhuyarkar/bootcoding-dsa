package com.bootcoding.dsa.LeetCode.difficultyLevel.Hard;
import java.util.List;
import java.util.ArrayList;
public class MaximumPointsAfterCollectingCoinsFromAllNodes {
        int N;
        List<Integer>[] G;
        Integer dp[][];
    public static void main(String[] args) {
        MaximumPointsAfterCollectingCoinsFromAllNodes maximumPointsAfterCollectingCoinsFromAllNodes = new MaximumPointsAfterCollectingCoinsFromAllNodes();

        int[][] edges = {{0, 1}, {1, 2}, {2, 3}};
        int[] coins = {1, 3, 4, 2};
        int k = 1;

        int maxPoints = maximumPointsAfterCollectingCoinsFromAllNodes.maximumPoints(edges, coins, k);
        System.out.println("Maximum points: " + maxPoints);
    }

        public int maximumPoints(int[][] edges, int[] coins, int k) {
            N = coins.length;
            G = new ArrayList[N];
            dp = new Integer[N][13];
            for (int i = 0; i < N; i++) {
                G[i] = new ArrayList<>();
            }
            for (int[] e : edges) {
                G[e[0]].add(e[1]);
                G[e[1]].add(e[0]);
            }

            return getMax(0, -1, 0, coins, k);
        }

        public int getMax(int i, int prev, int pow, int[] coins, int k) {
            if (pow >= 13) {
                return 0;
            }
            if (dp[i][pow] != null) {
                return dp[i][pow];
            }

            int c = coins[i] >> pow;

            int res1 = c - k;
            int res2 = (int)Math.floor(c / 2);
            for (int u : G[i]) {
                if (u == prev) {
                    continue;
                }
                res1 += getMax(u, i, pow, coins, k);
                res2 += getMax(u, i, pow + 1, coins, k);
            }

            dp[i][pow] = Math.max(res1, res2);

            return dp[i][pow];
        }


    }

