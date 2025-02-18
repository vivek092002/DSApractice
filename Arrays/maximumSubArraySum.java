package com.takeyouforward.Arrays;

public class maximumSubArraySum {
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println(maxSum3(arr));
    }


    //brute force solution
    //O(N^3)
    public static int maxSum(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {              //O(N)
            for (int j = i; j < arr.length; j++) {             //O(N)
                int sum = 0;
                for (int k = i; k < j; k++) {               //O(N)
                    sum += arr[k];
                    max = Math.max(sum,max);
                }
            }
        }
        return max;
    }

    //better approach
    //O(N^2)
    public static int maxSum2(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {              //O(N)
            int sum = 0;
            for (int j = i; j < arr.length; j++) {             //O(N)
                sum += arr[j];
                max = Math.max(max,sum);
            }
        }
        return max;
    }

    //Optimal Approach
    //O(N)
    public static int maxSum3(int[] arr){
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {                  //O(N)
            sum += arr[i];
            if (sum > maxi){
                maxi = sum;
            }
            if (sum < 0){
                sum = 0;
            }
        }
        return maxi;
    }
}
