package com.takeyouforward.slidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class longestSubString {

    //In this approach, we will make a map that will take care of counting the
    // elements and maintaining the frequency of each and every element as a unity by taking the
    // latest index of every element.
    public static int longestSubStringLength2(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int maxLen = 0;
        int n = str.length();
        while (right < n){
            if (map.containsKey(str.charAt(right))){
                left = Math.max(map.get(str.charAt(right))+1, left);
            }
            map.put(str.charAt(right), right);
            maxLen = Math.max(maxLen, right-left+1);
            right++;
        }
        return maxLen;
    }

    //O(N^2)
    public static int longestSubStringLength(String str){
        int maxLen = 0;
        for (int i = 0; i < str.length(); i++) {
            Set<Character> st = new HashSet<>();
            for (int j = i; j < str.length(); j++) {
                if (st.contains(str.charAt(j))) {
                    maxLen = Math.max(maxLen, j-i);
                    break;
                }
                st.add(str.charAt(j));
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        String str = "takeUforward";
        System.out.println(longestSubStringLength2(str));
    }
}
