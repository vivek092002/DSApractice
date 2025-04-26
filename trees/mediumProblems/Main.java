package com.takeyouforward.trees.mediumProblems;

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Main {
    public static void main(String[] args) {
        Node node = new Node(10);
    }
}
