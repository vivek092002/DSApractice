package com.takeyouforward.LinkedList.singleLinkedList;

import java.util.Stack;

public class reverseALinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);

        Node temp = reversRecursion(head);
        traversal(temp);
    }

    //brute force method
    //using a stack as it a LIFO functionality
    //O(2N)
    public static Node reverse(Node head){
        Node temp = head;
        Stack<Integer> st = new Stack<>();
        while (temp != null){
            st.push(temp.data);
            temp = temp.next;
        }

        temp = head;
        while (temp != null){
            temp.data = st.pop();
            temp = temp.next;
        }
        return head;
    }

    //optimal approach
    public static Node reverseIterative(Node head){
        Node temp = head;
        Node prev = null;
        while (temp != null){
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    //optimal approach using recursion
    public static Node reversRecursion(Node head){
        if (head == null || head.next == null){
            return head;
        }

        Node newNode = reversRecursion(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;
        return newNode;
    }

    public static void traversal(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }
}
