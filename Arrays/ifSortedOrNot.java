package com.takeyouforward.Arrays;

public class ifSortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,4};
        System.out.println(sorted(arr));
    }

    public static boolean sorted(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[i-1]){

            } else {
                return false;
            }
        }
        return true;
    }
}
