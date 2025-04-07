package com.takeyouforward.binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class searchInRotatedSorted {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(",");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        int x = Integer.parseInt(br.readLine());
        System.out.println(search2(arr,x));
    }

    //Brute Force Approach
    //linear search
    public static int search(int[] arr, int x){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x){
                return i;
            }
        }
        return -1;
    }

    //optimal approach
    //using binary search
    public static int search2(int[] arr, int x){
        int low = 0, high = arr.length-1;
        while (low <= high){
            int mid = (low + high) / 2;
            if (arr[mid] == x){
                return mid;
            }
            //check for the left half is sorted
            if (arr[low] <= arr[mid]){
                if (arr[low] <= x  &&  x<= arr[mid]){
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                //check for right half is sorted
                if (arr[mid]<=x  &&  x<=arr[high]){
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
