package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;

import com.bootcoding.dsa.LeetCode.Tree.treeNode;

public class SearchBST {
    public static void main(String[] args) {
        treeNode root = new treeNode(5);
        treeNode n2 = new treeNode(10);
        treeNode n3 = new treeNode(16);
        treeNode n4 = new treeNode(70);
        treeNode n5 = new treeNode(100);

        root.left = null;
        root.right = n2;
        n2.left = n3;
        n2.right = n4;
        n4.right = n5;

        treeNode resultNode = searchBST(n2, 10);
        if (resultNode != null) {
            System.out.println("Value found in the BST.");
        } else {
            System.out.println("Value not found in the BST.");
        }
    }
    public static treeNode searchBST(treeNode root, int data) {
        if (root == null || root.data == data) {
            return root;
        } else if (data < root.data) {
            return searchBST(root.left, data);
        } else {
            return searchBST(root.right, data);
        }
    }
}
