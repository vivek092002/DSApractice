package com.takeyouforward.LinkedList.singleLinkedList;

public class searchInaLL {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int val = 40;
        Node head = convertArr2LL(arr);
        System.out.println(length(head,val));
    }

    //search int linkedList
    public static int length(Node head, int val){
        Node temp = head;
        while (temp != null){
            if (temp.data == val){
                return 1;
            }
            temp = temp.next;
        }
        return 0;
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
