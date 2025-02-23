package com.takeyouforward.LinkedList;

public class deletionOfLL {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        Node temp = deleteTheElement(head,30);
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

    //deletion of first node
    public static Node deleteFirst(Node head){
        if (head == null){
            return head;
        }
        head = head.next;
        return head;
    }

    //delete last node of LL
    public static Node deleteLast(Node head){
        if (head == null || head.next == null){
            return null;
        }
        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    //delete kth element of the LL
    public static Node deleteKth(Node head, int k){
        if (head == null || head.next == null){
            return null;
        }
        Node temp = head;
        int count = 0;
        Node prev = null;
        while (temp.next != null){
            count++;
            if (count == k){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    //delete when the value is given
    public static Node deleteTheElement(Node head, int val){
        if (head == null || head.next == null){
            return null;
        }
        if (head.data == val){
            Node temp = head;
            head = head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;
        while (temp.next != null){
            if (temp.data == val){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
}
