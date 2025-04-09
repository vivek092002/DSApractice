package com.takeyouforward.contest.codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class idealGenerator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0){
            int k = Integer.parseInt(br.readLine());
            if (k % 2 == 0){
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
