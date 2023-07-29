package com.bootcoding.dsa.LeetCode.Tree;

public class HeightOfTree {
    public static void main(String[] args) {
        treeNode root = new treeNode(1);
        treeNode n2 = new treeNode(2);
        treeNode n3 = new treeNode(3);
        treeNode n4 = new treeNode(4);
        treeNode n5 = new treeNode(5);
        treeNode n6 = new treeNode(6);
        treeNode n7 = new treeNode(7);

        root.left = n2;
        root.right = n3;
        n2.right = n5;
        n2.left = n4;
        n3.left = n6;
        n4.right = n7;

        System.out.println(findHeight(root));
    }
    public static int findHeight(treeNode root){
        if (root == null) {
            return 0;
        }
        int HT = findHeight(root.left);
        int RT = findHeight(root.right);
        return 1+Math.max(HT, RT);
    }
}
