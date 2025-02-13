package com.takeyouforward.practice;

public class print10to1 {
    public static void main(String[] args) {
        int n = 10;
        print(n);
    }
    //10 9 8 7 6 5 4 3 2 1
    //recursion
    public static void print(int n){
        //base case
        if (n==0){
            return;
        }
        System.out.println(n);
        print(n-1);

    }
}
