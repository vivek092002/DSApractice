package com.takeyouforward.bitManipulation;

public class xorFromLToR {

    private static int solveXor(int n){
        if (n % 4 == 1) return 1;
        else if (n % 4 == 2) return n+1;
        else if (n % 4 == 3) return 0;
        else return n;
    }

    public static int findXor(int l, int r){
        return solveXor(l-1) ^ solveXor(r);
    }

    public static void main(String[] args) {
        int l = 6;
        int r = 15;
        System.out.println(findXor(l,r));
    }
}
