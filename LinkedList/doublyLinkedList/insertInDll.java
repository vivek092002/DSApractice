package com.takeyouforward.LinkedList.doublyLinkedList;

public class insertInDll {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        int element = 5;
        Node head = convert(arr);
        Node temp = insertAtStart(head,element);
        traversal(temp);
    }

    //insert at start
    public static Node insertAtStart(Node head, int element){
        Node newHead = new Node(element,head,null);
        head.back = newHead;

        return newHead;
    }

    //insert at the last
    public static Node insertBeforeTail(Node head, int element){

        if (head.next == null){
            return insertAtStart(head,element);
        }

        Node tail = head;
        while (tail.next != null){
            tail = tail.next;
        }
        Node prev = tail.back;
        Node newNode = new Node(element,tail,prev);
        prev.next = newNode;
        tail.back = newNode;

        return head;
    }


    public static void traversal(Node temp){
        if (temp == null){
            System.out.print("null");
            return;
        }
        System.out.print(temp.data + "<->");
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
