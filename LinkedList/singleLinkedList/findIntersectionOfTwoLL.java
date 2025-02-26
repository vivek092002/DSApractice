package com.takeyouforward.LinkedList.singleLinkedList;

import java.util.HashSet;

public class findIntersectionOfTwoLL {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);

        Node head2 = new Node(10);
        head2.next = new Node(20);
        head2.next.next = new Node(30);
        head2.next.next.next = new Node(40);
        head2.next.next.next.next = new Node(50);
        head2.next.next.next.next.next = new Node(60);

        Node temp = interSectionPoint(head,head2);
    }

    //brute force approach
    //O(N) + O(N) and space - O(N)
    public static Node interSectionPoint(Node head, Node head2){
        HashSet<Node> set = new HashSet<>();
        Node temp = head;
        while (temp != null){
            set.add(temp);
            temp = temp.next;
        }

        Node temp2 = head2;
        while (temp2 != null){
            if (set.contains(temp2)){
                return temp2;
            }
            temp2 = temp2.next;
        }
        return null;
    }

    //optimal approach
    public static Node interSectionPoint2(Node head, Node head2){
        if (head == null || head2 == null){
            return null;
        }
        Node t1 = head, t2 = head2;
        while (t1 != t2){
            t1 = t1.next;
            t2 = t2.next;

            if (t1 == t2){
                return t1;
            }

            if (t1 == null){
                t1 = head2;
            }
            if (t2 == null){
                t2 = head;
            }
        }
        return t1;
    }
}
