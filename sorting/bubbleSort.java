package com.takeyouforward.sorting;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        int n = arr.length;
        print(arr,n);
        sort(arr,n);
        System.out.println("After Sorting");
        print(arr,n);
    }

    public static void print(int[] arr, int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //O(N^2)
    public static void sort(int[] arr, int n){
        for (int i = n-1; i >= 0 ; i--) {
            int didswap = 0;
            for (int j = 0; j <= i-1 ; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    didswap = 1;
                }
            }
            if (didswap == 0){
                break;
            }
        }
    }
}
