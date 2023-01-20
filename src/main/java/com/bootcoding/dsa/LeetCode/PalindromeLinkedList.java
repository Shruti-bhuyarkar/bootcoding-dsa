package com.bootcoding.dsa.LeetCode;

import com.bootcoding.dsa.LinkedList.ListNode;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        ListNode firstNode = new ListNode(1);
        ListNode secondNode = new ListNode(2);
        ListNode thirdNode = new ListNode(2);
        ListNode fourthNode = new ListNode(1);
        // ListNode fifthNode = new ListNode(5);

        ListNode head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
//        fourthNode.next = null;

        System.out.println(inPalindromeLinkedList(head));

    }
    public static boolean inPalindromeLinkedList(ListNode head) {
        ListNode Current = head;
        ListNode Next;
        ListNode prev;
        ListNode Current2 = head;
        while (Current2 != null && Current2.next == null) {
//            Current = Current.next;
//            Current2 = Current2.next.next;
        }
        prev = Current;
        Current = Current.next;
        while (Current != null) {
            Next = Current.next;
            Current.next = prev;
            prev = Current;
            Current = Next;
        }
        Current2 = head;
        Current = prev;
        while (Current != null){
            if (Current2.val != Current.val){
                return false;
            }
            return true;
        }
        return false;
    }
}


