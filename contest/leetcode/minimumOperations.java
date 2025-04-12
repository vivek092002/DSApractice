package com.takeyouforward.contest.leetcode;

public class minimumOperations {
    public static void main(String[] args) {
        int[] arr = {3,9,7};
        int k = 5;
        System.out.println(minOperations(arr,k));
    }

    public static int minOperations(int[] arr, int k){
        int sum = 0;
        for (int it : arr){
            sum += it;
        }

        if (sum % k == 0){
            return 0;
        } else {
            return sum % k;
        }
    }
}
