package com.bootcoding.dsa.LeetCode.Tree;

public class DBT {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);

        root.left = n2;
        root.right = n3;
        n2.right = n5;
        n2.left = n4;
        System.out.println(diameterOfBinaryTree(root));
    }
        public static int diameterOfBinaryTree (TreeNode root){
            if (root == null) {
                return 0;
            }
            // Case 1: Diameter passes through the root node
            int rootDiameter = height(root.left) + height(root.right);
            // Case 2: Diameter does not pass through the root node
            int leftDiameter = diameterOfBinaryTree(root.left);
            int rightDiameter = diameterOfBinaryTree(root.right);
            return Math.max(rootDiameter, Math.max(leftDiameter, rightDiameter));
        }

        private static int height (TreeNode root){
            if (root == null) {
                return 0;
            }
            return 1 + Math.max(height(root.left), height(root.right));
        }
    }

