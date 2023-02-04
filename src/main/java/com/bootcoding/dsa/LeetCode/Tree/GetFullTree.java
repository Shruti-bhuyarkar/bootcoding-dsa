package com.bootcoding.dsa.LeetCode.Tree;

public class GetFullTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);

        root.left = n2;
        root.right = n3;
         n2.right = n5;
        n2.left = n4;
        System.out.println(getfull(root));
    }

    public static boolean getfull(TreeNode root) {
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
