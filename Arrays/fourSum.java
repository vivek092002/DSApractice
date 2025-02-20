package com.takeyouforward.Arrays;

import java.util.*;

public class fourSum {
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,2};
        int target = 8;
        System.out.println(sum(arr,target));
        System.out.println(sum2(arr,target));
    }

    //brute force Approach
    //O(N^4)
    public static List<List<Integer>> sum(int[] arr, int target){
        Set<List<Integer>> st = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    for (int l = k+1; l < arr.length; l++) {
                        long sum = arr[i] + arr[j];
                        sum += arr[k];
                        sum += arr[l];

                        if (sum == target){
                            List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k],arr[k]);
                            Collections.sort(temp);
                            st.add(temp);
                        }
                    }
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }

    //better solution
    //O(N^3)*O(logM) - using hashset
    public static List<List<Integer>> sum2(int[] arr, int target){
        Set<List<Integer>> st = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                HashSet<Integer> hashSet = new HashSet<>();
                for (int k = j+1; k < arr.length; k++) {
                    int sum = arr[i] + arr[j];
                    sum += arr[k];
                    int fourth = target - sum;
                    if (hashSet.contains(fourth)){
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k], fourth);
                        Collections.sort(temp);
                        st.add(temp);
                    }
                    hashSet.add(fourth);
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }
}
