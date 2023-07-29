package com.bootcoding.dsa.LeetCode.Tree;

public class InsertNode {
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

        insertIntoBST(root, 4);
        insertIntoBST(root,60);
        insertIntoBST(root,8);
        insertIntoBST(root,1);
        insertIntoBST(root,9);
        insertIntoBST(root,50);
        insertIntoBST(root,6);
        insertIntoBST(root,21);

        inorder(root);
    }

    public static treeNode insertIntoBST(treeNode root, int data) {
        if (root == null) {
            return new treeNode(data);
        }
        if (root.data == data) {
            return null;
        }
        if (data < root.data){
            if (root.left != null) {
                insertIntoBST(root.left, data);
            }
            else{
                root.left = new treeNode(data);
            }
        }
        else {
            if (root.right != null){
                insertIntoBST(root.right, data);
            }
            else{
                root.right = new treeNode(data);
            }
        }
        return root;
    }
    public static void inorder(treeNode root){
        if (root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
}
