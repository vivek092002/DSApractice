package com.takeyouforward.binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class searchSingleElement {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(",");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        System.out.println(searchElement2(arr));
    }

    //brute force approach
    //using hashmap
    //O(n) and space - O(n)
    public static int searchElement(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for (int it : arr){
            if (!map.containsKey(it)){
                map.put(it,1);
            } else {
                map.put(it, map.get(it)+1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return -1;
    }

    //better approach 2
    //using xor
    public static int searchElement2(int[] arr){
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result ^ arr[i];
        }
        return result;
    }
}
