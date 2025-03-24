package com.takeyouforward.sorting;

public class selectionSort {
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

    //sorting
    public static void sort(int[] arr, int n){
        for (int i = 0; i <= n-2; i++) {
            int min = i;            //unsorted part starting
            for (int j = i; j <= n-1; j++) {
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
