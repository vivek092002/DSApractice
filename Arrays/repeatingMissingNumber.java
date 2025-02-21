//https://takeuforward.org/data-structure/find-the-repeating-and-missing-numbers/
package com.takeyouforward.Arrays;

import java.util.ArrayList;

public class repeatingMissingNumber {
    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 1, 1};
        System.out.println(findNumbers3(arr));
    }

    //brute force approach
    //O(N^2)
    public static ArrayList<Integer> findNumbers(int[] arr){
        int missing = -1;
        int repeating = -1;
        for (int i = 1; i <= arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i){
                    count++;
                }
            }
            if (count == 2){
                repeating = i;
            } else if (count == 0){
                missing = i;
            }

            if (repeating != -1  && missing != -1){
                break;
            }
        }
        ArrayList<Integer> st = new ArrayList<>();
        st.add(repeating);
        st.add(missing);
        return st;
    }

    //better approach
    //using hashArrays
    //O(2N) ans O(N)
    public static ArrayList<Integer> findNumbers2(int[] arr){
        int[] hash = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }
        int repeating = -1, missing = -1;
        for (int i = 1; i <= arr.length; i++) {
            if (hash[i] == 2){
                repeating = i;
            } else if (hash[i] == 0){
                missing = i;
            }
            if (repeating != -1 && missing != -1)
                break;
        }
        ArrayList<Integer> st = new ArrayList<>();
        st.add(repeating);
        st.add(missing);
        return st;
    }

    //optimal approach
    //using Math equation
    //O(N)
    public static ArrayList<Integer> findNumbers3(int[] arr){
        //S - SN = x-y
        //S2 - S2N = x^2 - y^2
        long n = arr.length;
        long SN = n * (n+1) / 2;
        long S2N = n * (n+1) * (2*n+1) / 6;

        long S = 0, S2 = 0;
        for (int i = 0; i < n; i++) {
            S += arr[i];
            S2 += (long)arr[i] * (long)arr[i];
        }

        long val1 = S - SN; //x-y
        long val2 = S2 - S2N;
        val2 = val2 / val1;     //x+y
        long x = (val1 + val2) / 2;
        long y = x - val1;

        ArrayList<Integer> list = new ArrayList<>();
        list.add((int) x);
        list.add((int) y);
        return list;
    }
}
