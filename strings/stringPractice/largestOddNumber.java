//https://leetcode.com/problems/largest-odd-number-in-string/
package com.takeyouforward.strings.stringPractice;

import java.util.Scanner;

public class largestOddNumber {

    public static int largestOdd(String str){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < str.length(); i++) {
            if ((int) str.charAt(i)% 2 != 0){
                max = Math.max(max, (int) str.charAt(i));
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "52";
        System.out.println(largestOdd(str));
        sc.close();
    }
}
