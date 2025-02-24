package com.takeyouforward.LinkedList.doublyLinkedList;

public class deleteInDll {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        Node head = convert(arr);
        Node temp = deleteTail(head);
        traversal(temp);

    }

    //delete head
    public static Node deleteHead(Node head){
        if (head == null || head.next == null){
            return null;
        }

        Node prev = head;
        head = head.next;
        head.back = null;
        prev.next = null;

        return head;
    }

    //delete tail
    public static Node deleteTail(Node head){
        if (head == null || head.next == null){
            return null;
        }
        Node tail = head;
        while (tail.next != null){
            tail = tail.next;
        }
        Node newNode = tail.back;
        tail.back.next = null;
        tail.back = null;


        return head;
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
