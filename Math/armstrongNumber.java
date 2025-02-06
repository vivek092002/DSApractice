//armstrong number

package com.takeyouforward.Math;

import java.util.Scanner;

public class armstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(armstrong(n));
        sc.close();
    }

    public static boolean armstrong(int x){
        int temp = 0;
        int dup = x;
        while (x>0){
            int temp2 = x % 10;
            temp = temp + (temp2*temp2*temp2);
            x = x / 10;
        }

        if (dup == temp){
            return true;
        } else {
            return false;
        }
    }
}
