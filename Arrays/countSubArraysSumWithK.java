package com.takeyouforward.Arrays;

public class countSubArraysSumWithK {
    public static void main(String[] args) {
        int[] arr = {1,2,3,-3,1,1,1,4,2,-3};
        int k = 3;

        System.out.println(countSubArrays(arr,k));

    }

    //brute force solution
    //generate all subArrays
    //O(N^3)
    public static int countSubArrays(int[] arr, int k){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int l = i; l <= j; l++) {
                    sum = sum + arr[l];
                }
                if (sum == k){
                    count++;
                }
            }
        }
        return count;
    }
}
