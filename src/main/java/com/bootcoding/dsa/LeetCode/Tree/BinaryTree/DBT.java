package com.bootcoding.dsa.LeetCode.Tree.BinaryTree;

import com.bootcoding.dsa.LeetCode.Tree.treeNode;

public class DBT {
    public static void main(String[] args) {
        treeNode root = new treeNode(1);
        treeNode n2 = new treeNode(2);
        treeNode n3 = new treeNode(3);
        treeNode n4 = new treeNode(4);
        treeNode n5 = new treeNode(5);

        root.left = n2;
        root.right = n3;
        n2.right = n5;
        n2.left = n4;
        System.out.println(diameterOfBinaryTree(root));
    }
        public static int diameterOfBinaryTree (treeNode root){
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

        private static int height (treeNode root){
            if (root == null) {
                return 0;
            }
            return 1 + Math.max(height(root.left), height(root.right));
        }
    }

