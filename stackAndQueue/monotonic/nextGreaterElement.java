package com.takeyouforward.stackAndQueue.monotonic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class nextGreaterElement {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(findNge(nums));
    }

    //naive approach
    //O(N^2)
    public static int[] nge(int[] arr){
        int[] nge = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] > arr[i]){
                    nge[i] = arr[j];
                    break;
                }
            }
        }
        return nge;
    }

    //Use a stack to keep track of elements for which we haven’t yet found the next greater element.
    //Traverse the array from right to left.
    //For each element:
    //  While the stack is not empty and the top element is less than or equal to the current element, pop from the stack.
    //  If the stack is empty after popping, there is no greater element, so put -1 in the result.
    //  If the stack still has elements, the top of the stack is the next greater element.
    //Push the current element onto the stack (it might be the next greater for upcoming elements).
    //Return the result array.

    public static ArrayList<Integer> findNge(int[] arr){
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = arr.length-1; i >= 0 ; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }

            if (st.isEmpty()){
                list.add(0,-1);
            } else {
                list.add(0,st.peek());
            }
            st.push(arr[i]);
        }
        return list;
    }
}
