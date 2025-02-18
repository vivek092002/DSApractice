//Dutch National Flag Algorithm

package com.takeyouforward.Arrays;

import java.util.Arrays;

public class sortArrayZeroOneTwo {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2,1,2,0,0,0,1};

        System.out.println(Arrays.toString(sortArray2(arr)));
    }

    //brute force approach - use the merge sort as it take O(NlogN) time and O(N) for space

    //better approach
    //O(2N) and space - O(1)
    public static int[] sortArray(int[] arr){
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < arr.length; i++) {          //O(N)
            if (arr[i] == 0){
                count0++;
            } else if (arr[i] == 1){
                count1++;
            } else {
                count2++;
            }
        }
        for (int i = 0; i < count0; i++) {                          //O(N)
            arr[i] = 0;
        }
        for (int i = count0; i < count0+count1; i++) {
            arr[i] = 1;
        }
        for (int i = count0+count1; i < arr.length ; i++){
            arr[i] = 2;
        }

        return arr;
    }

    //optimal approach
    // Dutch National Flag Algorithm
    //it used three pointer to sort the array
    public static int[] sortArray2(int[] arr){
        int low = 0, mid = 0, high = arr.length-1;
        while (mid <= high){
            if (arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1){
                mid++;
            } else if (arr[mid] == 2) {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        return arr;
    }
}
