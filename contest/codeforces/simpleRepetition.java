package com.takeyouforward.contest.codeforces;

import java.math.BigInteger;
import java.util.Scanner;

public class simpleRepetition {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int x = sc.nextInt();
            int k = sc.nextInt();
            String x1 = Integer.toString(x);
            String result = x1.repeat(k);
            BigInteger big = new BigInteger(result);
            if (big.isProbablePrime(20)){
                System.out.println("YES");
            } else {
                System.out.println("No");
            }
        }
    }
}
