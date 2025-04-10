package com.takeyouforward.stackAndQueue.conversion;

import java.util.Stack;

public class postfixToPrefix {

    public static String postfixPrefix(String exp){
        Stack<String> st = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (Character.isLetterOrDigit(ch)){
                st.push(String.valueOf(ch));
            } else {
                String top1 = st.pop();
                String top2 = st.pop();
                String temp = ch + top2 + top1;
                st.push(temp);
            }
        }
        return st.pop();
    }

    public static void main(String[] args) {
        String exp = "AB-DE+F*/";
        System.out.println("Postfix expression : " + exp);
        System.out.println("Prefix expression : " + postfixPrefix(exp));
    }
}
