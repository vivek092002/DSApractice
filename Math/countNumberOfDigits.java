package com.takeyouforward.Math;

public class countNumberOfDigits {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(countDigits(n));
    }

    public static int countDigits(int x){
        int count = 0;
        while (x>0){
            int temp = x % 10;
            x = x / 10;
            count++;
        }

        return count;
    }
}
