package com.takeyouforward.heap;

public class doesAMaxHeap {

    public static boolean checkMaxHeap(int[] arr, int n){
        for (int i = 0; i < n / 2; i++) {  // Only check internal nodes
            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if (left < n && arr[i] < arr[left]) {  // Check left child
                return false;
            }
            if (right < n && arr[i] < arr[right]) { // Check right child
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {90, 15, 10, 7, 12, 2};
        int n = arr.length;
        System.out.println(checkMaxHeap(arr,n));
    }
}
