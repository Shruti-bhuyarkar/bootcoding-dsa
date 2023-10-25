package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;

import java.util.ArrayList;
import java.util.List;

class Node {
    int val;
    List<Node> children;

    Node(int val) {
        this.val = val;
        this.children = new ArrayList<>();
    }
}

public class NaryTreePreorderTraversal {
    public static void main(String[] args) {

        Node root = new Node(1);
        root.children.add(new Node(3));
        root.children.add(new Node(2));
        root.children.add(new Node(4));

        root.children.get(0).children.add(new Node(5));
        root.children.get(0).children.add(new Node(6));

        List<Integer> result = preorder(root);
        System.out.println(result); // Output: [1, 3, 5, 6, 2, 4]
    }
    public static List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        preorderTraversal(root, result);
        return result;
    }

    private static void preorderTraversal(Node node, List<Integer> result) {
        if (node == null) {
            return;
        }

        result.add(node.val);
        for (Node child : node.children) {
            preorderTraversal(child, result);
        }
    }


}
