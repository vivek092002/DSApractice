package com.takeyouforward.tcs.src.storyQuestions;

import java.io.*;

public class countPairs {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while(T-- > 0){
            int n = Integer.parseInt(br.readLine());

            String[] input = br.readLine().split("\\s+");
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = input[i];
            }
            int x = Integer.parseInt(br.readLine());
            int y = Integer.parseInt(br.readLine());

            int countPairs = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    String concatenated = arr[i] + arr[j];
                    long result = Long.parseLong(concatenated);

                    if (result >= x && result <= y){
                        System.out.println(result);
                        countPairs++;
                    }
                }
            }

            System.out.println(countPairs);
        }
    }
}
