package com.takeyouforward.Arrays;

import java.util.Arrays;

public class rearrangeArrayBySign {
    public static void main(String[] args) {
         int[] arr = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrange(arr)));
    }

    //brute force approach
    //O(2N) and space - O(N)
    public static int[] rearrange(int[] arr){
        int[] pos = new int[arr.length/2];
        int[] neg = new int[arr.length/2];
        int a = 0, b = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0){
                pos[a++] = arr[i];
            } else {
                neg[b++] = arr[i];
            }
        }
        for (int i = 0; i < arr.length/2; i++) {
            arr[2*i] = pos[i];
            arr[2*i+1] = neg[i];
        }

        return arr;
    }

    //optimal solution - one pass
    //O(N)
    public static int[] rearrange2(int[] arr){
        int[] arr2 = new int[arr.length];
        int posIndex = 0, negIndex = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0){
                arr2[negIndex] = arr[i];
                negIndex += 2;
            } else {
                arr2[posIndex] = arr[i];
                posIndex += 2;
            }
        }
        return arr2;
    }
}
