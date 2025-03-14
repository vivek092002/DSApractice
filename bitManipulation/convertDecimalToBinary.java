package com.takeyouforward.bitManipulation;

import java.util.Scanner;

public class convertDecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(convert(n));
        sc.close();
    }

    //O(log2N) and O(log2N)
    public static String convert(int n){
        StringBuilder res = new StringBuilder();
        while (n > 0){
            if (n % 2 == 1){
                res.append('1');
            } else {
                res.append('0');
            }

            n = n / 2;
        }

        res.reverse();
        return res.toString();
    }
}
