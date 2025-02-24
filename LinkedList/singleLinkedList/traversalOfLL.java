package com.takeyouforward.LinkedList.singleLinkedList;

public class traversalOfLL {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        Node head = convertArr2LL(arr);
        traversal(head);
    }

    //traversal of LL
    public static void traversal(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static Node convertArr2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = mover.next;
        }
        return head;
    }
}
