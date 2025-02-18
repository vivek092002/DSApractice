package com.takeyouforward.Arrays;

import java.util.HashMap;
import java.util.Map;

public class majorityElement {
    public static void main(String[] args) {
        int[] arr = {2,2,3,3,1,2,2};

        System.out.println(majEle3(arr));
    }

    //brute force approach
    //O(N^2)
    public static int majEle(int[] arr){
        for (int i = 0; i < arr.length; i++) {          //O(N)
            int count = 0;
            for (int j = 0; j < arr.length; j++) {      //O(N )
                if (arr[j] == arr[i]){
                    count++;
                }
            }
            if (count > arr.length/2){
                return arr[i];
            }
        }
        return -1;
    }

    //better approach - using hashmap for storing the frequency
    //O(NlogN)
    public static int majEle2(int[] arr){
        int n = arr.length;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i], value+1);
        }
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() > (n / 2)) {
                return it.getKey();
            }
        }
        return -1;
    }

    //optimal approach
    //O(N)
    public static int majEle3(int[] arr){

        int count = 0;
        int element = 0;

        for (int i = 0; i < arr.length; i++) {                  //O(N)
            if (count == 0){
                count = 1;
                element = arr[i];
            } else if (arr[i] == element) {
                count++;
            } else {
                count--;
            }
        }

        int count1 = 0;
        for (int i = 0; i < arr.length; i++) {                  //O(N) - not always run
            if (arr[i] == element){
                count1++;
            }
        }
        if (count1 > arr.length/2){
            return element;
        }
        return -1;
    }
}
