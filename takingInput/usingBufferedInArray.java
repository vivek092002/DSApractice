package com.takeyouforward.takingInput;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class usingBufferedInArray {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split("\\s+");
        int n = input.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }
        System.out.println(Arrays.toString(arr));
    }
}
