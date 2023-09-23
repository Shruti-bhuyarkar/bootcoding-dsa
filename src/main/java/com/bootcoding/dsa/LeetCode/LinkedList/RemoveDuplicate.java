package com.bootcoding.dsa.LeetCode.LinkedList;

import com.bootcoding.dsa.LinkedList.ListNode;

public class RemoveDuplicate {
    public static void main(String[] args) {
        ListNode firstNode = new ListNode(1);
        ListNode secondNode = new ListNode(1);
        ListNode thirdNode = new ListNode(2);
       // ListNode fourthNode = new ListNode(1);
        // ListNode fifthNode = new ListNode(5);

        ListNode head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next =null;

        System.out.println(deleteDuplicates(head));
    }
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode out=new ListNode(head.val);
        ListNode n = out;
        ListNode temp = head;
        while(temp != null){
            while(temp.next != null && temp.val == temp.next.val)
                temp = temp.next;
            n.next=new ListNode(temp.val);
            n = n.next;
            temp=temp.next;
        }
        return out;
    }
}
