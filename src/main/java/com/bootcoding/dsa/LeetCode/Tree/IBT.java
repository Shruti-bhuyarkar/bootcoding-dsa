package com.bootcoding.dsa.LeetCode.Tree;

public class IBT {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(7);
        TreeNode n4 = new TreeNode(1);
        TreeNode n5 = new TreeNode(3);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(9);


        root.left = n2;
        root.right = n3;
        n2.right = n5;
        n2.left = n4;
        n3.left = n6;
        n3.right = n7;

        System.out.println(invertTree(root));
    }
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        return root;
    }
}
