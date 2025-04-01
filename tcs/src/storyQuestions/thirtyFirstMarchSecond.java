package com.takeyouforward.tcs.src.storyQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class thirtyFirstMarchSecond {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int input1 = Integer.parseInt(input[0]);
        int input2 = Integer.parseInt(input[1]);

        int result1 = findTheNthPrime(input1);
        int result2 = findTheNthPrime(input2);

        System.out.println((result1 * result2) - 1);
    }

    public static int findTheNthPrime(int n){
        int count = 0;
        int num = 1;
        while (count < n){
            num++;
            if (isPrime(num)){
                count++;
            }
        }
        return num;
    }

    private static boolean isPrime(int num){
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
