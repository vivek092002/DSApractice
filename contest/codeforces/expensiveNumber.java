package com.takeyouforward.contest.codeforces;

import java.util.Scanner;

public class expensiveNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            String s = Integer.toString(n);
            int len = s.length();

            int temp = 0;
            int count = 0;
            for (int i = 0; i < len; i++) {
                if (s.charAt(i) == '0'){
                    count++;
                } else {
                    temp = Math.max(temp, count+1);
                }
            }

            System.out.println(len - temp);
        }
        sc.close();
    }
}
