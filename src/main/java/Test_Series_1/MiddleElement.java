package Test_Series_1;

import com.bootcoding.dsa.LinkedList.ListNode;
import com.bootcoding.dsa.LinkedList.Node;

public class MiddleElement {
    public static void main(String[] args) {
        Node FN = new Node(1);
        Node SN = new Node(2);
        Node TN = new Node(3);
        Node FON = new Node(4);

        Node head = FN;
        FN.next =  SN.next;
        SN.next = TN.next;
        TN.next = FON;
       Node a = printMiddleElement(head);
       while (a != null){
           System.out.println(a.data);
           a = a.next;
       }
    }

        private static  Node printMiddleElement(Node head){
        Node temp = head;
       // Node temp2 = head;
        int counter = 0;
        int mid;
        while (temp != null) {
            counter++;
            temp = temp.next;
        }

        mid = (counter) / 2;
        temp = head;
        for (int i = 0; i < mid; i++){
            temp = temp.next;
        }
        head = temp;
        return head;
    }
}
