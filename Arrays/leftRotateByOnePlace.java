package com.takeyouforward.Arrays;

public class leftRotateByOnePlace {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        print(arr);
        leftRotate(arr);
        print(arr);
    }

    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //optimal approach
    //O(N) and O(1)
    public static void leftRotate(int[] arr){
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;
    }
}
