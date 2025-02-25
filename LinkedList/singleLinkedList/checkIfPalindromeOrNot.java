package com.takeyouforward.LinkedList.singleLinkedList;

import java.util.Stack;

public class checkIfPalindromeOrNot {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);

        System.out.println(palindrome(head));

    }

    //brute force method
    //O(2N) and O(N)
    public static boolean palindrome(Node head){
        Stack<Integer> st = new Stack<>();
        Node temp = head;

        while (temp != null){
            st.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while (temp != null){
            if (temp.data != st.peek()){
                return false;
            }

            st.pop();
            temp = temp.next;
        }
        return true;
    }

}
