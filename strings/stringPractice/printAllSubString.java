package com.takeyouforward.strings.stringPractice;

import java.util.Scanner;

public class printAllSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "abcd";

        for (int i = 0; i <= str.length()-1; i++) {
            for (int j = i+1; j <= str.length(); j++) {
                System.out.println(str.substring(i,j));
            }
        }

        sc.close();
    }
}
