package com.takeyouforward.strings.stringPractice;

import java.util.Scanner;

public class palindromicSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(countSubString(str));
        sc.close();
    }

    public static int countSubString(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                if (isPalindrome(str.substring(i,j))){
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean isPalindrome(String str){
        int i = 0;
        int j = str.length()-1;
        while (i<j){
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
