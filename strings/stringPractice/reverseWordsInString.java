package com.takeyouforward.strings.stringPractice;

import java.util.Scanner;
import java.util.Stack;

public class reverseWordsInString {

    //optimal approach
    public static String reverseWords2(String str){
        StringBuilder ans = new StringBuilder("");
        StringBuilder sb = new StringBuilder(str);
        int n = sb.length();
        sb.reverse();
        for (int i = 0; i < sb.length(); i++) {
            StringBuilder word = new StringBuilder("");
            while (i<n && sb.charAt(i) != ' '){
                word.append(sb.charAt(i));
                i++;
            }

            word.reverse();
            if (word.length() > 0){
                ans.append(" " + word);
            }
        }
        return ans.toString().substring(1);
    }


    //O(2N)
    public static String reverseWords(String str){
        Stack<String> st = new Stack<String>();
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' || str.charAt(i) == '.'){
                st.push(s);
                s = "";
            } else {
                s += str.charAt(i);
            }
        }
        String ans = "";
        while (st.size() != 1){
            ans += st.peek() + " ";
            st.pop();
        }
        ans += st.peek();
        return ans;
    }

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverseWords2(str));
        sc.close();
    }
}
