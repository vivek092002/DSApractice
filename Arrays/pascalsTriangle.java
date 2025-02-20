package com.takeyouforward.Arrays;

import java.util.ArrayList;
import java.util.List;

public class pascalsTriangle {
    public static void main(String[] args) {
        int row = 5;
        int col = 3;
        //printElement(row,col);
        //printRow2(row,col);
        System.out.println(printPascal(row));
    }

    //given row and col. print the element at that place
    public static void printElement(int row, int col){
        //it is given by nCr where n = row - 1 and r = col - 1
        long ans = nCr(row-1,col-1);
        System.out.println(ans);
    }
    public static long nCr(int n, int r){
        long res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n-i);
            res = res / (i+1);
        }
        return res;
    }


    //print the given row of the pascal triangle
    //brute force using nCr as row is same but use for loop for column

    //O(N*R)
    public static void printRow(int row, int col){
        for (int c = 1; c <= row; c++) {
            System.out.print(nCr(row-1,c-1) + " ");
        }
    }

    //better solution
    //O(N)
    public static void printRow2(int row, int col){
        int ans = 1;
        System.out.print(ans + " ");
        for (int i = 1; i < row; i++) {
            ans = ans * (row-i);
            ans = ans / i;
            System.out.print(ans + " ");
        }
    }

    //print the pascal triangle
    //O(N)
    public static List<List<Integer>> printPascal(int row){
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 1; i <= row; i++) {
            ans.add(generateRow(i));
        }
        return ans;
    }

    public static List<Integer> generateRow(int row){
        int ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(ans);
        for (int col = 1; col < row; col++) {
            ans = ans * (row-col);
            ans = ans / col;
            ansRow.add(ans);
        }
        return ansRow;
    }
}

