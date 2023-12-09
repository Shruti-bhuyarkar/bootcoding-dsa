package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;

import com.bootcoding.dsa.LeetCode.Tree.treeNode;

public class ConstructStringfromBinaryTree {
    public static void main(String[] args) {
        ConstructStringfromBinaryTree solution = new ConstructStringfromBinaryTree();

        treeNode root = new treeNode(1);
        root.left = new treeNode(2);
        root.right = new treeNode(3);
        root.left.left = new treeNode(4);
        String result = solution.tree2str(root);
        System.out.println("String representation of the binary tree: " + result);
    }
        public String tree2str(treeNode root) {
            if (root == null) {
                return "";
            }

            StringBuilder result = new StringBuilder();

            dfs(root, result);

            return result.toString();
        }

        private void dfs(treeNode node, StringBuilder result) {
            if (node == null) {
                return;
            }

            result.append(node.data);

            if (node.left != null || node.right != null) {
                result.append("(");
                dfs(node.left, result);
                result.append(")");

                if (node.right != null) {
                    result.append("(");
                    dfs(node.right, result);
                    result.append(")");
                }
            }
        }


    }


