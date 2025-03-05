package com.takeyouforward.strings;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class reverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverse2(str));
        sc.close();
    }

    //brute force method
    //O(N) and space - O(N)
    public static String reverse(String str){
        char[] reverseString = new char[str.length()];
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            st.add(str.charAt(i));
        }

        int i = 0;
        while (!st.empty()){
            reverseString[i++] = st.pop();
        }

        str = new String(reverseString);
        return str;
    }

    //better approach
    //O(N) and O(1)
    public static String reverse2(String str){
        int i = 0;
        int j = str.length()-1;
        while (i < j){
            str = swap(str, i, j);
            i++;
            j--;
        }
        return str;
    }

    public static String swap(String str, int i, int j){
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i, str.charAt(j));
        sb.setCharAt(j, str.charAt(i));

        return sb.toString();
    }
}
