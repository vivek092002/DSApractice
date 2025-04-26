package com.takeyouforward.trees.traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class levelOrderTraversal {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(printLevelOrder(root));

    }
    public static ArrayList<Integer> printLevelOrder(Node node){
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Node> qu = new LinkedList<>();
        if (node == null){
            return null;
        }
        qu.offer(node);
        while (!qu.isEmpty()){
            Node curr = qu.poll();
            list.add(curr.data);
            if (curr.left != null){
                qu.offer(curr.left);
            }
            if (curr.right != null){
                qu.offer(curr.right);
            }
        }

        return list;
    }
}
