package com.takeyouforward.LinkedList;

class Node{
    int data;
    Node next;

    //constructor of Node
    public Node(int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }

    //constructor
    public Node(int data1){
        this.data = data1;
        this.next = null;
    }
}

public class LL {
    public static void main(String[] args) {
        Node node = new Node(10);
        node.next = new Node(20);
        node.next.next = new Node(30);

        System.out.println(node.next.next.data);
    }
}
