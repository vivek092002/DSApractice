package com.takeyouforward.Arrays;

import java.util.*;

public class threeSum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,4};
        System.out.println(sum(arr));
        System.out.println(triplet(arr));
    }

    //brute force approach
    //using three pointer approach
    //O(N^3)
    public static List<List<Integer>> sum(int[] arr){
        Set<List<Integer>> st = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0){
                        List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k]);
                        Collections.sort(temp);
                        st.add(temp);
                    }
                }
            }
        }
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }

    //better approach - using triplet
    //O(N^2)
    public static List<List<Integer>> triplet(int[] arr){
        Set<List<Integer>> st = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            HashSet<Integer> hashSet = new HashSet<>();
            for (int j = i+1; j < arr.length; j++) {
                int third = -(arr[i] + arr[j]);
                if (hashSet.contains(third)){
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
                    Collections.sort(temp);
                    st.add(temp);
                }
                hashSet.add(arr[j]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }


    //optimal approach
    //O(N)
    public static List<List<Integer>> triplet2(int[] arr){
        int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            //remove duplicates:
            if (i != 0 && arr[i] == arr[i - 1]) continue;

            //moving 2 pointers:
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    //skip the duplicates:
                    while (j < k && arr[j] == arr[j - 1]) j++;
                    while (j < k && arr[k] == arr[k + 1]) k--;
                }
            }
        }

        return ans;
    }
}
