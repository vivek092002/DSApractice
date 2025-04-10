package com.takeyouforward.stackAndQueue;

import java.util.Stack;

class minStack1{
    Stack<Long> st = new Stack<>();
    Long mini;
    public minStack1() {
        this.mini = Long.MAX_VALUE;
    }

    public void push(int x){
        Long val = Long.valueOf(x);
        if (st.isEmpty()){
            mini = val;
            st.push(val);
        } else {
            if (val < mini){
                mini = val;
                st.push(2*val - mini);
            } else {
                st.push(val);
            }
        }
    }

    public void pop(){
        if (st.isEmpty()){
            return;
        }
        Long val = st.pop();
        if (val < mini){
            mini = 2 * mini - val;
        }
    }

    public int top(){
        Long val = st.peek();

        if (val <  mini){
            return mini.intValue();
        }

        return val.intValue();
    }

    public int getMin() {
        return mini.intValue();
    }
}

public class minStack {
    public static void main(String[] args) {
        minStack1 st = new minStack1();
        st.push(12);
        st.push(15);
        st.push(10);
        System.out.println(st.getMin());
    }
}
