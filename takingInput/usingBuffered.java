package com.takeyouforward.takingInput;

import java.io.*;
import java.util.Arrays;

public class usingBuffered {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(Arrays.toString(arr));
    }
}
