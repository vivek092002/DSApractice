package com.takeyouforward.LinkedList.singleLinkedList;

public class insertionInLL {
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        Node temp = insertAtKth(head,5,4);
        traversal(temp);
    }

    //traversal
    public static void traversal(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    //insertion in first
    public static Node insertAtFirst(Node head, int val){
        Node temp = new Node(val,head);
        return temp;
    }

    //insert at tail
    public static Node insertAtTail(Node head, int val){
        if (head == null){
            return new Node(val);
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        Node newNode = new Node(val);
        temp.next = newNode;
        return head;
    }

    //insert at the key
    public static Node insertAtKth(Node head, int element, int key){
        if (head == null){
            if (key == 1){
                return new Node(element);
            } else {
                return null;
            }
        }
        if (key == 1){
            Node temp = new Node(element,head);
            return temp;
        }
        int count = 0;
        Node temp = head;
        while (temp != null){
            count++;
            if (count == key-1){
                Node x = new Node(element);
                x.next = temp.next;
                temp.next = x;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

}
