package com.takeyouforward.stackAndQueue;

class stack{
    int size = 10;
    int[] arr = new int[size];
    int top = -1;
    void push(int x){
        if (top == size){
            System.out.println("stack over flow");
        }
        top++;
        arr[top] = x;
    }
    int pop(){
        int x = arr[top];
        top--;
        return x;
    }
    int top(){
        return arr[top];
    }
    int size(){
        return top + 1;
    }
}

public class stackUsingArrays {
    public static void main(String[] args) {
        stack st = new stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println(st.size());
        System.out.println(st.top());
        System.out.println(st.pop());
        System.out.println(st.pop());
    }
}
