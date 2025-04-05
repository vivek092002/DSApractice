package com.takeyouforward.binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class numberOfOccurrence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(",");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        int target = Integer.parseInt(br.readLine());
        System.out.println(countOccurrence(arr,target));
    }

    //optimal approach
    //find the fist occurrence and last occurrence and subtract them and add one
    //first occurrence
    public static int firstOccurrence(int[] arr, int n, int target){
        int low = 0;
        int high = n-1;
        int first = -1;
        while (low <= high){
            int mid = (low + high) /2;
            if (arr[mid] == target){
                first = mid;
                high = mid - 1;
            } else if (arr[mid] < target){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return first;
    }

    //last occurrence
    public static int lastOccurrence(int[] arr, int n, int target){
        int low = 0;
        int high = n - 1;
        int last = -1;
        while (low <= high){
            int mid = (low + high) / 2;
            if (arr[mid] == target){
                last = mid;
                low = mid + 1;
            } else if (arr[mid] < target){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return last;
    }

    public static int countOccurrence(int[] arr, int target){
        int first = firstOccurrence(arr,arr.length,target);
        int last = lastOccurrence(arr,arr.length,target);
        if (first == -1){
            return 0;
        }
        return last - first + 1;
    }
}
