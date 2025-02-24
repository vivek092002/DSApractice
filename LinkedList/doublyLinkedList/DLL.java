package com.takeyouforward.LinkedList.doublyLinkedList;

class Node{

    int data;
    Node next;
    Node back;

    public Node(int data1, Node next1, Node back1){
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    public Node(int data1){
        this.data = data1;
        next = null;
        back = null;
    }

}


public class DLL {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node head2 = new Node(20);
        Node head3 = new Node(30);
        head.next = head2;
        head2.back = head;
        head2.next = head3;
        head3.back = head2;
    }
}
