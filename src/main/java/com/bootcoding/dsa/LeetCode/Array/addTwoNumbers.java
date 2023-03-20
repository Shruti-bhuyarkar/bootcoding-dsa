package com.bootcoding.dsa.LeetCode.Array;

import com.bootcoding.dsa.LinkedList.ListNode;

public class addTwoNumbers {
        public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode ptr = result;
        int carry =0; //set default carry
        while(l1 != null || l2 != null){
            int sum = 0 + carry; //initialize sum
            if(l1 != null){     //use no. from 1st list
                sum += l1.val;
                l1=l1.next;
            }
            if(l2 != null){   //use no. from 2nd list
                sum += l2.val;
                l2=l2.next;
            }
            carry = sum/10; //get sum and carry
            sum = sum%10;
            ptr.next = new ListNode(sum);
            ptr = ptr.next;
        }
        if(carry == 1)
            ptr.next = new ListNode(1);
        return result.next;
    }
}
