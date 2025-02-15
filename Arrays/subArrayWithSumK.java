//https://leetcode.com/problems/subarray-sum-equals-k/description/
package com.takeyouforward.Arrays;

public class subArrayWithSumK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,1,4,2,3};
        int k = 3;
        System.out.println(getSubArray(arr,k));
    }

    //brute force approach
    //O(N^2)
    public static int getSubArray(int[] arr, int s){
        int n = arr.length;
        int len = 0;
        for (int i = 0; i < n; i++) {       //O(N)
            int sum = 0;
            for (int j = i; j < n; j++) {       //O(N)
                sum += arr[j];
                if (sum == s){
                    len = Math.max(len, j-i+1);
                }
            }
        }
        return len;
    }

    //better approach
    public static int getSubArray2(int[] a, int k){
        int n = a.length; // size of the array.

        int left = 0, right = 0; // 2 pointers
        long sum = a[0];
        int maxLen = 0;
        while (right < n) {
            // if sum > k, reduce the subarray from left
            // until sum becomes less or equal to k:
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }

            // if sum = k, update the maxLen i.e. answer:
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Move forward thw right pointer:
            right++;
            if (right < n) sum += a[right];
        }

        return maxLen;
    }
}
