package com.takeyouforward.strings;

public class palindromeCheck {
    public static void main(String[] args) {
        String str = "geekforgeeks";
        System.out.println(palindrome2(str));
    }

    public static boolean palindrome(String str){
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        if (sb.equals(str)){
            return true;
        }

        return false;
    }

    //optimal solution
    public static boolean palindrome2(String str){
        int start = 0;
        int end = str.length()-1;
        while (start<end){
            if (str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
