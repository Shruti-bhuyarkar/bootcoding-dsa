package com.bootcoding.dsa.LinkedList;

public class PrintOdd {
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

        printOdd(head);
    }
    public static void printOdd(Node head){
        Node temp = head;
        while (temp.next != null) {
            if (temp.data % 2 == 1) {
                System.out.println(temp.data);
            }
            temp = temp.next;
        }
    }
    }

