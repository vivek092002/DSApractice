package com.takeyouforward.stackAndQueue.conversion;

import java.util.Stack;

//Traverse the prefix expression from right to left.
//If the symbol is an operand, push it onto the stack.
//If the symbol is an operator, pop two operands from the stack, combine them into a string: "(operand1 operator operand2)", and push the result back onto the stack.
//At the end, the stack will contain one element — the full infix expression.

public class prefixToInfix {

    public static String prefixInfix(String exp){
        Stack<String> st = new Stack<>();
        for (int i = exp.length()-1; i >= 0 ; i--) {
            char ch = exp.charAt(i);
            if (Character.isLetterOrDigit(ch)){
                st.push(String.valueOf(ch));
            } else {
                String top1 = st.pop();
                String top2 = st.pop();
                String temp = "(" + top1 + ch + top2 + ")";
                st.push(temp);
            }
        }
        return st.pop();
    }

    public static void main(String[] args) {
        String exp = "*+PQ-MN";
        System.out.println("Prefix expression : " + exp);
        System.out.println("Infix expression : " + prefixInfix(exp));
    }
}
