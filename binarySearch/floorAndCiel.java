package com.takeyouforward.binarySearch;

import java.util.ArrayList;

public class floorAndCiel {
    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};
        int target = 5;
        System.out.println(getFloorAndCiel(arr,target));
    }

    //optimal approach
    public static ArrayList<Integer> getFloorAndCiel(int[] arr, int target){
        int floor = getFloor(arr,target);
        int ceil = getCeil(arr,target);
        ArrayList<Integer> st = new ArrayList<>();
        st.add(floor);
        st.add(ceil);

        return st;
    }

    private static int getFloor(int[] arr, int target){
        int low = 0;
        int high = arr.length;
        int ans = arr.length;
        while (low <= high){
            int mid = (low + high) / 2;
            if (arr[mid] <= target){
                ans = arr[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    private static int getCeil(int[] arr, int target){
        int low = 0;
        int high = arr.length;
        int ans = arr.length;
        while (low <= high){
            int mid = (low + high) / 2;
            if (arr[mid] >= target){
                ans = arr[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
