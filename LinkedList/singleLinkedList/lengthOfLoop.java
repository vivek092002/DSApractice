package com.takeyouforward.LinkedList.singleLinkedList;

import java.util.HashMap;
import java.util.Map;

public class lengthOfLoop {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);

        System.out.println(lengthLoop2(head));
    }

    //brute force method
    //O(N) and O(N) for map
    public static int lengthLoop(Node head){
        Map<Node, Integer> mpp = new HashMap<>();
        Node temp = head;
        int timer = 0;
        while (temp != null){
            if (mpp.containsKey(temp)){
                int loopLength = timer - mpp.get(temp);
                return loopLength;
            }

            mpp.put(temp, timer);
            temp = temp.next;
            timer++;
        }
        return 0;
    }

    //optimal solution
    //tortoise and hare algorithms
    public static int lengthLoop2(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast){
                return findlength(slow, fast);
            }
        }
        return 0;
    }

    public static int findlength(Node slow, Node fast){
        int count = 0;
        fast = fast.next;
        while (slow != fast){
            count++;
            fast = fast.next;
        }
        return count;
    }

}
