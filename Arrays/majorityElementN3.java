package com.takeyouforward.Arrays;

import java.util.ArrayList;
import java.util.List;

public class majorityElementN3 {
    public static void main(String[] args) {
        int[] arr = {11, 33, 33, 11, 33, 11};
        System.out.println(majority(arr));
    }

    //brute force approach
    public static List<Integer> majority(int[] arr){
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (ans.size()==0 || ans.get(0) != arr[i]){
                int count = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]){
                        count++;
                    }
                }
                if (count > arr.length/3){
                    ans.add(arr[i]);
                }
            }
            if (ans.size()==2){
                break;
            }
        }
        return ans;
    }
}
