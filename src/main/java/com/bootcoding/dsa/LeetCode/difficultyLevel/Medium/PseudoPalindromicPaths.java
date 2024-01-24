package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

import com.bootcoding.dsa.LeetCode.Tree.treeNode;

public class PseudoPalindromicPaths {
    public static void main(String[] args) {
        PseudoPalindromicPaths pseudoPalindromicPaths = new PseudoPalindromicPaths();
        // Constructing a sample binary tree
        //      2
        //     / \
        //    3   1
        //   / \   \
        //  3   1   1
        treeNode root = new treeNode(2);
        root.left = new treeNode(3);
        root.right = new treeNode(1);
        root.left.left = new treeNode(3);
        root.left.right = new treeNode(1);
        root.right.right = new treeNode(1);

        int result = pseudoPalindromicPaths.pseudoPalindromicPaths(root);
        System.out.println("Number of pseudo-palindromic paths: " + result);
    }
    public int pseudoPalindromicPaths(treeNode root) {
        return dfs(root, 0);
    }

    private int dfs(treeNode node, int count) {
        if (node == null) {
            return 0;
        }

        // Update the count of the current digit
        count ^= (1 << node.data);

        // If the current node is a leaf node
        if (node.left == null && node.right == null) {
            // Check if the path is pseudo-palindromic
            if ((count & (count - 1)) == 0) {
                return 1;
            } else {
                return 0;
            }
        }

        // Recursive calls for left and right subtrees
        int result = 0;
        result += dfs(node.left, count);
        result += dfs(node.right, count);

        return result;
    }


}
