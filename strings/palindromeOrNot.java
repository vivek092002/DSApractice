package com.takeyouforward.strings;

import java.util.Scanner;

public class palindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(palinOrNot(0,str));
        sc.close();
    }

    public static boolean palinOrNot(int i, String str){
        if (i > str.length() / 2){
            return true;
        }

        if (str.charAt(i) != str.charAt(str.length()-i-1)){
            return false;
        }
        return true;
    }
}
