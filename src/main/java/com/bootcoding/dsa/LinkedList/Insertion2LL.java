package com.bootcoding.dsa.LinkedList;

public class Insertion2LL {

        public static void main(String[] args) {
            // Create the first list: 1 -> 3 -> 4 -> 7
            ListNode l1 = new ListNode(1);
            l1.next = new ListNode(3);
            l1.next.next = new ListNode(4);
            l1.next.next.next = new ListNode(7);

            // Create the second list: 2 -> 5 -> 6
            ListNode l2 = new ListNode(2);
            l2.next = new ListNode(5);
            l2.next.next = new ListNode(6);

            // Insert the second list into the first list at position 2
            ListNode result = insertList(l1, l2, 2);

            // Print the resulting list: 1 -> 3 -> 2 -> 5 -> 6 -> 4 -> 7
            while (result != null) {
                System.out.print(result.val + " -> ");
                result = result.next;
            }
            System.out.print("null");
        }

        public static ListNode insertList(ListNode head1, ListNode head2, int pos) {
            if (head1 == null) {
                return head2;
            }
            if (head2 == null) {
                return head1;
            }
            ListNode prev = null;
            ListNode curr = head1;
            int count = 0;
            while (curr != null && count < pos) {
                prev = curr;
                curr = curr.next;
                count++;
            }
            ListNode tail2 = head2;
            while (tail2.next != null) {
                tail2 = tail2.next;
            }
            if (prev == null) {
                head2.next = head1;
                return head2;
            }
            prev.next = head2;
            tail2.next = curr;
            return head1;
        }
    }

//    class ListNode {
//        int val;
//        ListNode next;
//        ListNode(int val) {
//            this.val = val;
//        }
//    }
//
//}