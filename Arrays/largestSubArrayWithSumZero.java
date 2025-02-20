package com.takeyouforward.Arrays;

public class largestSubArrayWithSumZero {
    public static void main(String[] args) {
        int[] arr = {9, -3, 3, -1, 6, -5};
        System.out.println(maxLen(arr));
    }
    
    //brute force approach - traverse through all SubArray
    public static int maxLen(int[] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == 0){
                    max = Math.max(max, j-i+1);
                }
            }
        }
        return max;
    }
}
