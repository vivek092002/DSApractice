package com.takeyouforward.strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class reverseWordInString {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(reverseWords2(str));
    }


    //brute force approach
    //Approach
    //Use a stack to push all the words in a stack
    //Now, all the words of the string are present in the stack, but in reverse order
    //Pop elements of the stack one by one and add them to our answer variable. Remember to add a space between the words as well.
    //Here’s a quick demonstration of the same
    //O(N) and O(N)
    public static String reverseWords(String str){
        str += " ";
        Stack<String> st = new Stack<>();
        String temp = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' '){
                st.push(temp);
                temp = "";
            } else {
                temp += str.charAt(i);
            }
        }

        String ans = "";
        while (!st.isEmpty()){
            ans += st.peek() + " ";
            st.pop();
        }
        return ans;
    }

    //optimal approach
    //Approach:
    //Convert the string into a character array.
    //Reverse the entire array.
    //Reverse each individual word within the reversed array.
    //Convert the character array back to a string.

    public static String reverseWords2(String str){
        char[] arr = str.trim().toCharArray();
        reverse(arr, 0, arr.length-1);

        int start = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' '){
                reverse(arr,start,i-1);
                start = i + 1;
            }
        }

        //for last word
        reverse(arr, start, arr.length-1);

        return new String(arr);
    }

    private static void reverse(char[] arr, int start, int end){
        while (start < end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
