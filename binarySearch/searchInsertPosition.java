package com.takeyouforward.binarySearch;

public class searchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 5;
        System.out.println(searchInsert(arr,target));
    }

    //optimal approach
    public static int searchInsert(int[] arr, int target){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int ans = n;
        while (low <= high){
            int mid = (low + high) / 2;
            if (arr[mid] >= target){
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
