package com.takeyouforward.heap;

public class doesAMaxHeap {

    public static boolean checkMaxHeap(int[] arr, int n){
        for (int i = 0; i < n; i++) {
            if (arr[i] < arr[2*i + 1] || arr[i] < arr[2*i + 2]){
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
