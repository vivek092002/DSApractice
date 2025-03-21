package com.takeyouforward.bitManipulation;

public class  countNumberOfSetBits {
    public static void main(String[] args) {
        int n = 13;
        System.out.println(count(n));
    }

    public static int count(int n){
        int count = 0;
        while (n > 0){
            if ((n & 1) != 0){
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
}
