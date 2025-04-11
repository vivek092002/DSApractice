package com.takeyouforward.stackAndQueue.monotonic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class nextGreaterElementTwo {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(findNGe(nums)));
    }

    //We use a monotonic stack to store indices while scanning twice
    // (simulate circular array). We maintain elements in decreasing order on the stack.
    public static int[] findNGe(int[] nums){
        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();
        Arrays.fill(res, -1);

        // Traverse the array twice (simulate circular array)
        for (int i = 0; i < 2 * n; i++) {
            int current = nums[i % n];

            while (!stack.isEmpty() && nums[stack.peek()] < current) {
                int index = stack.pop();
                res[index] = current;
            }

            if (i < n) {
                stack.push(i);
            }
        }
        return res;
    }
}
