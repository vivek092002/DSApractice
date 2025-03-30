package com.takeyouforward.contest.codechef;

import java.util.Scanner;

public class lostInFest {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt();
            int[] H = new int[N];
            for (int i = 0; i < N; i++) {
                H[i] = scanner.nextInt();
            }
            int bhoomiHeight = H[N - 1];
            int time = 0;
            boolean canSee = true;
            for (int i = 0; i < N - 1; i++) {
                if (H[i] >= bhoomiHeight) {
                    canSee = false;
                    break;
                }
            }
            if (canSee) {
                System.out.println(0);
                continue;
            }
            int currentPos = N - 1;
            boolean found = false;
            while (currentPos > 0) {
                // Swap with the person in front
                int temp = H[currentPos];
                H[currentPos] = H[currentPos - 1];
                H[currentPos - 1] = temp;
                time++;
                currentPos--;
                // Check if current position meets the condition
                boolean valid = true;
                for (int i = 0; i < currentPos; i++) {
                    if (H[i] >= bhoomiHeight) {
                        valid = false;
                        break;
                    }
                }
                if (valid) {
                    found = true;
                    break;
                }
            }
            System.out.println(time);
        }
        scanner.close();
    }
}
