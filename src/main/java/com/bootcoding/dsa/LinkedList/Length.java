package com.bootcoding.dsa.LinkedList;

public class Length {
    public static void main(String[] args) {
        Node firstNode = new Node(1);
        Node secondNode = new Node(1);
        Node thirdNode = new Node(3);
        Node fourthNode = new Node(4);
        Node fifthNode = new Node(3);

        Node head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = fifthNode;
        fifthNode.next = null;

        getLength(head);
    }
    public static void getLength(Node head){
        Node temp = head;
        int n = 0;
        while (temp != null){
            n++;
            temp = temp.next;
        }
        System.out.println(n);
    }
}
