package com.takeyouforward.binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class peakElement {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(",");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        System.out.println(peakEle(arr));
    }

    public static int peakEle(int[] arr){
        int n = arr.length;
        if (n==1){
            return 0;
        }
        if (arr[0] > arr[1]){
            return 0;
        }
        if (arr[n-1] > arr[n-2]){
            return n-1;
        }

        int low = 1, high = n-2;
        while (low <= high){
            int mid = (low + high)/2;
            if (arr[mid] > arr[mid-1]  && arr[mid] > arr[mid+1]){
                return mid;
            } else if (arr[mid] > arr[mid-1]){
                low = mid + 1;
            } else if (arr[mid] > arr[mid+1]){
                high = mid - 1;
            }
        }
        return 0;
    }
}
