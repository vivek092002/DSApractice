//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
package com.takeyouforward.binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class firstAndLastPosition {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("\\s+");
        int target = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        System.out.println(Arrays.toString(searchRange(arr,target)));
        System.out.println(Arrays.toString(searchRange2(arr,target)));
    }

    //naive approach
    //O(N) approach
    public static int[] searchRange(int[] arr, int target){
        int first = -1;
        int last = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                if (first == -1){
                    first = i;
                }
                last = i;
            }
        }
        return new int[]{first,last};
    }

    //optimal approach
    //using binary search
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

    public static int[] searchRange2(int[] arr, int target){
        int first = firstOccurrence(arr,arr.length,target);
        int last = lastOccurrence(arr,arr.length,target);

        return new int[] {first, last};
    }
}
