package com.takeyouforward.stackAndQueue.conversion;

import java.util.Stack;

public class prefixToPostfix {
    public static String prefixPostfix(String exp){
        Stack<String> st = new Stack<>();
        for (int i = exp.length() - 1; i >= 0; i--) {
            char ch = exp.charAt(i);
            if (Character.isLetterOrDigit(ch)){
                st.push(String.valueOf(ch));
            } else {
                String top1 = st.pop();
                String top2 = st.pop();
                String temp = top1 + top2 + ch;
                st.push(temp);
            }
        }
        return st.pop();
    }

    public static void main(String[] args) {
        String exp = "/-AB*+DEF";
        System.out.println("Prefix expression : " + exp);
        System.out.println("Postfix expression : " + prefixPostfix(exp));
    }
}
