package com.takeyouforward.trees.traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class levelOrderTraversal2 {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println(printLevelOrder2(root));

    }

    public static ArrayList<ArrayList<Integer>> printLevelOrder2(Node root){
        Queue<Node> qu = new LinkedList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if (root == null){
            return ans;
        }
        qu.add(root);
        while (!qu.isEmpty()){
            int size = qu.size();
            ArrayList<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                Node curr = qu.poll();
                level.add(curr.data);

                if (curr.left != null){
                    qu.add(curr.left);
                }
                if (curr.right != null){
                    qu.add(curr.right);
                }
            }
            ans.add(level);
        }
        return ans;
    }
}
