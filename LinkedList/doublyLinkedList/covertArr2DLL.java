package com.takeyouforward.LinkedList.doublyLinkedList;

public class covertArr2DLL {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        Node head = convert(arr);
        Node temp = head;
        traversal(temp);
    }

    public static void traversal(Node temp){
        if (temp == null){
            return;
        }
        System.out.print(temp.data + " ");
        traversal(temp.next);
    }

    public static Node convert(int[] arr){

        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
}
