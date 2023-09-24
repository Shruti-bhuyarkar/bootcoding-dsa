package com.bootcoding.dsa.LeetCode.Tree;

public class EvenNumber {
    public static void main(String[] args) {
        treeNode root = new treeNode(1);
        treeNode n2 = new treeNode(2);
        treeNode n3 = new treeNode(3);
        treeNode n4 = new treeNode(4);
        treeNode n5 = new treeNode(5);
        treeNode n6 = new treeNode(6);
        treeNode n7 = new treeNode(7);
        treeNode n8 = new treeNode(8);
        treeNode n9 = new treeNode(9);
        treeNode n10 = new treeNode(10);
        treeNode n11 = new treeNode(11);
        treeNode n12 = new treeNode(12);
        treeNode n13 = new treeNode(13);
        treeNode n14 = new treeNode(14);
        treeNode n15 = new treeNode(15);

        root.left = n2;
        root.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.right = n7;
        n3.left = n6;
        n4.right = n9;
        n4.left = n8;
        n5.left = n10;
        n5.right = n11;
        n6.left = n12;
        n6.right = n13;
        n7.left = n14;
        n7.right = n15;

        EvenNumber(root);
    }
    public static void EvenNumber(treeNode root){
        if(root == null){
            return;
        }
        if(root.data % 2 == 0 ){
            System.out.println(root.data);
        }
        EvenNumber(root.left);
        EvenNumber(root.right);
    }
}
