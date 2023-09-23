package com.bootcoding.dsa.LeetCode.LinkedList;

import com.bootcoding.dsa.LinkedList.ListNode;

public class DeleteNode {
    public static void main(String[] args) {
        ListNode firstNode = new ListNode(4);
        ListNode secondNode = new ListNode(5);
        ListNode thirdNode = new ListNode(1);
        ListNode fourthNode = new ListNode(9);
        // ListNode fifthNode = new ListNode(5);

        ListNode head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = null;

        //print(head);
      deleteNode(secondNode);
       print(head);
    }
    public static ListNode deleteNode(ListNode node) {

           node.val = node.next.val;
            node.next = node.next.next;
          // System.out.println(node);
        return node;
    }
        public static void print(ListNode head){
            ListNode temp = head;
            while (temp != null){
                System.out.println(temp.val);
                temp = temp.next;
            }
        }
    }

