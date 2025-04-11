package com.takeyouforward.stackAndQueue.monotonic;

public class trappingRainWater {

    //better approach using prefix sum and suffix sum
    //Take 2 array prefix and suffix array and precompute the leftMax and rightMax for each index beforehand.
    // Then use the formula min(prefix[I], suffix[i])-arr[i] to compute water trapped at each index.
    //O(3N) and O(2N)
    public static int trappingWater(int[] arr){
        int total = 0;      //water trapped
        int[] prefix = new int[arr.length];
        int[] suffix = new int[arr.length];
        //finding prefix sum
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = Math.max(prefix[i-1], arr[i]);
        }
        //finding suffix sum
        suffix[arr.length-1] = arr[arr.length-1];
        for (int i = arr.length - 2; i >= 0 ; i--) {
            suffix[i] = Math.max(suffix[i+1], arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            total += Math.min(prefix[i], suffix[i]) - arr[i];
        }
        return total;
    }


    //optimal approach
    //Approach: Take 2 pointers l(left pointer) and r(right pointer)
    // pointing to 0th and (n-1)th index respectively. T
    // ake two variables leftMax and rightMax and initialize them to 0. If height[l] is less than or equal to
    // height[r] then if leftMax is less than height[l] update leftMax to height[l] else add leftMax-height[l]
    // to your final answer and move the l pointer to the right i.e l++. If height[r] is less than height[l],
    // then now we are dealing with the right block. If height[r] is greater than rightMax,
    // then update rightMax to height[r] else add rightMax-height[r] to the final answer.
    // Now move r to the left. Repeat these steps till l and r crosses each other.
    //
    //Intuition: We need a minimum of leftMax and rightMax.So if we take the case when height[l]<=height[r] we
    // increase l++, so we can surely say that there is a block with a height more than height[l] to the right of l.
    // And for the same reason when height[r]<=height[l] we can surely say that there is a block to the left of
    // r which is at least of height[r]. So by traversing these cases and using two pointers approach
    // the time complexity can be decreased without using extra space.
    //O(N)
    public static int trappingWater2(int[] arr){
        int total = 0;
        int l = 0, r = arr.length-1;
        int lmax = 0, rmax = 0;
        while (l < r){
            lmax = Math.max(lmax, arr[l]);
            rmax = Math.max(rmax, arr[r]);
            if (lmax < rmax){
                total += lmax - arr[l];
                l++;
            } else {
                total += rmax - arr[r];
                r--;
            }
        }
        return total;
    }


    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappingWater2(arr));
    }
}
