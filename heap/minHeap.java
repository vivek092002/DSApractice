package com.takeyouforward.heap;

import java.util.Arrays;

class minHeapAlgo {
    int[] arr;
    int size;
    int capacity;

    minHeapAlgo(int c){
        arr = new int[c];
        size = 0;
        capacity = c;
    }

    int left(int i){
        return (2*i + 1);
    }
    int right(int i){
        return (2*i + 2);
    }
    int parent(int i){
        return (i-1)/2;
    }

    public void insert(int value){
        if (size == capacity){
            return;
        }
        arr[size] = value;
        int current = size;
        size++;

        // Heapify-up (bubble-up)
        while (current > 0 && arr[current] < arr[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    private void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void print(){
        System.out.println(Arrays.toString(arr));
    }
}

public class minHeap {
    public static void main(String[] args) {
        minHeapAlgo minheap = new minHeapAlgo(10);
        minheap.insert(10);
        minheap.insert(20);
        minheap.insert(5);
        minheap.insert(3);
        minheap.insert(8);

        minheap.print();
    }
}
