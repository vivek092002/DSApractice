package com.takeyouforward.strings;

public class checkRotateString {
    public static void main(String[] args) {
        String str = "ABCD";
        String str2 = "CDAB";
        System.out.println(checkRotation(str,str2));
    }

    //optimal approach
    public static boolean checkRotation(String str, String str2){
        if (str.length() != str2.length()){
            return false;
        }

        return (str + str).contains(str2);
    }
}
