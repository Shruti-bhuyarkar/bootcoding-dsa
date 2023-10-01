package Test_Series_1;

import com.bootcoding.dsa.LinkedList.Node;

public class ReverseLinkedList {
    public static void main(String[] args) {
        Node FN = new Node(1);
        Node SN = new Node(2);
        Node TN = new Node(3);
        Node FON = new Node(4);

        Node head = FN;
        FN.next =  SN.next;
        SN.next = TN.next;
        TN.next = FON;
        print(head);
       Node n = printReverseLinkedList(head);
        print(n);
    }
    private static Node printReverseLinkedList(Node head){
        Node temp = head;
        Node prev = null;
        Node next = null;

        while ( temp != null){
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }
    private static void  print(Node head){
        Node temp = head;
        System.out.println();
        while (temp != null){
            System.out.print(temp.data + " - ");
            temp = temp.next;
        }
    }
}
