package com.takeyouforward.heap;


import java.util.*;

public class replaceElementsByRank {
    public static void main(String[] args) {
        int[] arr = {20,15,26,2,98,6};
        System.out.println(Arrays.toString(transformArray2(arr)));
    }

//    Approach:
//    Iterative over the array using a for loop.
//    Now use another for loop to check the number of elements having value less than the current element.
//    We can use a set to get the number of unique elements having value less than the current element.
//    Number of such unique elements + 1 is the rank of that element.

    //naive approach
    public static int[] transformArray(int[] arr){
        ArrayList<Integer> li = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            Set<Integer> st = new HashSet<>();
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < arr[i]){
                    st.add(arr[j]);
                }
            }
            int rank = st.size() + 1;
            li.add(rank);
        }
        int[] arr2 = li.stream().mapToInt(Integer::intValue).toArray();
        return arr2;
    }

    //better approach
    //O(N)
    public static int[] transformArray2(int[] arr){
        int[] ans = arr.clone();
        Arrays.sort(arr);
        Map<Integer, Integer> ranks = new HashMap<>();
        for (int i : arr){
            ranks.putIfAbsent(i, ranks.size() +1);
        }
        for (int i = 0; i < ans.length; i++) {
            ans[i] = ranks.get(ans[i]);
        }
        return ans;
    }
}
