package com.takeyouforward.LinkedList;

public class insertionInLL {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        Node temp = insertAtTail(head,5);
        traversal(temp);
    }

    //traversal
    public static void traversal(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    //insertion in first
    public static Node insertAtFirst(Node head, int val){
        Node temp = new Node(val,head);
        return temp;
    }

    //insert at tail
    public static Node insertAtTail(Node head, int val){
        if (head == null){
            return new Node(val);
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
        return head;
    }
}
