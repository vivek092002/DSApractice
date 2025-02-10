package com.takeyouforward.recursion;

public class printNamesNTimes {
    public static void main(String[] args) {
        int n = 10;
        int i = 0;
        print(i,n);
    }
    public static void print(int i,int n){
        if (i > n){
            return;
        }
        System.out.println("VIVEK");
        print(i+1,n);
    }
}
