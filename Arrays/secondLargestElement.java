package com.takeyouforward.Arrays;

import java.util.Arrays;

public class secondLargestElement {
    public static void main(String[] args) {
        int[] arr = {1,2,4,7,7,5};

//        System.out.println(secondLargest(arr));
//        System.out.println(secondLargest2(arr));
        System.out.println(secondLargest3(arr));
    }

    //brute force approach
    //O(NLogN + N)
    public static int secondLargest(int[] arr){
        Arrays.sort(arr);                                   //O(NLogN)
        int largest = arr[arr.length-1];
        int secondLargest = -1;
        for (int i = arr.length-2; i >= 0 ; i--) {          //O(N)
            if (arr[i] != largest){
                secondLargest = arr[i];
                break;
            }
        }
        return secondLargest;
    }

    //better approach
    //O(2N)
    public static int secondLargest2(int[] arr){
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {              //O(N)
            if (arr[i] > largest){
                largest = arr[i];
            }
        }

        int secondLargest = -1;
        for (int i = 0; i < arr.length; i++) {              //O(N)
            if (arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    //Optimal approach
    //O(N)
    public static int secondLargest3(int[] arr){

        int n = arr.length;
        int largest = arr[0];
        int secondLargest = -1;
        for (int i = 1; i < n; i++) { 
            if (arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

}
