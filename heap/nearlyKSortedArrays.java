//we uses mean heap as the resultant arrays is in ascending order of sorting

//Algorithms
//Use a Min-Heap (PriorityQueue) to maintain a sliding window of size k.
//We insert elements into the heap as we iterate over the array.
//Since the array is nearly sorted, the minimum element will always be within the first k+1 elements at any point.
//Extract the smallest element from the heap whenever its size exceeds k.
//This ensures that the correct elements are placed in the result array in the right order.
//After processing all elements, empty the remaining heap.
//This ensures that the final elements get placed correctly.

package com.takeyouforward.heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class nearlyKSortedArrays {

    public static void nearlySorted(int[] arr, int k){
        if (arr == null || arr.length == 0) return;
        int idx = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            minHeap.add(arr[i]);
            if (minHeap.size() > k){
                arr[idx++] = minHeap.poll();
            }
        }
        while (!minHeap.isEmpty()){
            arr[idx++] = minHeap.poll();
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 2, 8, 10, 9};
        int k = 3;
        nearlySorted(arr,k);
        System.out.println(Arrays.toString(arr));
    }
}
