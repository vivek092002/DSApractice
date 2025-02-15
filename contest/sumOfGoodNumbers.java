package com.takeyouforward.contest;

import java.util.ArrayList;
import java.util.Arrays;

public class sumOfGoodNumbers {
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,5,4};
        int k = 2;
        System.out.println(sumGood(arr,k));
    }

    public static int sumGood(int[] arr, int k){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean isGood = true;
            if (i-k >= 0 && arr[i] <= arr[i-k] ){
                isGood = false;
            }
            if (i+k < arr.length && arr[i] <= arr[i+k]){
                isGood = false;
            }

            if (isGood){
                sum += arr[i];
            }
        }
        return  sum;
    }
}
