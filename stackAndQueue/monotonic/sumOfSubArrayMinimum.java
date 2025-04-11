package com.takeyouforward.stackAndQueue.monotonic;

public class sumOfSubArrayMinimum {

    public static int minimum(int[] arr){
        int mod = (int) (1e9 + 7);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int mini = arr[i];
            for (int j = i; j < arr.length; j++) {
                mini = Math.min(mini, arr[j]);
                sum = (sum + mini) % mod;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,2,4};
        System.out.println(minimum(arr));
    }
}
