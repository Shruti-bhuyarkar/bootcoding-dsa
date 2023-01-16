package com.bootcoding.dsa.LinkedList;


public class Example1 {
    public static void main(String[] args) {

        Node firstNode = new Node(10);
        Node secondNode = new Node(20);
        Node thirdNode = new Node(30);
        Node fourthNode = new Node(40);
        Node fifthNode = new Node(50);

        Node head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = fifthNode.next;
        fifthNode.next = null;

        //call method

        //lastInsert(head);
        head = firstInsert(head);
        lastInsert(head);
        print(head);


    }
    public static void print(Node head){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static Node firstInsert(Node head)
    {
        Node node = new Node(70);
        System.out.println(head);
        node.next=head;
        head = node;
        return head;

    }
    public static void lastInsert(Node head){
        Node node = new Node(50);
        Node temp = head;
        System.out.println(head);
        while (temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = node;
    }
}
//print even, odd , max , min, duplicate in linked list