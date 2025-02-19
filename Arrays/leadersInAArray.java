package com.takeyouforward.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class leadersInAArray {
    public static void main(String[] args) {
        int[] arr = {10,22,12,3,0,6};
        System.out.println((leaders(arr)));
    }


    //brute force approach
    //O(N^2) and space - O(N)
    public static ArrayList<Integer> leaders(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {                      //O(N)
            boolean leader = true;
            for (int j = i+1; j < arr.length; j++) {                //O(N)
                if (arr[j] > arr[i]){
                    leader = false;
                    break;
                }
            }
            if (leader){
                ans.add(arr[i]);
            }
        }
        return ans;
    }


    //Optimal Solution
    //O(N) ans O(1)
    public static ArrayList<Integer> leaders2(int[] arr){
        ArrayList<Integer> ans = new ArrayList<>();
        int maxi = Integer.MIN_VALUE;
        for (int i = arr.length-1; i >= 0 ; i--) {
            if (arr[i] > maxi){
                ans.add(arr[i]);
            }
            maxi = Math.max(maxi, arr[i]);
        }
        //O(NlogN) for worst time
        Collections.sort(ans);
        return ans;
    }
}
