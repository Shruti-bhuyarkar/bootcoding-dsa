package com.bootcoding.dsa.LeetCode.Tree;

public class MaxDepthBinaryTree {
    public static void main(String[] args) {
        treeNode root = new treeNode(3);
        root.left = new treeNode(9);
        root.right = new treeNode(20);
        root.right.left = new treeNode(15);
        root.right.right = new treeNode(7);
        int depth = maxDepth(root);
        System.out.println("Maximum depth of binary tree is: " + depth);
    }
    public static int maxDepth(treeNode root) {
        if (root == null) {
            return 0;
        } else {
            int leftDepth = maxDepth(root.left);
            int rightDepth = maxDepth(root.right);
            return Math.max(leftDepth, rightDepth) + 1;
        }
    }


}
