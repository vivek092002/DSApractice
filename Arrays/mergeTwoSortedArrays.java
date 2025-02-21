package com.takeyouforward.Arrays;

import java.util.Arrays;
import java.util.Collections;

public class mergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr = {1, 4, 8, 10};
        int[] arr2 = {2, 3, 9};
        int n = arr.length;
        int m = arr2.length;
        merge(arr,n,arr2,m);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }

    //brute force solution
    //O(N+M)+O(N+M) ans space - O(N+M)
    public static void sort(int[] arr, int n, int[] arr2, int m){
        int[] arr3 = new int[n+m];
        int left = 0;
        int right = 0;
        int index = 0;
        //merge till n==m
        while (left < n && right < m){
            if (arr[left] <= arr2[right]){
                arr3[index] = arr[left];
                index++;
                left++;
            } else {
                arr3[index] = arr2[right];
                index++;
                right++;
            }
        }
        while (left<n){
            arr3[index] = arr[left];
            index++;
            left++;
        }
        while (right<m){
            arr3[index] = arr2[right];
            index++;
            right++;
        }

        for (int i = 0; i < n+m; i++) {
            if (i<n){
                arr[i] = arr3[i];
            } else {
                arr2[i-n] = arr3[i];
            }
        }
    }

    //optimal approach
    //uses two pointer approach where one pointer points to last of first array and second pointer points to first of
    //second array. first pointer moves backward and second pointer moves forward
    public static void merge(int[] arr, int n, int[] arr2, int m){
        int left = n-1;
        int right = 0;
        while (left >= 0 && right <= m-1){
            if (arr[left] > arr2[right]){
                int temp = arr[left];
                arr[left] = arr2[right];
                arr2[right] = temp;
                left--;
                right++;
            } else {
                break;
            }
        }
        Arrays.sort(arr);
        Arrays.sort(arr2);
    }
}
