package com.bootcoding.dsa.LeetCode.Tree;

public class GetFullTree {
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
        System.out.println(getfull(root));
    }
    public static boolean getfull(treeNode root) {
        if (root == null) {
            return true;
        }
        //for leaf node
        if (root.right == null && root.left == null) {
            return true;
        }
        if (root.left != null && root.right != null && getfull(root.left) && getfull(root.right) ) {
            return true;
        }
        return false;

//            if (root.data == 0){
//                return false;
//            }
//            return true;
//        }
//        if (root.data == 2){
//            return getfull(root.left) || getfull(root.right);
//        }
//        return getfull(root.left) && getfull(root.right);
//    }
    }
}
