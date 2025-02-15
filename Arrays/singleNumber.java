//https://leetcode.com/problems/single-number/
package com.takeyouforward.Arrays;

import java.util.HashSet;

public class singleNumber {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4};
        System.out.println(appearedOnce2(arr));
    }

    //brute force approach
    //O(N^2) and space - O(1)
    public static int appearedOnce(int[] arr){
        for (int i = 0; i < arr.length; i++) {          //O(N)
            int temp = arr[i];
            int count = 0;
            for (int j = 0; j < arr.length; j++) {      //O(N)
                if (temp == arr[j]){
                    count++;
                }
            }
            if (count == 1){
                return i;
            }
        }
        return -1;
    }
    
    //better approach
    //O(2N)
    public static int appearedOnce2(int[] arr){
        //size of array
        int n = arr.length;

        //find max element
        int maxi = arr[0];
        for (int i = 0; i < n; i++) {
            maxi = Math.max(maxi, arr[i]);
        }
        // Declare hash array of size maxi+1
        // And hash the given array:
        int[] hash = new int[maxi+1];
        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        for (int i = 0; i < n; i++) {
            if (hash[arr[i]] == 1){
                return arr[i];
            }
        }
        return -1;
    }

    //Optimal Solution
    public static int appearedOnce3(int[] arr){
        int n = arr.length;
        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor = xor ^ arr[i];
        }
        return xor;
    }
}
