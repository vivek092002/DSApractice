package com.takeyouforward.strings.stringPractice;

import java.util.Scanner;

public class concatenateStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = sc.nextLine();

        System.out.println(str.concat(str2));

        sc.close();
    }
}
