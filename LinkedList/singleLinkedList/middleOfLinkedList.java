package com.takeyouforward.LinkedList.singleLinkedList;

public class middleOfLinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);

         Node temp = middleOfNode2(head);
         traversal(temp);
    }

    //middle of the node
    //Brute Force Approach
    //O(2N) time
    public static Node middleOfNode(Node head){
        if (head == null || head.next == null) {
            return head;
        }
        Node temp = head;
        int count = 0;
        while (temp.next != null){
            count++;
            temp = temp.next;
        }
        int mid = (count/2) + 1;
        temp = head;
        while (temp != null){
            mid = mid - 1;
            if (mid == 0){
                break;
            }
            temp = temp.next;
        }
        return temp;
    }

    //Optimal Approach
    //Tortoise and Hare algorithm - the fast pointer moves 2 steps and the slow pointer moves 1 step
    //O(N/2)
    public static Node middleOfNode2(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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
