package com.takeyouforward.tcs.src.storyQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mthPrimeNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int m = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);
        System.out.println(result(m));
    }

    public static int result(int m){
        int num = primeNum(m);
        int num2 = singleDigit(num);
        return num * num2;
    }

    public static int singleDigit(int n){
        if (n < 10){
            return n;
        }
        int sum = 0;
        while (n > 0){
            int temp = n % 10;
            sum += temp;
            n = n / 10;
        }
        return singleDigit(sum);
    }

    public static boolean isPrime(int n){
        if (n == 1){
            return false;
        }
        if (n == 2){
            return true;
        }
        if (n % 2 == 0){
            return false;
        }
        for (int i = 3; i*i <= n; i = i+2) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static int primeNum(int m){
        int count = 0;
        int num = 2;
        while (true){
            if (isPrime(num)){
                count++;
                if (count == m){
                    return num;
                }
            }
            num++;
        }
    }
}
