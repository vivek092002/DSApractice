package com.takeyouforward.Arrays;

import java.util.Arrays;

public class largestElement {
    public static void main(String[] args) {
        int[] arr = {3,6,8,1,99,4,2,56,28,67};

        System.out.println(largest2(arr));

    }

    //brute force
    //sorting the array
    public static int largest(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    //optimal solution
    public static int largest2(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }
}
