package com.takeyouforward.graphs;

import java.util.Scanner;

public class representation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] adj = new int[n+1][m+1];

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            adj[u][v] = 1; 
            adj[v][u] = 1;
        }

        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < m+1; j++) {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
