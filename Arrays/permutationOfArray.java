package com.takeyouforward.Arrays;

import java.util.ArrayList;

public class permutationOfArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(printPermutation(arr));
    }

    public static ArrayList<int[]> printPermutation(int[] arr){
        ArrayList<int[]> ans = new ArrayList<>();
        permute(arr,0,ans);
        return ans;
    }

    static void permute(int[] arr, int index, ArrayList<int[]> ans){

        //base case
        if (index == arr.length){
            ans.add(arr);
            return;
        }

        for (int i = index; i < arr.length; i++) {
            swap(arr[index], arr[i]);
            permute(arr,index,ans);
            swap(arr[index], arr[i]);
        }
    }


    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
