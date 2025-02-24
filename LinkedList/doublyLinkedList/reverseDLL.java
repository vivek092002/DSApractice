package com.takeyouforward.LinkedList.doublyLinkedList;

import java.util.Stack;

public class reverseDLL {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        Node head = convert(arr);
        Node temp = reverse2(head);
        traversal(temp);
    }

    //reverse DLL using stack DS
    //O(2N) and space take a stack - O(N)
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

    //reverse using single pass
    public static Node reverse2(Node head){
        if (head == null || head.next == null){
            return head;
        }
        Node prev = null;
        Node current = head;
        while (current != null){
            prev = current.back;
            current.back = current.next;
            current.next = prev;
            current = current.back;
        }

        return prev.back;
    }

    public static void traversal(Node temp){
        if (temp == null){
            return;
        }
        System.out.print(temp.data + " ");
        traversal(temp.next);
    }

    public static Node convert(int[] arr){

        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
}
