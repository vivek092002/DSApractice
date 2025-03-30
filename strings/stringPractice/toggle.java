package com.takeyouforward.strings.stringPractice;

import java.util.Scanner;

public class toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int asci = (int)ch;
            if (ch == ' '){
                continue;
            }
            if (asci >= 97 && asci <= 122){
                asci -= 32;
                char dh = (char) asci;
                str.setCharAt(i,dh);
            } else {
                asci += 32;
                char dh = (char) asci;
                str.setCharAt(i,dh);
            }
        }

        System.out.println(str);
        sc.close();
    }
}
