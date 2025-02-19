package com.takeyouforward.Arrays.matrix;

public class setMatrixZeroes {
    public static void main(String[] args) {
        int[][] mat = {{1,1,1,1},
                       {1,0,0,1},
                       {1,1,0,1},
                       {1,1,1,1}};

        int n = mat.length;
        int m = mat[0].length;

        setZero(mat,n,m);
        print(mat,n,m);
    }

    public static void print(int[][] arr, int n, int m){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //brute force approach
    //O(N*M)*O(N+M) + O(N+M)
    public static void setZero(int[][] arr, int n, int m){
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0){
                    setRow(arr,i,n);
                    setColumn(arr,i,m);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == -1){
                    arr[i][j] = 0;
                }
            }
        }
    }
    //setting row to zero
    private static void setRow(int[][] arr, int i, int n){
        for (int j = 0; j < n; j++) {
            if (arr[i][j] != 0){
                arr[i][j] = -1;
            }
        }
    }

    //setting column to zero
    private static void setColumn(int[][] arr, int j, int m){
        for (int i = 0; i < m; i++) {
            if (arr[i][j] != 0){
                arr[i][j] = -1;
            }
        }
    }
}
