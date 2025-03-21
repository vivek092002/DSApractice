package com.takeyouforward.bitManipulation;

public class toggleIthBit {
    public static void main(String[] args) {
        int n = 13;
        int i = 2;

        System.out.println(n ^ (1<<i));
    }
}
