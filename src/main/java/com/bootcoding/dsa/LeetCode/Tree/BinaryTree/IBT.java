package com.bootcoding.dsa.LeetCode.Tree.BinaryTree;

import com.bootcoding.dsa.LeetCode.Tree.treeNode;

public class IBT {
    public static void main(String[] args) {
        treeNode root = new treeNode(4);
        treeNode n2 = new treeNode(2);
        treeNode n3 = new treeNode(7);
        treeNode n4 = new treeNode(1);
        treeNode n5 = new treeNode(3);
        treeNode n6 = new treeNode(6);
        treeNode n7 = new treeNode(9);


        root.left = n2;
        root.right = n3;
        n2.right = n5;
        n2.left = n4;
        n3.left = n6;
        n3.right = n7;

        System.out.println(invertTree(root));
    }
    public static treeNode invertTree(treeNode root) {
        if (root == null) {
            return null;
        }
        treeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        return root;
    }
}
//    BinarySearchTree bst = new BinarySearchTree();
//        bst.insert(50);
//                bst.insert(30);
//                bst.insert(70);
//                bst.insert(20);
//                bst.insert(40);
//                bst.insert(60);
//                bst.insert(80);
//                }