package com.takeyouforward.recursion;

public class printOneToN {
    public static void main(String[] args) {
        int n = 10;
        print(n);
    }

    public static void print(int n){
        //base case
        if (n<=0){
            return;
        }
        print(n-1);
        System.out.print(n+ " ");
    }
}
