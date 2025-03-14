package com.takeyouforward.stackAndQueue;

import java.util.EmptyStackException;
import java.util.Stack;

public class minStack1 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
    }

//    Using pairs to store the value and minimum element till now.
//    Approach: The first element in the pair will store the value and
//      the second element will store the minimum element till now.
//    When the first push operation comes in we will push the value and store
//      it as minimum itself in the pair.
//    In the second push operation, we will check if the top element’s minimum is less than the new value.
//      If it is then we will push the value with minimum as the previous top’s minimum.
//      To get the getMin element to take the top’s second element.

    class Pair{
        int x, y;
        Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    Stack<Pair> st;
    public minStack1(){
        st = new Stack<>();
    }
    public void push(int val){
        int min;
        if (st.isEmpty()){
            min = val;
        } else {
            min = Math.min(st.peek().y, val);
        }
        st.push(new Pair(val, min));
    }

    public void pop(){
        st.pop();
    }

    public int top() throws EmptyStackException {
        return st.peek().x;
    }

    public int getMin(){
        return st.peek().y;
    }
}
