package com.takeyouforward.stackAndQueue.monotonic;

import java.util.Arrays;
import java.util.Stack;

public class nearestSmallerElement {

    //naive method
    //O(N^2) and O(N)
    public static int[] nearestSmaller(int[] arr){
        int[] nse = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i-1; j >= 0; j--) {
                if (arr[j] < arr[i]){
                    nse[i] = arr[j];
                    break;
                }
            }
        }
        return nse;
    }

    //optimal code using stack
    //We traverse from left to right, and use a stack to maintain a decreasing sequence of values
    // from the past (for comparison).
    public static int[] nearestSmaller2(int[] arr){
        int[] nse = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[i] <= st.peek() ){
                st.pop();
            }
            nse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }
        return nse;
    }

    //Driver's code
    public static void main(String[] args) {
        int[] arr = {4,5,2,10,8};
        System.out.println(Arrays.toString(nearestSmaller2(arr)));
    }
}
