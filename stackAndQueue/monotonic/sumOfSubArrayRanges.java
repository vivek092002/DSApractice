package com.takeyouforward.stackAndQueue.monotonic;

public class sumOfSubArrayRanges {

    //O(N^2)
    //generating all the sub arrays
    public static int sumOfSubArrays(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int largest = arr[i], smallest = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                largest = Math.max(largest, arr[j]);
                smallest = Math.min(smallest,arr[j]);

                sum += (largest - smallest);
            }
        }
        return sum;
    }

    //optimal solution

    
    public static void main(String[] args) {
        int[] arr = {4,-2,-3,4,1};
        System.out.println(sumOfSubArrays(arr));
    }
}
