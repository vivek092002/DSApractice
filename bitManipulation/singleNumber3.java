package com.takeyouforward.bitManipulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class singleNumber3 {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,2,5};
        System.out.println(Arrays.toString(singleNumber(nums)));
    }


    //O(N) - brute force using hashmap
    public static int[] singleNumber(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if (entry.getValue() == 1){
                list.add(entry.getKey());
            }
        }
        int[] res = new int[list.size()];
        int index = 0;
        for (int x : list){
            res[index++] = x;
        }
        return res;
    }
}
