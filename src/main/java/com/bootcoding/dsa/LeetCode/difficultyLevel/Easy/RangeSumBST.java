package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;

import com.bootcoding.dsa.LeetCode.Tree.treeNode;
public class RangeSumBST {
    public static void main(String[] args) {
        treeNode root = new treeNode(10);
        root.left = new treeNode(5);
        root.right = new treeNode(15);
        root.left.left = new treeNode(3);
        root.left.right = new treeNode(7);
        root.right.right = new treeNode(18);

        RangeSumBST rangeSumBST = new RangeSumBST();
        int low = 7;
        int high = 15;
        int result = rangeSumBST.rangeSumBST(root, low, high);
        System.out.println("Range Sum between " + low + " and " + high + " is: " + result); // Output: Range Sum between 7 and 15 is: 32
    }
    public int rangeSumBST(treeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        if (root.data >= low && root.data <= high) {
            sum += root.data;
        }
        sum += rangeSumBST(root.left, low, high);
        sum += rangeSumBST(root.right, low, high);
        return sum;
    }
}
