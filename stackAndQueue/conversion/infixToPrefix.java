package com.takeyouforward.stackAndQueue.conversion;

import java.util.Stack;

//steps for infix to prefix
// 1. Reverse the string
// 2. Swap ( with ) and vice versa.
// 3. Convert the modified expression to postfix.
// 4. Reverse the postfix expression to get the prefix.

public class infixToPrefix {

    public static int precedence(char ch){
        return switch (ch) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }

    public static String reverseAndSwap(String exp){
        StringBuilder sb = new StringBuilder();
        for (int i = exp.length() - 1; i >= 0 ; i--) {
            if (exp.charAt(i) == ')'){
                sb.append("(");
            } else if (exp.charAt(i) == '('){
                sb.append(")");
            } else {
                sb.append(exp.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String infixToPostfix(String exp){
        StringBuilder result = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            //for character or digit
            if (Character.isLetterOrDigit(ch)){
                result.append(ch);
            } else if (ch == '('){        // if opening bracket is encountered
                st.push(ch);
            } else if (ch == ')'){        // if closing bracket is encountered
                while (!st.isEmpty() && st.peek() != '('){       //pop till opening bracket
                    result.append(st.pop());
                }
                st.pop();
            } else {                                    // for operator
                while (!st.isEmpty() && precedence(ch) < precedence(st.peek())){
                    result.append(ch);
                }
                st.push(ch);
            }
        }
        while (!st.isEmpty()){
            if (st.peek() == '('){
                return "INVALID EXPRESSION";
            }
            result.append(st.pop());
        }
        return result.toString();
    }

    public static String infixPrefix(String exp){
        String reversed = reverseAndSwap(exp);
        String postfix = infixToPostfix(reversed);
        return new StringBuilder(postfix).reverse().toString();
    }

    public static void main(String[] args) {
        String exp = "(A+B)*C-D+F";
        System.out.println("Infix expression : " + exp);
        System.out.println("Prefix expression : " + infixPrefix(exp));
    }
}
