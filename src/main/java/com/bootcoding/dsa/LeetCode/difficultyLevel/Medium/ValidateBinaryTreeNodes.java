package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;
import java.util.*;
public class ValidateBinaryTreeNodes {


    public static void main(String[] args) {
        ValidateBinaryTreeNodes validateBinaryTreeNodes = new ValidateBinaryTreeNodes();

        int n = 6;
        int[] leftChild = {1, -1, -1, 4, -1, -1};
        int[] rightChild = {2, -1, -1, 5, -1, -1};

        boolean result = validateBinaryTreeNodes.validateBinaryTreeNodes(n, leftChild, rightChild);

        if (result) {
            System.out.println("Valid binary tree nodes.");
        } else {
            System.out.println("Invalid binary tree nodes.");
        }
    }
        public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
            int[] inDegree = new int[n];
            int rootCandidate = -1;

            for (int node = 0; node < n; node++) {
                int left = leftChild[node];
                int right = rightChild[node];
                if (left != -1) {
                    inDegree[left]++;
                    if (inDegree[left] > 1) {
                        return false;  // Early exit if a node has multiple parents.
                    }
                }
                if (right != -1) {
                    inDegree[right]++;
                    if (inDegree[right] > 1) {
                        return false;  // Early exit if a node has multiple parents.
                    }
                }
            }

            for (int node = 0; node < n; node++) {
                if (inDegree[node] == 0) {
                    if (rootCandidate != -1) {
                        return false;  // Multiple candidates for the root.
                    }
                    rootCandidate = node;
                }
            }

            if (rootCandidate == -1) {
                return false;  // No candidate for the root.
            }

            Set<Integer> visited = new HashSet<>();
            Queue<Integer> queue = new LinkedList<>();
            queue.add(rootCandidate);
            visited.add(rootCandidate);

            while (!queue.isEmpty()) {
                int node = queue.poll();
                int left = leftChild[node];
                int right = rightChild[node];

                if (left != -1) {
                    if (visited.contains(left)) {
                        return false;  // Detected a cycle.
                    }
                    visited.add(left);
                    queue.add(left);
                }

                if (right != -1) {
                    if (visited.contains(right)) {
                        return false;  // Detected a cycle.
                    }
                    visited.add(right);
                    queue.add(right);
                }
            }

            return visited.size() == n;
        }


    }


