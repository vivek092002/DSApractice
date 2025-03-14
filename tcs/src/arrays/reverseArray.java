package arrays;

import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int[] arr = {5,4,3,2,1};
        reverse(arr,n);
        print(arr,n);
        sc.close();
    }

    public static void reverse(int[] arr, int n){
        int p1 = 0, p2 = n-1;
        while (p1 < p2){
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }
    }

    public static void print(int[] arr, int n){
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
