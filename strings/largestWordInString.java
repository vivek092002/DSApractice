package com.takeyouforward.strings;

import java.util.Scanner;

public class largestWordInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(maxLength(str));
        sc.close();
    }

    public static String maxLength(String str){
        int len = str.length();
        int i = 0, j = 0;
        int maxLen = 0;
        int maxStart = 0;
        while (j<=len){
            if (j<len && str.charAt(j)!=' '){
                j++;
            } else {
                int currLen = j-i;
                if (currLen > maxLen){
                    maxLen = currLen;
                    maxStart = i;
                }
                j++;
                i = j;
            }
        }
        String maxWord = str.substring(maxStart,maxLen);
        return maxWord;
    }
}
