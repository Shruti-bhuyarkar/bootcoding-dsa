package com.bootcoding.dsa.LinkedList;

public class MergeList {
    public static void main(String[] args) {
        ListNode firstNode = new ListNode(1);
        ListNode secondNode = new ListNode(2);
        ListNode fourthNode = new ListNode(4);


        ListNode head = firstNode;
        firstNode.next = secondNode;
        secondNode.next =  fourthNode;
        fourthNode.next = null;

        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(4);

//        ListNode head = l1;
//        l1.next = l2;
//        l2.next =  l3;
//        l3.next = null;
//        mergeTwoLists(head);

    }
    public static  ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode curr = head;
        while(list1 != null && list2 != null){
            //merge list
            if(list1.val <= list2.val){
                curr.next = list1;
                list1 = list1.next;
            }
            else{
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        curr.next = list2 != null ? list1 : list2;
        return head.next;
    }
}
