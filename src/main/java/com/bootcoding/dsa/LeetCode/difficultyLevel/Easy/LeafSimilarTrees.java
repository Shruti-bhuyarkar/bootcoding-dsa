package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class LeafSimilarTrees {
    public static void main(String[] args) {
        LeafSimilarTrees solution = new LeafSimilarTrees();

        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(5);
        root1.right = new TreeNode(1);
        root1.left.left = new TreeNode(6);
        root1.left.right = new TreeNode(2);
        root1.right.left = new TreeNode(9);
        root1.right.right = new TreeNode(8);
        root1.left.right.left = new TreeNode(7);
        root1.left.right.right = new TreeNode(4);

        TreeNode root2 = new TreeNode(3);
        root2.left = new TreeNode(5);
        root2.right = new TreeNode(1);
        root2.left.left = new TreeNode(6);
        root2.left.right = new TreeNode(2);
        root2.right.left = new TreeNode(9);
        root2.right.right = new TreeNode(8);
        root2.left.right.left = new TreeNode(7);
        root2.left.right.right = new TreeNode(4);

        boolean result = solution.leafSimilar(root1, root2);
        System.out.println("Are the trees leaf-similar? " + result);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        StringBuilder leafSequence1 = new StringBuilder();
        StringBuilder leafSequence2 = new StringBuilder();

        getLeafSequence(root1, leafSequence1);
        getLeafSequence(root2, leafSequence2);

        return leafSequence1.toString().equals(leafSequence2.toString());
    }

    private void getLeafSequence(TreeNode root, StringBuilder leafSequence) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            leafSequence.append(root.val).append(",");
            return;
        }

        getLeafSequence(root.left, leafSequence);
        getLeafSequence(root.right, leafSequence);
    }


}

