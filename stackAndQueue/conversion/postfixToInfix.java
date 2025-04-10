package com.takeyouforward.stackAndQueue.conversion;

//steps for conversion
// 1. Traverse the postfix expression from left to right.
// 2. If the character is an operand, push it onto the stack.
// 3. If the character is an operator, pop two operands from the stack, combine them into a string "(operand1 operator operand2)", and push the resulting string back to the stack.
// 4. In the end, the stack will contain one element — the complete infix expression.

import java.util.Stack;

public class postfixToInfix {

    public static String postfixInfix(String exp){
        Stack<String> st = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            if (Character.isLetterOrDigit(ch)){
                st.push(String.valueOf(ch));
            } else {
                String top1 = st.pop();
                String top2 = st.pop();

                String temp = "(" + top2 + ch + top1 + ")";
                st.push(temp);
            }

        }
        return st.pop();
    }

    public static void main(String[] args) {
        String exp = "AB-DE+F*/";
        System.out.println("Postfix expression : " + exp);
        System.out.println("Infix expression : " + postfixInfix(exp));
    }
}
