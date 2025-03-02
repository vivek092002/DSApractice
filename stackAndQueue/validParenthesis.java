package com.takeyouforward.stackAndQueue;

import java.util.Stack;

public class validParenthesis {

    public static boolean isValid(String str){
        Stack<Character> st = new Stack<>();
        for (char it : str.toCharArray()){
            if (it == '(' || it == '{' || it == '['){
                st.push(it);
            } else {
                if (st.isEmpty()) return false;
                char ch = st.pop();
                if ((it == ')' && ch == '(') ||  (it == ']' && ch == '[') || (it == '}' && ch == '{')){
                    continue;
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        String str = "()[{}()]";
        if (isValid(str)){
            System.out.println("is valid");
        } else {
            System.out.println("not valid");
        }
    }
}
