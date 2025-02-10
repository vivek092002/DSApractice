package com.takeyouforward.recursion;

public class sumOfFirstN {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        sum(n,sum);
    }
    public static void sum(int i, int sum){
        if (i<1){
            System.out.println(sum);
            return;
        }
        sum(i-1, sum+i);
    }

    //functional way
    public static int sum2(int n){
        if (n==0){
            return 1;
        }
        return n + sum2(n-1);
    }
}
