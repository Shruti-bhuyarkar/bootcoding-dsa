package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;

public class FindJudgeSolution {
    public static void main(String[] args) {
        FindJudgeSolution solution = new FindJudgeSolution();

        int N = 4;
        int[][] trust = {{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}};

        int result = solution.findJudge(N, trust);

        System.out.println("Judge: " + result);
    }
    public int findJudge(int N, int[][] trust) {
        int[] in = new int[N + 1];
        int[] out = new int[N + 1];
        for (int[] a : trust) {
            out[a[0]]++;
            in[a[1]]++;
        }
        for (int i = 1; i <= N; ++i) {
            if (in[i] == N - 1 && out[i] == 0)
                return i;
        }
        return -1;
    }


}
