package com.takeyouforward.binarySearch;

public class binarySearching {
    public static void main(String[] args) {
        int[] arr = {3,4,6,7,9,12,16,17};
        int target = 16;

        int low = 0;
        int high = arr.length-1;
        System.out.println(BS2(arr,target, low, high));
    }

    //iterative method
    public static int BS(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;

        while (low <= high){
            int mid = (low+high)/2;

            if (arr[mid] == target){
                return mid;
            } else if (target > arr[mid]){
                low = mid+1;
            } else if (target < arr[mid]){
                high = mid - 1;
            }
        }
        return -1;
    }

    //recursive method
    public static int BS2(int[] arr, int target, int low, int high){
        //base case
        if (low > high){
            return -1;
        }
        int mid = (low + high) / 2;
        if (arr[mid] == target){
            return mid;
        } else if (arr[mid] < target){
            return BS2(arr,target,mid+1,high);
        }
        return BS2(arr,target,low,mid-1);
    }
}
