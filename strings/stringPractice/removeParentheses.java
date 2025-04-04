package com.takeyouforward.strings.stringPractice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class removeParentheses {

    public static String removeOuterParentheses(String str){
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '('){
                if (st.size() > 0){
                    sb.append(ch);
                }
                st.push(ch);
            } else {
                st.pop();
                if (st.size() > 0){
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String result = removeOuterParentheses(read.readLine());
        System.out.println(result);
    }
}