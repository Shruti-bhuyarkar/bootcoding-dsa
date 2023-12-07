package com.bootcoding.dsa.LeetCode.difficultyLevel.Hard;

import com.bootcoding.dsa.LinkedList.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergekSortedLists {
    public static void main(String[] args) {
        MergekSortedLists solution = new MergekSortedLists();

        ListNode[] lists = new ListNode[3];
        lists[0] = new ListNode(1);
        lists[0].next = new ListNode(4);
        lists[0].next.next = new ListNode(5);

        lists[1] = new ListNode(1);
        lists[1].next = new ListNode(3);
        lists[1].next.next = new ListNode(4);

        lists[2] = new ListNode(2);
        lists[2].next = new ListNode(6);

        ListNode result = solution.mergeKLists(lists);

        System.out.println("Merged sorted linked list:");
        printList(result);
    }

    private static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

        public ListNode mergeKLists(ListNode[] lists) {
            PriorityQueue<ListNode> minHeap = new PriorityQueue<>(Comparator.comparingInt(node -> node.val));

            for (ListNode list : lists) {
                if (list != null) {
                    minHeap.add(list);
                }
            }
            ListNode dummy = new ListNode(0);
            ListNode current = dummy;

            while (!minHeap.isEmpty()) {
                ListNode smallest = minHeap.poll();

                current.next = smallest;
                current = current.next;

                if (smallest.next != null) {
                    minHeap.add(smallest.next);
                }
            }

            return dummy.next;
        }
    }



