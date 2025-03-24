package com.takeyouforward.sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class selectionSort2 {

    public static void print(int[] arr, int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void sortSelection(int[] arr, int n){
        for (int i = 0; i < n-1; i++) {
            int smallestIdx = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[smallestIdx]){
                    smallestIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallestIdx];
            arr[smallestIdx] = temp;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        print(arr,n);
        sortSelection(arr,n);
        System.out.println("After Sorting");
        print(arr,n);
    }
}
