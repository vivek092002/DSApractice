//https://leetcode.com/problems/assign-cookies/description/

package com.takeyouforward.greedyAlgorithms;

import java.util.Arrays;

public class assignCookies {
    public static void main(String[] args) {
        int[] g = {1, 5, 3, 3, 4};
        int[] s = {4, 2, 1, 2, 1, 3};
        System.out.println(findContentChildren(g,s));

    }

    //To solve this question, we sort the greed and cookies array to easily make decisions about
    // which cookie to assign to which child.
    // We then iterate over the sorted arrays comparing elements and assigning the smallest
    // available cookie with the least greedy child.

    //O(NlogN) + O(M logM) + O(M)
    public static int findContentChildren(int[] g, int[] s){
        int n = g.length; int m = s.length;
        int l = 0;
        int r = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while (r < m && l < n){
            if (g[l] <= s[r]){
                l++;
            }
            r++;
        }
        return l;
    }
}
