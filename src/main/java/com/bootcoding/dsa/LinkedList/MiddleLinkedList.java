package com.bootcoding.dsa.LinkedList;

import java.util.Scanner;

public class MiddleLinkedList {
    public static void main(String[] args) {
        ListNode firstNode = new ListNode(1);
        ListNode secondNode = new ListNode(2);
        ListNode thirdNode = new ListNode(3);
        ListNode fourthNode = new ListNode(4);
        ListNode fifthNode = new ListNode(5);

        ListNode head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = fifthNode;
        fifthNode.next = null;

        ListNode a = middleNode(head);
        while (a != null) {
            System.out.println(a.val);
            a = a.next;
        }
    }

    public static ListNode middleNode(ListNode head) {
        ListNode temp = head;
        ListNode temp2 = head;
        int counter = 0;
        int mid;
        while (temp != null) {
            counter++;
            temp = temp.next;
        }
        mid = (counter) / 2;
        while (mid != 0) {
            temp2 = temp2.next;
            mid--;
        }
        for (int i = 0; i < mid; i++) {
            temp2 = temp2.next;
        }
        return temp2;
    }
}
