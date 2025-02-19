package com.takeyouforward.Arrays;

import java.util.HashSet;

public class longestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(sequence2(arr));
    }

    //brute force solution
    //O(N^2)
    public static int sequence(int[] arr){
        int longest = 1;
        for (int i = 0; i < arr.length; i++) {          //O(N)
            int x = arr[i];
            int count = 1;
            while (linearSearch(arr, x + 1)){
                x = x+1;
                count++;
            }
            longest = Math.max(longest,count);
        }
        return longest;
    }

    private static boolean linearSearch(int[] arr, int x){
        for (int j : arr) {             //O(N)
            if (j == x) {
                return true;
            }
        }
        return false;
    }

    //Optimal Solution
    public static int sequence2(int[] arr){
        int n = arr.length;
        int longest = 1;
        if (n==0){
            return 0;
        }
        HashSet<Integer> st = new HashSet<>();
        for (int i = 0; i < n; i++) {
            st.add(arr[i]);
        }
        //iterating to find x-1
        for (int i : st){

            if (!st.contains(i-1)){
                int count = 1;
                int x = i;
                while (st.contains(x+1)){
                    x = x + 1;
                    count = count + 1;
                }
                longest = Math.max(count,longest);
            }
        }
        return longest;
    }
}
