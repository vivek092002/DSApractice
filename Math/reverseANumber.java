//https://leetcode.com/problems/reverse-integer/description/
package com.takeyouforward.Math;

import java.util.Scanner;

public class reverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);;
        int num = sc.nextInt();
        System.out.println(reverse(num));
        sc.close();
    }

    public static int reverse(int x){
        int num = Math.abs(x);
        int rev = 0;
        while (x!=0){
            int temp = x % 10;
            rev = rev * 10 + temp;
            x = x / 10;
        }

        if (x < 0 ){
            return -rev;
        } else {
            return rev;
        }
    }
}
