package com.takeyouforward.trees.traversal;

import java.util.ArrayList;

public class preOrderTraversal {
    public static void main(String[] args) {
        Node tree = new Node(1);
        tree.left = new Node(2);
        tree.right = new Node(3);
        tree.left.left = new Node(4);
        tree.left.right = new Node(5);

        System.out.println(inOrder(tree));
    }

    public static ArrayList<Integer> inOrder(Node node){
        ArrayList<Integer> li = new ArrayList<>();
        traversal(node, li);
        return li;
    }

    public static void traversal(Node node, ArrayList<Integer> res){
        if (node == null){
            return;
        }
        res.add(node.data);
        traversal(node.left, res);
        traversal(node.right, res);
    }
}
