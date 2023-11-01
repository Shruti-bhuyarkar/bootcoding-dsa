package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;
import com.bootcoding.dsa.LeetCode.Tree.treeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class FindModeBinarySearchTree {

    public static void main(String[] args) {
        FindModeBinarySearchTree findModeBinarySearchTree = new FindModeBinarySearchTree();

        // Create a sample binary search tree
        treeNode root = new treeNode(4);
        root.left = new treeNode(2);
        root.right = new treeNode(6);
        root.left.left = new treeNode(2);
        root.left.right = new treeNode(3);
        root.right.left = new treeNode(6);

        int[] modes = findModeBinarySearchTree.findMode(root);
        System.out.println("Modes in the BST: " + Arrays.toString(modes));
    }
        private int currentVal;
        private int currentCount = 0;
        private int maxCount = 0;
        private List<Integer> modes = new ArrayList<>();

        public int[] findMode(treeNode root) {
            inOrderTraversal(root);
            int[] result = new int[modes.size()];
            for (int i = 0; i < modes.size(); i++) {
                result[i] = modes.get(i);
            }
            return result;
        }
   // List<Integer> n = new LinkedList<>();
        private void inOrderTraversal(treeNode node) {
            if (node == null) return;

            inOrderTraversal(node.left);

            currentCount = (node.data == currentVal) ? currentCount + 1 : 1;
            if (currentCount == maxCount) {
                modes.add(node.data);
            } else if (currentCount > maxCount) {
                maxCount = currentCount;
                modes.clear();
                modes.add(node.data);
            }
            currentVal = node.data;

            inOrderTraversal(node.right);
//            if (node == null) {
//                return n;
//            }
//            inOrderTraversal(node.left);
//            n.add(node.data);
//            inOrderTraversal(node.right);
//            return n;
        }


    }

