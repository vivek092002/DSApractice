package com.takeyouforward.bitManipulation;

public class minBitsToConvertANumber {
    public static void main(String[] args) {
        int start = 10;
        int goal = 7;
        int xor =start ^ goal;
        int count=0;
        while(xor>0){
            count++;
            xor=xor & (xor-1);
        }
        System.out.println(count);
    }
}
