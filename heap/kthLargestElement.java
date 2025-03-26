package com.takeyouforward.heap;

//uses a min for kth largest

import java.util.PriorityQueue;
import java.util.Queue;

public class kthLargestElement {

    public static int returnKthLargest(int[] arr, int k){
        Queue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            minHeap.add(arr[i]);
        }
        for (int i = k ; i < arr.length; i++) {
            if (arr[i] > minHeap.peek()){
                minHeap.poll();
                minHeap.add(arr[i]);
            }
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(returnKthLargest(nums,k));
    }
}
