package com.takeyouforward.Arrays;

public class maxProductSubArray {
    public static void main(String[] args) {
        int[] arr = {1,2,-3,0,-4,-5};
        System.out.println(product2(arr));
    }

    //brute force solution
    //O(N^3)
    public static int product(int[] arr){
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr[k];
                }
                result = Math.max(result,prod);
            }
        }
        return result;
    }

    //optimal approach
    //O(N)
    public static int product2(int[] arr){
        int n = arr.length; //size of array.

        int pre = 1, suff = 1;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (pre == 0) pre = 1;
            if (suff == 0) suff = 1;
            pre *= arr[i];
            suff *= arr[n - i - 1];
            ans = Math.max(ans, Math.max(pre, suff));
        }
        return ans;
    }
}
