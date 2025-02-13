package com.takeyouforward.practice;

public class printNNames {
    public static void main(String[] args) {
        int n = 10;
        String str = "KOMAL";
        print(n,str);
    }

//    public static void print(int n, String str){
//        for (int i = 0; i < n; i++) {
//            System.out.println(str);
//        }
//    }

    //recursion
    public static void print(int n, String str){
        if(n==0){
            return;
        }
        System.out.println(str);
        print(n-1,str);
    }
}
