//https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1?track=DSASP-Searching&amp%253BbatchId=154&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=floor-in-a-sorted-array
package com.takeyouforward.binarySearch;

public class lowerBound {
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};
        int x = 9;
        System.out.println(LB2(arr,x));
    }

    //brute force approach
    //O(N)
    public static int LB(int[] arr, int x){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= x){
                return arr[i];
            }
        }
        return arr.length;
    }

    //Optimal approach
    //O(Log2N)
    public static int LB2(int[] arr, int x){
        int low = 0;
        int high = arr.length-1;
        int ans = arr.length;
        while (low<=high){
            int mid = (low + high) / 2;
            if (arr[mid] >= x){
                ans = mid;
                high = mid - 1;
            } else {
                low  = mid + 1;
            }
        }
        return ans;
    }
}
