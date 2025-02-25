package com.takeyouforward.LinkedList.singleLinkedList;

public class deleteNthNodeFromEnd {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        int N = 2;

        Node temp = deleteNthFromEnd2(head, N);
        traversal(temp);
    }

    public static void traversal(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    //brute force approach
    public static Node deleteNthFromEnd(Node head, int N){
        if (head == null){
            return null;
        }
        int count = 0;
        Node temp = head;
        while (temp != null){
            count++;
            temp = temp.next;
        }

        if (count == N){
            Node newNode = head.next;
            head = null;
            return newNode;
        }

        int res = count - N;
        temp = head;
        while (temp != null){
            res--;
            if (res == 0){
                break;
            }
            temp = temp.next;
        }

        Node delNode = temp.next;
        temp.next = temp.next.next;
        delNode = null;
        return head;
    }

    //optimal approach
    public static Node deleteNthFromEnd2(Node head, int N){
        Node slow = head;
        Node fast = head;

        for (int i = 0; i < N; i++) {
            fast = fast.next;
        }
        if (fast == null){
            return head.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        Node delNode = slow.next;
        slow.next = slow.next.next;
        delNode = null;
        return head;
    }
}
