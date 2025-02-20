package com.takeyouforward.Arrays;

public class subArrayWithGivenXor {
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 6, 4};
        int k = 6;
        System.out.println(subArrayWithXor(arr,k));
        System.out.println(subArrayWithXor2(arr,k));
    }

    //brute force approach
    //O(N^3)
    public static int subArrayWithXor(int[] arr, int k){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int xor = 0;
                for (int l = i; l <= j; l++) {
                    xor = xor ^ arr[l];
                }
                if (xor == k){
                    count++;
                }
            }
        }
        return count;
    }

    //better approach
    //O(N^2)
    public static int subArrayWithXor2(int[] arr, int k){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int xor = 0;
            for (int j = i; j < arr.length; j++) {
                xor = xor ^ arr[j];
                if (xor == k){
                    count++;
                }
            }
        }
        return count;
    }
}
