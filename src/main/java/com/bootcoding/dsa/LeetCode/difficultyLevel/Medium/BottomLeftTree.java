package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;

public class BottomLeftTree {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
        root.right.left.left = new TreeNode(7);

        // Creating an instance of Solution
        BottomLeftTree bottomLeftTree = new BottomLeftTree();

        // Calling the findBottomLeftValue method
        int result = bottomLeftTree.findBottomLeftValue(root);

        // Printing the result
        System.out.println("The leftmost value in the bottom row is: " + result);
    }
        int leftmost = 0;
        int leftmostrow = -1;
        void visit(TreeNode root, int depth) {
            if (root == null) return;
            if (depth > leftmostrow) {
                leftmost = root.val;
                leftmostrow = depth;
            }
            visit(root.left, depth+1);
            visit(root.right, depth+1);
        }

        public int findBottomLeftValue(TreeNode root) {
            visit(root, 0)    ;
            return leftmost;
        }
    }

