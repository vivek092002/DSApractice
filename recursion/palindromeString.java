package com.takeyouforward.recursion;

public class palindromeString {
    public static void main(String[] args) {
        String str = "MqeAM";
        System.out.println(palindrome(0,str));
    }

    public static boolean palindrome(int i, String str){
        if (i>=str.length()/2){
            return true;
        }

        if (str.charAt(i) != str.charAt(str.length()-i-1)){
            return false;
        }
        return palindrome(i+1,str);
    }
}
