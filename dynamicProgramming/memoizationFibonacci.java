package com.takeyouforward.dynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class memoizationFibonacci {

    public static int fibo(int n, int[] dp){
        if (n <= 1){
            return n;
        }

        if (dp[n] != -1){
            return dp[n];
        }

        return dp[n] = fibo(n-1,dp) + fibo(n-2,dp);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(fibo(n,dp));
        sc.close();
    }
}
