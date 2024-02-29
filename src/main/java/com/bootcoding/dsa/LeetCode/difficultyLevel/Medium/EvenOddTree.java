package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;
import java.util.LinkedList;
import java.util.Queue;

public class EvenOddTree {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(10);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(9);

        // Creating an instance of Solution
        EvenOddTree evenOddTree = new EvenOddTree();

        // Calling the isEvenOddTree method
        boolean result = evenOddTree.isEvenOddTree(root);

        // Printing the result
        System.out.println("Is the binary tree an Even-Odd Tree? " + result);
    }
        public boolean isEvenOddTree(TreeNode root) {
            if (root == null) {
                return true; // An empty tree is considered Even-Odd
            }

            Queue<TreeNode> queue = new LinkedList<>();
            queue.offer(root);

            int level = 0;

            while (!queue.isEmpty()) {
                int size = queue.size();
                int prevValue = (level % 2 == 0) ? Integer.MIN_VALUE : Integer.MAX_VALUE;

                for (int i = 0; i < size; i++) {
                    TreeNode node = queue.poll();

                    // Check the value based on the level's parity
                    if (level % 2 == 0) {
                        if (node.val % 2 == 0 || node.val <= prevValue) {
                            return false;
                        }
                    } else {
                        if (node.val % 2 != 0 || node.val >= prevValue) {
                            return false;
                        }
                    }

                    // Update the previous value for the next iteration
                    prevValue = node.val;

                    // Add children to the queue if they exist
                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                    if (node.right != null) {
                        queue.offer(node.right);
                    }
                }

                // Move to the next level
                level++;
            }

            return true;
        }
    }


