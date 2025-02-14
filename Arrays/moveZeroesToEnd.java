package com.takeyouforward.Arrays;

import java.util.ArrayList;

public class moveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,2,0,0,4,5,1};
        print(arr);
        moveZeroes(arr);
        print(arr);
    }

    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //brute Force approach
    // O(2N) and space - O(X)
    public static void moveZeroes(int[] arr){
        // step 1   O(N)
        ArrayList<Integer> li = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){
                li.add(arr[i]);
            }
        }
        //step 2    O(X)
        for (int i = 0; i < li.size(); i++) {
            arr[i] = li.get(i);
        }
        //step 2    O(N-X)
        for (int i = li.size(); i < arr.length; i++) {
            arr[i] = 0;
        }
    }


    //Optimal Approach
    //O(N) and O(1)
    public static void moveZeroes2(int[] arr){
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                j=i;
                break;
            }
        }

        //if no non zeroes numbers
        if (j == -1){
            return;
        }
        for (int i = j+1; i < arr.length; i++) {
            if (arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
}
