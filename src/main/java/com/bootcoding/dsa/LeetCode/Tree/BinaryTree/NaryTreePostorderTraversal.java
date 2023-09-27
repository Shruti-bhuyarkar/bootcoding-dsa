package com.bootcoding.dsa.LeetCode.Tree.BinaryTree;

//import com.bootcoding.dsa.LeetCode.treeNode;

import java.util.ArrayList;
import java.util.List;

public class NaryTreePostorderTraversal {
    public static void main(String[] args) {

        Node root = new Node(1);
        root.children.add(new Node(3));
        root.children.add(new Node(2));
        root.children.add(new Node(4));

        root.children.get(0).children.add(new Node(5));
        root.children.get(0).children.add(new Node(6));

        List<Integer> result = postorder(root);
        System.out.println(result); // Output: [5, 6, 3, 2, 4, 1]
    }
    public static List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        postorderTraversal(root, result);
        return result;
    }
    private static void postorderTraversal(Node node, List<Integer> result) {
        if (node == null) {
            return;
        }
        for (Node child : node.children) {
            postorderTraversal(child, result);
        }
        result.add(node.val);
    }
}
