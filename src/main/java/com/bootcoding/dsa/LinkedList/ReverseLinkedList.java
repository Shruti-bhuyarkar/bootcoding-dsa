package com.bootcoding.dsa.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {


        Node firstNode = new Node(1);
        Node secondNode = new Node(2);
        Node thirdNode = new Node(2);
        Node fourthNode = new Node(1);
       // Node fifthNode = new Node(3);

        Node head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
//        fourthNode.next = fifthNode;
//        fifthNode.next = null;
        print(head);
       Node node = printReverseLinkedList(head);
       print(node);
    }
    public static Node printReverseLinkedList(Node head){
        Node Current = head;
        Node Next = null;
        Node prev = null;

        while ( Current != null){
            Next = Current.next;
            Current.next = prev;
            prev = Current;
            Current = Next;
        }
        return  prev;
    }
    public static void print(Node head){
        Node temp = head;
        System.out.println();
        while (temp != null){
            System.out.print(temp.data+ " -> ");
            temp = temp.next;
        }
    }
}
