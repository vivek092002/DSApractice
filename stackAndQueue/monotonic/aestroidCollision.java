package com.takeyouforward.stackAndQueue.monotonic;

import java.util.Arrays;
import java.util.Stack;

public class aestroidCollision {

    public static int[] collection(int[] arr){
        Stack<Integer> st = new Stack<>();
        for (int it : arr){
            boolean alive = true;

            while (alive && it < 0 && !st.isEmpty() && st.peek() > 0){
                int top = st.peek();
                if (top < -it){
                    st.pop();
                } else if (top == -it){
                    st.pop();
                    alive = false;
                } else {
                    alive = false;
                }
            }
            if (alive){
                st.push(it);
            }
        }
        int[] result = new int[st.size()];
        for (int i = result.length-1; i >= 0 ; i--) {
            result[i] = st.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {5,10,-5};
        System.out.println(Arrays.toString(collection(arr)));
    }
}
