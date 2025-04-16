package com.takeyouforward.contest;

import java.util.Scanner;

public class mthPrimeNumber {

    public static boolean isPrime(int num){
        if (num == 1){
            return false;
        }
        if (num == 2){
            return true;
        }
        if (num % 2 == 0){
            return false;
        }
        for (int i = 3 ; i*i<=num ; i=i+2){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static int mthPrime(int m){
        int count = 0;
        //starting number
        int num = 2;

        while (true){
            if (isPrime(num)) {
                count++;
            }
            if (count == m){
                return num;
            }
            num++;
        }
    }

    public static int sum(int mth, int n){
        int sum1 = mth;
        int count = 0;

        while (true){
            if (isPrime(mth+1)){
                count++;
                sum1 += mth+1;
            }
            mth++;
            if (count == n) {
                return sum1;
            }
        }
    }

    //driver's code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int mth = mthPrime(m);
        int sumOfPrime = sum(mth, n);
        System.out.println(sumOfPrime);

        sc.close();
    }
}
