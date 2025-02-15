package com.takeyouforward.Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class unionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5,6};

        System.out.println(Arrays.toString(union(arr,arr2)));
        
    }

    //brute force - using hashset for unique elements
    public static int[] union(int[] arr, int[] arr2){
        HashSet<Integer> st = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            st.add(arr[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            st.add(arr2[i]);
        }
        int[] union = new int[st.size()];
        int i = 0;
        for (int it : st){
            union[i] = it;
            i++;
        }
        return union;
    }

}
