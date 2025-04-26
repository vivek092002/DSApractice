package com.takeyouforward.trees;

import java.util.ArrayList;

public class inOrderTraversal {
    public static void main(String[] args) {
        Node tree = new Node(1);
        tree.left = new Node(2);
        tree.right = new Node(3);
        tree.left.left = new Node(4);
        tree.left.right = new Node(5);
        System.out.println(inOrder(tree));

    }

    public static ArrayList<Integer> inOrder(Node node){
        ArrayList<Integer> list = new ArrayList<>();
        traversal(node, list);
        return list;
    }

    public static void traversal(Node node, ArrayList<Integer> list){
        if (node == null){
            return;
        }

        traversal(node.left, list);
        list.add(node.data);
        traversal(node.right, list);
    }
}
