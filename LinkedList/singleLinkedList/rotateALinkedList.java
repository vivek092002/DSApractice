package com.takeyouforward.LinkedList.singleLinkedList;

public class rotateALinkedList {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);
        int k = 2;

        Node temp = rotateRight(head,k);
        traversal(temp);
    }

    public static void traversal(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    //optimal approach

    public static Node findKthNode(Node temp , int k){
        int count = 1;
        while (temp != null){
            if (count == k){
                return temp;
            }
            count++;
            temp = temp.next;
        }
        return temp;
    }


    public static Node rotateRight(Node head, int k){
        if (head == null || head.next == null || k == 0){
            return head;
        }
        Node tail = head;
        int len = 1;
        while (tail.next != null){
            len++;
            tail = tail.next;
        }

        if (k % len == 0){
            return head;
        }
        k = k % len;
        tail.next = head;

        //2step
        Node newNode = findKthNode(head, len-k);
        head = newNode.next;
        newNode.next = null;

        return head;
    }
}
