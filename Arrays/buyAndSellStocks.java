package com.takeyouforward.Arrays;

public class buyAndSellStocks {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(stocks(arr));
    }

    public static int stocks(int[] arr){
        int mini = arr[0];
        int profit = 0;
        for (int i = 1; i < arr.length; i++) {
            int cost = arr[i] - mini;
            profit = Math.max(profit, cost);
            mini = Math.min(arr[i], mini);
        }
        return profit;
    }
}
