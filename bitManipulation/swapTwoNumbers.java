package com.takeyouforward.bitManipulation;

import java.util.ArrayList;
import java.util.List;

public class swapTwoNumbers {
    public static void main(String[] args) {
        int a = 13;
        int b = 6;
        System.out.println(getNumber(a,b));
    }

    public static List<Integer> getNumber(int a, int b){

        List<Integer> res = new ArrayList<>();
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        res.add(a);
        res.add(b);
        return res;
    }
}
