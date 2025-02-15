package com.takeyouforward.Arrays;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {6,7,8,4,1};
        int num = 4;
        System.out.println(search(arr,num));
    }

    //brute force approach
    //O(N)
    public static int search(int[] arr, int num){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num){
                return i;
            }
        }

        return -1;
    }
}
