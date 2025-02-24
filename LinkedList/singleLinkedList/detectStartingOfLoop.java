package com.takeyouforward.LinkedList.singleLinkedList;

import java.util.HashSet;

public class detectStartingOfLoop {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);

        Node temp = detectStart2(head);
        System.out.println(temp);

    }

    //brute force solution
    //O(N) and space O(N)
    public static Node detectStart(Node head){
        HashSet<Node> set = new HashSet<>();
        Node temp = head;
        while (temp != null){
            if (set.contains(temp)){
                return temp;
            }

            set.add(temp);
            temp = temp.next;
        }
        return null;
    }

    //optimal solution
    //O(N) and O(1)
    public static Node detectStart2(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast){
                slow = head;
                while (slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
