package com.takeyouforward.heap;

import java.util.HashMap;
import java.util.Map;

public class handOfStraight {
    public static void main(String[] args) {
        int[] hands = {1,2,3,6,2,3,4,7,8};
        int grpSize = 3;
        System.out.println(straightHand(hands,grpSize));
    }

    //Approach:
    //Count Frequencies: Use a TreeMap (or HashMap) to count the occurrences of each card.
    //Use a Min-Heap: Extract the smallest card and try forming a group of groupSize consecutive numbers.
    //Decrement Counts: If you cannot complete a group, return false.
    //Repeat Until All Cards Are Used.

    public static boolean straightHand(int[] hands, int grpSize){
        
        //edge cases
        if (hands.length % grpSize != 0){
            return false;
        }
        if (grpSize == 1){
            return true;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int card : hands){
            map.put(card, map.getOrDefault(card, 0)+1);
        }
        for (int key : map.keySet()) {
            int count = map.get(key);
            if (count > 0) {
                for (int i = 0; i < grpSize; i++) {
                    int num = key + i;
                    if (map.getOrDefault(num, 0) < count) {
                        return false;
                    }
                    map.put(num, map.get(num) - count);
                }
            }
        }
        return true;
    }
}
