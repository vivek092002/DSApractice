package com.takeyouforward.Arrays;

public class missingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        int N = 5;
        System.out.println(missing2(arr,N));
    }

    //brute force approach
    //  O(N*N)
    public static int missing(int[] arr){
        for (int i = 1; i <= arr.length+1; i++) {   //O(N)
            int flag = 0;
            for (int j = 0; j < arr.length; j++) {      //O(N)
                if (arr[j] == i){
                    flag=1;
                    break;
                }
            }

            if (flag == 0){
                return i;
            }
        }
        return -1;
    }

    //better approach
    //O(N) + O(N) and space - O(N)
    public static int missing2(int[] arr, int N){
        int[] hash = new int[N+1];  //hash array
        
        //storing the frequencies
        for (int i = 0; i < N-1; i++) {     //O(N)
            hash[arr[i]]++;
        }

        for (int i = 1; i <= N ; i++) {        //O(N)
            if (hash[i] == 0){
                return i;
            }
        }
        return -1;
    }

    //Optimal Approach first
    public static int missing3(int[] arr, int N){
        int sum = N*(N+1)/2;
        int sum2 = 0;
        for (int i = 0; i < N-1; i++) {
            sum2 += arr[i];
        }
        return sum - sum2;
    }

    //Optimal Approach second
    public static int missing4(int[] arr, int N){
        int xor1 = 0, xor2 = 0;
        int n = N-1;
        for (int i = 0; i < n; i++) {
            xor2 = xor2 ^ arr[i];
            xor1 = xor1 ^ (i+1);
        }

        xor1 = xor1 ^ N;
        return xor1 ^ xor2;
    }
}
