package com.bootcoding.dsa.LeetCode.LinkedList;
import com.bootcoding.dsa.LeetCode.Tree.treeNode;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class FindLargestValueEachTreeRow {

    public static void main(String[] args) {
        // Create a sample binary tree
        treeNode root = new treeNode(1);
        root.left = new treeNode(3);
        root.right = new treeNode(2);
        root.left.left = new treeNode(5);
        root.left.right = new treeNode(3);
        root.right.right = new treeNode(9);

        FindLargestValueEachTreeRow findLargestValueEachTreeRow = new FindLargestValueEachTreeRow();
        List<Integer> largestValues = findLargestValueEachTreeRow.largestValues(root);

        System.out.println("Largest values in each level: " + largestValues);
    }

        public List<Integer> largestValues(treeNode root) {
            List<Integer> res = new ArrayList<>();

            if (root == null) {
                return res;
            }

            Queue<treeNode> q = new LinkedList<>();
            q.add(root);

            while (!q.isEmpty()) {
                int max_val = Integer.MIN_VALUE;

                int levelSize = q.size();
                for (int i = 0; i < levelSize; i++) {
                    treeNode node = q.poll();
                    max_val = Math.max(max_val, node.data);

                    if (node.left != null) {
                        q.add(node.left);
                    }
                    if (node.right != null) {
                        q.add(node.right);
                    }
                }
                res.add(max_val);
            }

            return res;
        }


    }



