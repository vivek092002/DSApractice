package com.takeyouforward.contest;

import java.util.*;

public class ShoppingMall {

    static int solve(int N, int[] A, int[] B, int[] C, int X, int Y) {
        int INF = Integer.MAX_VALUE / 2;
        int maxH = 100;
        int maxW = 100;
        int[][] dp = new int[maxH + 1][maxW + 1];
        for (int[] row : dp) Arrays.fill(row, INF);
        dp[0][0] = 0;
        for (int i = 0; i < N; i++) {
            int h = A[i], w = B[i], cost = C[i];
            for (int currH = maxH; currH >= h; currH--) {
                for (int currW = maxW; currW >= w; currW--) {
                    if (dp[currH - h][currW - w] != INF) {
                        dp[currH][currW] = Math.min(dp[currH][currW], dp[currH - h][currW - w] + cost);
                    }
                }
            }
        }
        int minCost = INF;
        for (int h = X; h <= maxH; h++) {
            for (int w = 0; w <= Y; w++) {
                minCost = Math.min(minCost, dp[h][w]);
            }
        }
        return minCost;
    }

    public static void main(String[] args) {
        // Example test case
        int N = 4;
        int[] A = {1, 2, 3, 4}; // Happiness
        int[] B = {4, 3, 2, 1}; // Weight
        int[] C = {5, 6, 7, 8}; // Cost
        int X = 5, Y = 6;

        System.out.println(solve(N, A, B, C, X, Y)); // Output: 13
    }
}
