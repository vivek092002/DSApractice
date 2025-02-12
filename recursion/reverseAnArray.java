package com.takeyouforward.recursion;

import java.util.Scanner;

public class reverseAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        print(arr,n);
        System.out.println();
        reverse(0,arr,n-1);
        print(arr,n);
        sc.close();
    }

    public static void print(int[] arr, int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    //two pointer approach
    public static void reverse(int l, int[] arr, int r){
        if (l>=r){
            return;
        }
        int temp = arr[r];
        arr[r] = arr[l];
        arr[l] = temp;
        reverse(l+1,arr,r-1);
    }

    //single approach
    public static void reverse2(int i, int[] arr, int n){
        if(i >= n/2){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;

        reverse2(i+1,arr,n);
    }
}
