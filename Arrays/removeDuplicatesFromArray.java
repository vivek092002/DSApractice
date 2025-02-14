package com.takeyouforward.Arrays;

import java.util.HashMap;
import java.util.HashSet;

public class removeDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3};
        System.out.println(optimisedArray(arr));
        System.out.println(optimisedArray2(arr));
    }

    //brute force approach
    //O(NLogN + N)
    public static int optimisedArray(int[] arr){
        HashSet<Integer> st = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            st.add(arr[i]);                     //O(NLogN)
        }

        int index = 0;
        for(int it : st){                       //O(N)
            arr[index] = it;
            index++;
        }

        return index;
    }

    //optimal approach - 2 pointer approach
    //O(N)
    public static int optimisedArray2(int[] arr){
        int i=0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return (i+1);
    }
}
