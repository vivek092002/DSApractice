package com.takeyouforward.strings.stringPractice;

import java.util.Scanner;

public class removeSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "How are you doing";
        System.out.println(remove(str));
        sc.close();
    }

    public static String remove(String str){
        StringBuffer sb = new StringBuffer();
        for(char c : str.toCharArray()){
            if (!Character.isWhitespace(c)){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
