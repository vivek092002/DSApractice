package com.takeyouforward.heap;

import java.util.PriorityQueue;

class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

public class mergeKSortedList {

    public static ListNode mergedSort(ListNode[] lists){
        if (lists == null || lists.length == 0){
            return null;
        }

        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a,b) -> a.val - b.val);
        for (ListNode node : lists){
            if (node != null){
                minHeap.add(node);
            }
        }
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        // Merge lists using the heap
        while (!minHeap.isEmpty()) {
            ListNode minNode = minHeap.poll();
            current.next = minNode;
            current = current.next;

            if (minNode.next != null) {
                minHeap.add(minNode.next);
            }
        }

        return dummy.next;
//        ListNode head = minHeap.poll();
//        ListNode temp = head;
//        while (minHeap.peek() != null){
//            temp.next = minHeap.poll();
//            temp = temp.next;
//        }
//        if (head != null){
//            temp.next = null;
//        }
//        return head;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode[] lists = new ListNode[3];
        lists[0] = new ListNode(1);
        lists[0].next = new ListNode(4);
        lists[0].next.next = new ListNode(7);
        lists[1] = new ListNode(2);
        lists[1].next = new ListNode(5);
        lists[1].next.next = new ListNode(8);
        lists[2] = new ListNode(3);
        lists[2].next = new ListNode(6);
        lists[2].next.next = new ListNode(9);

        ListNode merge = mergedSort(lists);
        printList(merge);
    }
}
