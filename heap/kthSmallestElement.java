package com.takeyouforward.heap;

import java.util.Collections;
import java.util.PriorityQueue;

//uses a max heap for kth smallest
public class kthSmallestElement {

    public static int returnKthSmallest(int[] arr, int k){
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < k; i++) {
            maxHeap.add(arr[i]);
        }
        for (int i = k; i < arr.length; i++) {
            if (arr[i] < maxHeap.peek()){
                maxHeap.poll();
                maxHeap.add(arr[i]);
            }
        }
        return maxHeap.peek();
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 4;
        System.out.println(returnKthSmallest(arr,k));
    }
}
