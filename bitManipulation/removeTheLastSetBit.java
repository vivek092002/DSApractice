package com.takeyouforward.bitManipulation;

public class removeTheLastSetBit {
    public static void main(String[] args) {
        int n = 13;
        System.out.println(n & (n-1));
    }
}
