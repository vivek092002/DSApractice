package com.takeyouforward.bitManipulation;

import java.util.Scanner;

public class convertBinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(convert(str));
        sc.close();
    }


    //O(len) and O(1)
    public static int convert(String str){
        int len = str.length();
        int p2 = 1;
        int num = 0;

        for (int i = len-1; i >= 0 ; i--) {
            if (str.charAt(i) == '1'){
                num = num + p2;
            }
            p2 = p2 * 2;
        }

        return num;
    }
}
