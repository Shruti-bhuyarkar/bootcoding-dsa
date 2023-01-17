package com.bootcoding.dsa.LinkedList;

public class RemoveElement {
    public static void main(String[] args) {
        ListNode firstNode = new ListNode(1);
        ListNode secondNode = new ListNode(7);
        ListNode thirdNode = new ListNode(7);
        ListNode fourthNode = new ListNode(2);
        ListNode fifthNode = new ListNode(3);
        ListNode sixthNode = new ListNode(7);
       // ListNode seventhNode = new ListNode(7);

        ListNode head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = fifthNode;
        fifthNode.next = sixthNode;
        sixthNode.next = null;

        int val = 7;
        removeElements(head, val);

        }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        while (temp!= null){
            if (temp.next.val==val){
                if (temp.next.next==null ){
                    temp.next=null;
                }
                System.out.println(temp.val);

                if(temp.next != null)
                    temp.next = temp.next.next;
            }
            temp=temp.next;
        }
        temp= head;
        return temp;
    }
}
