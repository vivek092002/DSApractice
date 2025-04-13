package com.takeyouforward.tcs.src.arrays;


import java.util.Scanner;

public class singleNumber {

    public static int singleElement(int[] arr, int n){
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr =  new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(singleElement(arr,n));
        sc.close();
    }
}
