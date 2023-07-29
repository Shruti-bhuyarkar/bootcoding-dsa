package com.bootcoding.dsa.LeetCode.Tree.BinaryTree;

import com.bootcoding.dsa.LeetCode.Tree.treeNode;

public class MinDepthBT {
    public static void main(String[] args) {
        treeNode root = new treeNode(3);
        root.left = new treeNode(9);
        root.right = new treeNode(20);
        root.right.left = new treeNode(15);
        root.right.right = new treeNode(7);


        System.out.println("Minimum depth of binary tree  " + minDepth(root));

    }
    public static int minDepth(treeNode root) {
        if (root == null) {
            return 0;
        } else if (root.left == null) {
            return 1 + minDepth(root.right);
        } else if (root.right == null) {
            return 1 + minDepth(root.left);
        } else {
            return 1 + Math.min(minDepth(root.left), minDepth(root.right));
        }
    }
}
