package com.takeyouforward.binarySearch;

//arr[i] > x
public class upperBound {
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};
        int x = 15;
        System.out.println(UP(arr,x));
    }

    //optimal approach
    public static int UP(int[] arr, int x){
        int low = 0;
        int high = arr.length-1;
        int ans = arr.length;
        while (low<=high){
            int mid = (low + high) / 2;
            if (arr[mid] > x){
                ans = mid;
                high = mid - 1;
            } else {
                low  = mid + 1;
            }
        }
        return ans;
    }
}
