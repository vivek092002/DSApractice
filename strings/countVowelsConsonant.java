package com.takeyouforward.strings;

import java.util.Scanner;

public class countVowelsConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        count(str);
        sc.close();
    }

    public static void count(String str){
        int vowels = 0, constants = 0, whitespace = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            } else if (ch == ' '){
                whitespace++;
            } else if (ch >= 'a' || ch <= 'z'){
                constants++;
            }
        }
        System.out.println(vowels);
        System.out.println(constants);
        System.out.println(whitespace);
    }
}
