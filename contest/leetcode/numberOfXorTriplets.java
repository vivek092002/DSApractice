package com.takeyouforward.contest.leetcode;

public class numberOfXorTriplets {
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        System.out.println(count(arr));
    }

    public static int count(int[] arr){
        int n = arr.length;
        if (n < 3){
            return n;
        } else {
            int msb = 1;
            while (n > 1) {
                n >>= 1;
                msb <<= 1;
            }
            return (int) Math.pow(2,msb);
        }
    }
}
