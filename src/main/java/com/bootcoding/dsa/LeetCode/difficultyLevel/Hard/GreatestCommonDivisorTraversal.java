package com.bootcoding.dsa.LeetCode.difficultyLevel.Hard;

public class GreatestCommonDivisorTraversal {

    public static void main(String[] args) {
        GreatestCommonDivisorTraversal solution = new GreatestCommonDivisorTraversal();
        int[] nums = {2, 3, 5, 7, 11, 13, 17, 19};
        boolean canTraverse = solution.canTraverseAllPairs(nums);
        System.out.println("Can traverse all pairs: " + canTraverse);
    }
    public boolean canTraverseAllPairs(int[] nums) {
        int max = 0;
        for (int x : nums)
            max = Math.max(max, x);

        int n = nums.length;
        int[] parent = new int[max + 1];
        int[] count = new int[max + 1];

        if (n == 1) return true;

        for (int i = 0; i < n; i++)
            if (nums[i] == 1) return false;

        for (int i = 1; i <= max; i++)
            parent[i] = i;

        for (int x : nums)
            count[x]++;

        boolean[] visited = new boolean[max + 1];

        for (int i = 2; i * 2 <= max; i++) {
            if (visited[i]) continue;
            for (int j = i + i; j <= max; j += i) {
                visited[j] = true;
                if (count[j] != 0) {
                    union(parent, i, j);
                }
            }
        }
        int p = find(parent, nums[0]);
        for (int i = 1; i < n; i++)
            if (find(parent, nums[i]) != p) return false;

        return true;
    }

    private int find(int[] parent, int x) {
        return parent[x] == x ? x : (parent[x] = find(parent, parent[x]));
    }

    private void union(int[] parent, int x, int y) {
        x = find(parent, x);
        y = find(parent, y);
        if (x != y)
            parent[y] = x;
    }
}
