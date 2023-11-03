package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

import com.bootcoding.dsa.LeetCode.Tree.treeNode;

public class CountNodesEqualAverageSubtree {
    public static void main(String[] args) {
        CountNodesEqualAverageSubtree countNodesEqualAverageSubtree = new CountNodesEqualAverageSubtree();

        // Create a sample binary tree
        treeNode root = new treeNode(1);
        root.left = new treeNode(2);
        root.right = new treeNode(3);
        root.left.left = new treeNode(4);
        root.left.right = new treeNode(5);

        int result = countNodesEqualAverageSubtree.averageOfSubtree(root);
        System.out.println("Number of subtrees with average equal to root value: " + result);
    }
        public int averageOfSubtree(treeNode root) {
            int[] result = new int[1];
            traverse(root, result);
            return result[0];
        }
        private int[] traverse(treeNode node, int[] result) {
            if (node == null) return new int[]{0, 0};

            int[] left = traverse(node.left, result);
            int[] right = traverse(node.right, result);

            int currSum = node.data + left[0] + right[0];
            int currCount = 1 + left[1] + right[1];

            if (currSum / currCount == node.data) result[0]++;

            return new int[]{currSum, currCount};
        }
    }




