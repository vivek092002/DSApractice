package com.takeyouforward.strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class removeSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "How are you doing";
        System.out.println(remove(str));
        sc.close();
    }

    //using string buffer
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
