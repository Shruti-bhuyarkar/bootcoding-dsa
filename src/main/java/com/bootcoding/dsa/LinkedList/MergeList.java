
public class MergeList {

    public static void main(String[] args) {
        // Create the first sorted list: 1 -> 3 -> 4 -> 7
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(4);
        l1.next.next.next = new ListNode(7);

        // Create the second sorted list: 2 -> 5 -> 6
        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(5);
        l2.next.next = new ListNode(6);

        // Merge the two sorted lists
        ListNode result = mergeTwoLists(l1, l2);

        // Print the resulting merged list: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7
        while (result != null) {
            System.out.print(result.val + " -> ");
            result = result.next;
        }
        System.out.print("null");
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        if (l1 != null) {
            curr.next = l1;
        }
        if (l2 != null) {
            curr.next = l2;
        }
        return dummy.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}
