package com.takeyouforward.slidingWindow;

public class maxConsecutiveOnesThree {

    public static int longestOnes2(int[] arr, int k){
        int len = 0;
        int maxLen = 0;
        int zeroes = 0;
        int left = 0;
        int right = 0;
        while (right < arr.length){
            if (arr[right] == 0){
                zeroes++;
            }

            if (zeroes > k){
                if (arr[left] == 0){
                    zeroes--;
                }
                left++;
            }
            if (zeroes <= k){
                len = right - left + 1;
                maxLen = Math.max(len, maxLen);
            }
            right++;
        }
        return maxLen;
    }
    
    //O(N^2)
    public static int longestOnes(int[] arr, int k){
        int len = 0;
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            int zeroes = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] == 0){
                    zeroes++;
                }
                if (zeroes <= k){
                    len = j - i + 1;
                    maxLen = Math.max(maxLen, len);
                } else {
                    break;
                }
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(longestOnes2(arr,k));
    }
}
