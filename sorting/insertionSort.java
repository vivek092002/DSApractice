package com.takeyouforward.sorting;

public class insertionSort {
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
    public static void sort(int[] arr, int n){
        for (int i = 0; i <= n-1 ; i++) {
            int j = i;
            while(j>0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;

                j--;
            }
        }
    }
}
