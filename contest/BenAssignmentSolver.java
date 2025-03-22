package com.takeyouforward.contest;

import java.util.*;

public class BenAssignmentSolver {

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    static int[] solve(int N, int M, long K, int[] Arr, int[] D) {
        int[] result = new int[M];
        long[] prefixSum = new long[N + 1];
        for (int i = 1; i <= N; i++) {
            prefixSum[i] = prefixSum[i - 1] + Arr[i - 1];
        }
        for (int q = 0; q < M; q++) {
            int startDay = D[q] - 1;
            int minDays = -1;

            int G = 0;
            long totalHours = 0;
            for (int X = 1; startDay + X <= N; X++) {
                int currentDay = startDay + X - 1;
                G = gcd(G, Arr[currentDay]);
                totalHours = (prefixSum[startDay + X] - prefixSum[startDay]) / G;
                if (totalHours >= K) {
                    minDays = X;
                    break;
                }
            }
            result[q] = minDays;
        }

        return result;
    }

    public static void main(String[] args) {
        // Example input
        int N = 5, M = 2;
        long K = 10;
        int[] Arr = {2, 5, 10, 1, 3};
        int[] D = {3, 4};

        int[] output = solve(N, M, K, Arr, D);
        System.out.println(Arrays.toString(output)); // Expected Output: [2, -1]
    }
}
