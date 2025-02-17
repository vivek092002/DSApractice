package com.takeyouforward.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class twoSum {
    public static void main(String[] args) {
        int[] arr = {2,6,5,8,11};
        int target = 14;
        System.out.println(Arrays.toString(sum2(arr, target)));
    }

    //brute force approach
    //O(N^2)
    public static int[] sum(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {              //O(N)
            for (int j = i+1; j < arr.length; j++) {        //O(N)
                if (arr[i] + arr[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {-1, -1};
    }

    //optimal approach - using hashing map
    //O(N)
    public static int[] sum2(int[] arr, int target){

        HashMap<Integer, Integer> nmap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int temp = target - arr[i];
            if ( nmap.containsKey(temp) ){
                return new int[] {nmap.get(temp), i};
            }
            nmap.put(arr[i], i);
        }
        return new int[] {-1,-1};
    }
}
