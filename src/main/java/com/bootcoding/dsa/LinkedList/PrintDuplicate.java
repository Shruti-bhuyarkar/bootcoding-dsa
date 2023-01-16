package com.bootcoding.dsa.LinkedList;

public class PrintDuplicate {
    public static void main(String[] args) {
        Node firstNode = new Node(1);
        Node secondNode = new Node(2);
        Node thirdNode = new Node(3);
        Node fourthNode = new Node(4);
        Node fifthNode = new Node(3);

        Node head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = fifthNode;
        fifthNode.next = null;

        printDuplicate(head);
    }
    public static void printDuplicate(Node head){
        Node temp = head;
        int DuplicateCounter = 0;
        while (temp.next != null) {
            Node temp2 = temp.next;
            while(temp2 != null) {
                if (temp.data == temp2.data) {
                    System.out.println(temp.data);
                    return;
                }
                temp2 = temp2.next;
            }

            temp = temp.next;
        }

    }
}
