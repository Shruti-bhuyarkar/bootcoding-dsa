package com.bootcoding.dsa.LeetCode.difficultyLevel.Medium;


import com.bootcoding.dsa.LeetCode.Tree.treeNode;

import java.util.*;

public class BinaryTreeInfectionTime {
    private Map<Integer, List<Integer>> adjacencyList = new HashMap<>();

    public static void main(String[] args) {
        BinaryTreeInfectionTime solution = new BinaryTreeInfectionTime();

        treeNode root = new treeNode(1);
        root.left = new treeNode(2);
        root.right = new treeNode(3);
        root.left.left = new treeNode(4);
        root.left.right = new treeNode(5);
        root.right.left = new treeNode(6);
        root.right.right = new treeNode(7);

        int result = solution.amountOfTime(root, 4);
        System.out.println("Minutes to infect the entire tree: " + result);
    }

    public int amountOfTime(treeNode root, int start) {
        convertToGraph(root);
        Deque<Integer> queue = new ArrayDeque<>();
        Set<Integer> visited = new HashSet<>();

        queue.offer(start);
        int time = -1;

        while (!queue.isEmpty()) {
            time++;
            for (int i = queue.size(); i > 0; i--) {
                int currentNode = queue.pollFirst();
                visited.add(currentNode);

                if (adjacencyList.containsKey(currentNode)) {
                    for (int neighbor : adjacencyList.get(currentNode)) {
                        if (!visited.contains(neighbor)) {
                            queue.offer(neighbor);
                        }
                    }
                }
            }
        }
        return time;
    }

    private void convertToGraph(treeNode node) {
        if (node == null) {
            return;
        }

        if (node.left != null) {
            adjacencyList.computeIfAbsent(node.data, k -> new ArrayList<>()).add(node.left.data);
            adjacencyList.computeIfAbsent(node.left.data, k -> new ArrayList<>()).add(node.data);
        }

        if (node.right != null) {
            adjacencyList.computeIfAbsent(node.data, k -> new ArrayList<>()).add(node.right.data);
            adjacencyList.computeIfAbsent(node.right.data, k -> new ArrayList<>()).add(node.data);
        }

        convertToGraph(node.left);
        convertToGraph(node.right);
    }
}
