package com.takeyouforward.Arrays;

public class leftRotateByDPlaces {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int d = 3;
        print(arr);
        leftRotate2(arr,d);
        print(arr);
    }

    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //brute force
    //O(N+d) and space-O(d)
    public static void leftRotate(int[] arr, int d){
        //storing first d elements
        d = d % arr.length;
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for (int i = d; i < arr.length; i++) {
            arr[i-d] = arr[i];
        }
        //putting back elements
        int j = 0;
        for (int i = arr.length-d ; i < arr.length; i++) {
            arr[i] = temp[j];
            j++;
        }
    }

    //Optimal Approach
    public static void leftRotate2(int[] arr, int d){
        d = d % arr.length;
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);
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
