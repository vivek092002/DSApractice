package com.takeyouforward.tcs.src.storyQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class matrixPrime {

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
        for (int i = 3; i*i <= n ; i=i+2) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int m = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);

        if (m <= 0 || n<=0){
            System.out.println("Wrong Input");
            return;
        }
        if (input.length - 2 < m*n){
            System.out.println("Wrong Input");
            return;
        }
        int temp = 2;
        int[][] mat = new int[m][n];
        for (int i = 0; i < m; i++) {
            boolean hasBool = false;
            for (int j = 0; j < n; j++) {
                int val = Integer.parseInt(input[temp++]);
                if (val < 0){
                    System.out.println("Wrong Input");
                    return;
                }
                mat[i][j] = val;
                if (isPrime(val)){
                    hasBool = true;
                }
            }
            if (!hasBool){
                System.out.println("Not Valid");
                return;
            }
        }
        System.out.println("Valid");
    }
}
