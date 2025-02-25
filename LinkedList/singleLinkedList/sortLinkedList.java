package com.takeyouforward.LinkedList.singleLinkedList;

import java.util.ArrayList;
import java.util.Collections;

public class sortLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);

        Node temp = sortLL(head);
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
    public static Node sortLL(Node head){
        ArrayList<Integer> list = new ArrayList<>();
        Node temp = head;
        while (temp != null){
            list.add(temp.data);
            temp = temp.next;
        }

        Collections.sort(list);
        int i = 0;
        temp = head;
        while (temp != null){
            temp.data = list.get(i);
            i++;
            temp = temp.next;
        }
        return head;
    }
}
