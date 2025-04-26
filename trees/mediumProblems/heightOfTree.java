package com.takeyouforward.trees.mediumProblems;

public class heightOfTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.right = new Node(6);
        root.left.right.right.right = new Node(7);

        System.out.println(maxDepth(root));
    }

    public static int maxDepth(Node root){
        if (root == null){
            return -1;
        }

        int lt = maxDepth(root.left);
        int rt = maxDepth(root.right);

        return 1 + Math.max(lt, rt);
    }
}
