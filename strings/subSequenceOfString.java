package com.takeyouforward.strings;

//use two pointer approach on pointer for s1 and one for s2
public class subSequenceOfString {
    public static void main(String[] args) {
        String s1 = "GEEKSFORGEEKS";
        String s2 = "GRGES";
        System.out.println(isSubsequence(s1,s2));
    }

    public static boolean isSubsequence(String s1, String s2){
        int j = 0;
        for (int i = 0; i < s1.length() && j<s2.length(); i++) {
            if (s1.charAt(i) == s2.charAt(j)){
                j++;
            }
        }
        return (j == s2.length());
    }

}
