package com.bootcoding.dsa.LeetCode.difficultyLevel.Easy;

import com.bootcoding.dsa.LinkedList.ListNode;

public class addTwoNumbers {

        public static void main(String[] args) {
            // Create the first list: 2 -> 4 -> 3
            ListNode l1 = new ListNode(2);
            l1.next = new ListNode(4);
            l1.next.next = new ListNode(3);

            // Create the second list: 5 -> 6 -> 4
            ListNode l2 = new ListNode(5);
            l2.next = new ListNode(6);
            l2.next.next = new ListNode(4);

            // Add the two lists and print the result: 7 -> 0 -> 8
            ListNode result = addTwoNumbers(l1, l2);
            while (result != null) {
                System.out.print(result.val + " -> ");
                result = result.next;
            }
            System.out.print("null");
        }

        public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode dummyHead = new ListNode(0);
            ListNode curr = dummyHead;
            int carry = 0;
            while (l1 != null || l2 != null) {
                int val1 = (l1 != null) ? l1.val : 0;
                int val2 = (l2 != null) ? l2.val : 0;
                int sum = val1 + val2 + carry;
                carry = sum / 10;
                curr.next = new ListNode(sum % 10);
                curr = curr.next;
                if (l1 != null) l1 = l1.next;
                if (l2 != null) l2 = l2.next;
            }
            if (carry > 0) {
                curr.next = new ListNode(carry);
            }
            return dummyHead.next;
        }
    }

//public class ListNode {
//        int val;
//        ListNode next;
//        ListNode(int val) {
//            this.val = val;
//        }
//    }


