package com.bootcoding.dsa.LinkedList;

public class PrintMinimum {
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

        printMinimum(head);
    }
    public static void printMinimum(Node head){
        Node temp = head;
        int min = temp.data;
        while (temp != null) {
            if (temp.data < min){
                min = temp.data;
            }
            temp = temp.next;

        }
        System.out.println("Maximum value " + min);
    }
}
