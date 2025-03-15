package com.takeyouforward.bitManipulation;

public class powOf2 {
    public static void main(String[] args) {
        int n = 16;

        System.out.println(power(n));
    }

    public static boolean power(int n){
        int count = 0;
        while (n > 0){
            if ((n & 1) != 0){
                count++;
            }
            n = n >> 1;
        }
        return (count == 1);
    }
}
