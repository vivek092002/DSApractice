package com.takeyouforward.contest;

import java.util.*;

public class LastObjectExitTime {
    public static int findLastExitTime(int tableLength, List<Integer> position, List<Integer> velocity) {
        int n = position.size();
        double maxTime = 0;

        for (int i = 0; i < n; i++) {
            double exitTime;
            if (velocity.get(i) > 0) {
                exitTime = (double) (tableLength - position.get(i)) / velocity.get(i);
            } else {
                exitTime = (double) position.get(i) / Math.abs(velocity.get(i));
            }
            maxTime = Math.max(maxTime, exitTime);
        }

        return (int) Math.ceil(maxTime);
    }

    public static void main(String[] args) {
        int tableLength = 9;
        List<Integer> position = Arrays.asList(2, 4, 5);
        List<Integer> velocity = Arrays.asList(2, -2, -4);

        System.out.println(findLastExitTime(tableLength, position, velocity)); // Output: 5
    }
}

