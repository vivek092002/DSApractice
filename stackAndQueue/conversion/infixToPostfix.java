package com.takeyouforward.stackAndQueue.conversion;

import java.util.Stack;

public class infixToPostfix {

    public static int precedence(char ch){
        return switch (ch) {
            case '+', '-' -> 1;
            case '*', '/' -> 2;
            case '^' -> 3;
            default -> -1;
        };
    }

    //O(N)+O(N ) and O(N)
    public static String infixPostfix(String exp){
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
                while (!st.isEmpty() && precedence(ch) <= precedence(st.peek())){
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

    public static void main(String[] args) {
        String exp = "(p+q)*(m-n)";
        System.out.println("Infix expression is : " + exp);
        System.out.println("Postfix expression is : " + infixPostfix(exp));
    }
}
