package com.bootcoding.dsa.LeetCode.LinkedList;

import com.bootcoding.dsa.LinkedList.ListNode;

public class LinkedListCycle {
    public static void main(String[] args) {
        ListNode firstNode = new ListNode(3);
        ListNode secondNode = new ListNode(2);
        ListNode thirdNode = new ListNode(0);
        ListNode fourthNode = new ListNode(-4);
        // ListNode fifthNode = new ListNode(5);

        ListNode head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = secondNode;

        System.out.println(hasCycle(head));
    }
    public static boolean hasCycle(ListNode head) {
        ListNode sp = head;
        ListNode fp = head;
        while (fp != null && fp.next != null) {
            sp = sp.next;
            fp = fp.next.next;
            if (sp == fp) {
                return true;
            }
        }
        return false;
    }
}
