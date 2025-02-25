package com.takeyouforward.LinkedList.singleLinkedList;

public class sortLLZeroFirstSecond {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);

        Node temp = segregate(head);
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

    public static Node segregate(Node head){
        int count = 0, count1 = 0, count2 = 0;
        Node temp = head;
        while (temp != null){
            if (temp.data == 0){
                count++;
            } else if (temp.data == 1) {
                count1++;
            } else {
                count2++;
            }
            temp = temp.next;
        }

        temp = head;
        while (temp != null){
            if (count>0){
                temp.data = 0;
                count--;
            } else if (count1 > 0) {
                temp.data = 1;
                count1--;
            } else {
                temp.data = 2;
                count2--;
            }
            temp = temp.next;
        }
        return head;
    }
}
