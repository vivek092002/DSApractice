package com.takeyouforward.tcs.src.arrays;

import java.util.Scanner;

public class nthPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(nthPrime(n));
        sc.close();
    }

    public static int nthPrime(int n){
        int num = 2;
        int count = 0;
        while (true){
            if (isPrime(num)){
                count++;
                if (count == n){
                    return num;
                }
            }
            num++;
        }
    }

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
        for (int i = 3; i*i <= num; i+=2) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
