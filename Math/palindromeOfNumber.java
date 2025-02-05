package com.takeyouforward.Math;

import java.util.Scanner;

public class palindromeOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(palindrome(n));
        sc.close();
    }
    public static boolean palindrome(int x){
        int n = 0;
        int temp = x;
        while (x>0){
            int temp2 = x % 10;
            n = (n*10) + temp2;
            x = x / 10;
        }

        if (temp == n){
            return true;
        } else {
            return false;
        }
    }
}
