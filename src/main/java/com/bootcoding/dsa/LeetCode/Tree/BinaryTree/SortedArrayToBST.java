package com.bootcoding.dsa.LeetCode.Tree.BinaryTree;

import com.bootcoding.dsa.LeetCode.Tree.treeNode;
public class SortedArrayToBST {
    public class Main {
        public static void main(String[] args) {
            int[] nums = {1, 2, 3, 4, 5, 6, 7};
            SortedArrayToBST converter = new SortedArrayToBST();
            treeNode root = converter.sortedArrayToBST(nums);
        }
    }
    public treeNode sortedArrayToBST(int[] nums) {
            if (nums == null || nums.length == 0) {
                return null;
            }

            return sortedArrayToBST(nums, 0, nums.length - 1);
        }

        private treeNode sortedArrayToBST(int[] nums, int left, int right) {
            if (left > right) {
                return null;
            }

            int mid = left + (right - left) / 2; // Calculate the middle index
            treeNode root = new treeNode(nums[mid]); // Create the root node

            // Recursively build the left and right subtrees
            root.left = sortedArrayToBST(nums, left, mid - 1);
            root.right = sortedArrayToBST(nums, mid + 1, right);

            return root;
        }
    }

