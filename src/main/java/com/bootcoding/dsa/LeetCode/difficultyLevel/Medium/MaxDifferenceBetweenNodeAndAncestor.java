package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class MaxDifferenceBetweenNodeAndAncestor {
    public static void main(String[] args) {
        MaxDifferenceBetweenNodeAndAncestor solution = new MaxDifferenceBetweenNodeAndAncestor();

        TreeNode root = new TreeNode(8);
        root.left = new TreeNode(3);
        root.right = new TreeNode(10);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(6);
        root.left.right.left = new TreeNode(4);
        root.left.right.right = new TreeNode(7);
        root.right.right = new TreeNode(14);
        root.right.right.left = new TreeNode(13);

        int result = solution.maxAncestorDiff(root);
        System.out.println("Maximum Difference Between Node and Ancestor: " + result);
    }
    private int maxDifference;

    public int maxAncestorDiff(TreeNode root) {
        maxDifference = 0;
        dfs(root, root.val, root.val);
        return maxDifference;
    }

    private void dfs(TreeNode node, int minValue, int maxValue) {
        if (node == null) {
            return;
        }

        // Update maxDifference using the current node's value
        maxDifference = Math.max(maxDifference, Math.max(Math.abs(node.val - minValue), Math.abs(node.val - maxValue)));

        // Update minValue and maxValue for the next level of recursion
        minValue = Math.min(minValue, node.val);
        maxValue = Math.max(maxValue, node.val);

        // Recursively visit the left and right subtrees
        dfs(node.left, minValue, maxValue);
        dfs(node.right, minValue, maxValue);
    }


}

