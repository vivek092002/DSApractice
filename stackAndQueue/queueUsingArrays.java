package com.takeyouforward.stackAndQueue;

class Queue{
    int size = 10;
    int[] arr = new int[size];
    int currSize = 0;
    int start = -1;
    int end = -1;

    void push(int x){
        if (currSize == size){
            System.out.println("Over flow");
            System.exit(1);
        }
        if (currSize == 0){
            start = 0; end = 0;
        } else {
            end = (end + 1) % size;
        }
        arr[end] = x;
        currSize += 1;
    }

    int pop(){
        if (start == -1) {
            System.out.println("Queue Empty\nExiting...");
            System.exit(1);
        }
        int popped = arr[start];
        if (currSize == 1) {
            start = -1;
            end = -1;
        } else
            start = (start + 1) % size;

        currSize--;
        return popped;
    }

    public int top() {
        if (start == -1) {
            System.out.println("Queue is Empty");
            System.exit(1);
        }
        return arr[start];
    }
    public int size() {
        return currSize;
    }
}

public class queueUsingArrays {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.push(4);
        q.push(14);
        q.push(24);
        q.push(34);
        System.out.println("The peek of the queue before deleting any element " + q.top());
        System.out.println("The size of the queue before deletion " + q.size());
        System.out.println("The first element to be deleted " + q.pop());
        System.out.println("The peek of the queue after deleting an element " + q.top());
        System.out.println("The size of the queue after deleting an element " + q.size());
    }
}
