package com.takeyouforward.trees.traversal;

import java.util.ArrayList;

public class postOrderTraversal {
    public static void main(String[] args) {
        Node tree = new Node(1);
        tree.left = new Node(2);
        tree.right = new Node(3);
        tree.left.left = new Node(4);
        tree.left.right = new Node(5);

        System.out.println(postOrder(tree));
    }

    public static ArrayList<Integer> postOrder(Node node){
        ArrayList<Integer> list = new ArrayList<>();
        traversal(node, list);
        return list;
    }

    public static void traversal(Node node, ArrayList<Integer> list){
        if (node == null){
            return;
        }

        traversal(node.left, list);
        traversal(node.right, list);
        list.add(node.data);
    }
}
