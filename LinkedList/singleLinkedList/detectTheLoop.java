package com.takeyouforward.LinkedList.singleLinkedList;

import java.util.HashMap;
import java.util.HashSet;

public class detectTheLoop {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);

        System.out.println(detectLoop(head));
    }

    //brute force approach
    public static boolean detectLoop(Node head){
        HashSet<Node> hs = new HashSet<>();
        Node temp = head;
        while (temp != null){
            if (hs.contains(temp)){
                return true;
            }
            hs.add(temp);
            temp = temp.next;
        }
        return false;
    }


    //optimal solution
    //tortoise and hare algorithm
    public static boolean detectLoop2(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast){
                return true;
            }
        }
        return false;
    }
}
