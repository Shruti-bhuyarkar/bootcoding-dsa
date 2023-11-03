package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;
import com.bootcoding.dsa.LeetCode.Tree.treeNode;

import java.util.*;
public class ConstructBinaryTree {
    public static void main(String[] args) {
            int[] preorder = {3, 9, 20, 15, 7};
            int[] inorder = {9, 3, 15, 20, 7};

            ConstructBinaryTree builder = new ConstructBinaryTree();
            treeNode root = builder.buildTree(preorder, inorder);
            System.out.println("Inorder traversal of the constructed binary tree:");
            printInorder(root);
        }
        public treeNode buildTree(int[] preorder, int[] inorder) {
            Map<Integer, Integer> inMap = new HashMap<>();
            for (int i = 0; i < inorder.length; i++)
                inMap.put(inorder[i], i);
            return buildTree(preorder, 0, inorder, 0, inorder.length - 1, inMap);
        }
        private treeNode buildTree(int[] preorder, int preStart, int[] inorder, int inStart, int inEnd, Map<Integer, Integer> inMap) {
            if (preStart >= preorder.length || inStart > inEnd) return null;
            treeNode root = new treeNode(preorder[preStart]);
            int inRoot = inMap.get(root.data);
            int numsLeft = inRoot - inStart;
            root.left = buildTree(preorder, preStart + 1, inorder, inStart, inRoot - 1, inMap);
            root.right = buildTree(preorder, preStart + numsLeft + 1, inorder, inRoot + 1, inEnd, inMap);
            return root;
        }
        public static void printInorder(treeNode root) {
            if (root == null) return;
            printInorder(root.left);
            System.out.print(root.data + " ");
            printInorder(root.right);
        }
    }


