package com.bootcoding.dsa.LeetCode.Tree;

public class HeightOfTree {
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

        findHeight(root);
    }
    public static void findHeight(treeNode root){

    }
}
