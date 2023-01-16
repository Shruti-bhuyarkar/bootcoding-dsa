package com.bootcoding.dsa.LinkedList;

public class PrintMaximum {
    public static void main(String[] args) {
        Node firstNode = new Node(1);
        Node secondNode = new Node(2);
        Node thirdNode = new Node(3);
        Node fourthNode = new Node(4);
        Node fifthNode = new Node(5);

        Node head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = fifthNode;
        fifthNode.next = null;

      printMaximum(head);
    }
    public static void printMaximum(Node head){
        Node temp = head;
        int max = temp.data;
        while (temp != null) {
            if (temp.data > max){
                max = temp.data;
            }
            temp = temp.next;

        }
        System.out.println("Maximum value " + max);
    }
}
