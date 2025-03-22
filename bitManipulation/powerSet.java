package com.takeyouforward.bitManipulation;

import java.util.ArrayList;
import java.util.List;

public class powerSet {

    public static List<List<Integer>> powerSubSets(int[] nums){
        int n = nums.length;
        int subset = 1 << n;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i <= subset-1; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if (checkBit(i,j)){
                    list.add(nums[j]);
                }
            }
            ans.add(list);
        }
        return ans;
    }

    private static boolean checkBit(int i, int j){
        return ((i>>j) & 1) == 1;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(powerSubSets(nums));
    }
}
