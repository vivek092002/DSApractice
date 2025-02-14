package com.takeyouforward.Arrays;

public class rightRotateByDPlaces {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int d = 3;
        print(arr);
        rightRotate(arr,d);
        print(arr);
    }
    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //Optimal Approach
    public static void rightRotate(int[] arr, int d){

        if (arr.length==0){
            return;
        }
        d = d % arr.length;

        reverse(arr, 0, arr.length-1-d);
        reverse(arr,arr.length-d, arr.length-1);
        reverse(arr, 0 , arr.length-1);
    }
    public static void reverse(int[] arr, int start, int end){
        while (start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
