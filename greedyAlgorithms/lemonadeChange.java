//https://leetcode.com/problems/lemonade-change/description/
package com.takeyouforward.greedyAlgorithms;

public class lemonadeChange {
    public static void main(String[] args) {
        int[] bills = {5,5,5,10,20};

        System.out.println(change(bills));
    }

    public static boolean change(int[] bills){
        int five = 0, ten = 0, twenty = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5){
                five += 1;
            } else if (bills[i] == 10){
                if (five > 0){
                    five -= 1;
                    ten += 1;
                } else {
                    return false;
                }
            } else {
                if (five > 0 & ten > 0){
                    five -= 1;
                    ten -= 1;
                    twenty++;
                } else if (five >= 3){
                    five -= 3;
                    twenty++;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
