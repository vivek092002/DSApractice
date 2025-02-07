package com.takeyouforward.Math;

public class printDivisors {
    public static void main(String[] args) {
        int num = 34;

        print(num);
    }

    public static void print(int num){
        for (int i = 1; i <= num; i++) {
            if (num % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
