package com.takeyouforward.strings;

import java.util.Scanner;

public class sortCharacterInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(sort(str));
        sc.close();
    }

    public static String sort(String str){
        int n = str.length();
        char[] arr = str.toCharArray();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]){
                    char temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        String str2 = new String(arr);
        return str2;
    }
}
