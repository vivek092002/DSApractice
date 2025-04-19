package com.takeyouforward.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class leftRotateByD {

    public static void rotateByD(int[] arr, int d){
        
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split("\\s+");
        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        br.close();
    }
}
