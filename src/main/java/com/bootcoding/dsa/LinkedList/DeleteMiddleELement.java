package com.bootcoding.dsa.LinkedList;
// wap to delete a middle element in Linked list
public class DeleteMiddleELement {
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

        deleteMiddleElement(head);
    }

    public static void deleteMiddleElement(Node head) {
        Node temp = head;

        int counter = 1;
        int mid;
        while (temp != null) {
            counter++;
            temp = temp.next;
        }
        mid = (counter) / 2;
        int count = 1;
        temp = head;
        while (temp != null){
            if(count++ == mid - 1){
                temp.next = temp.next.next;
            }
            System.out.println(temp.data);
            temp = temp.next;
        }


    }
}


