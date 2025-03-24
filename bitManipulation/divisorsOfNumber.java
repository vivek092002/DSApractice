package com.takeyouforward.bitManipulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class divisorsOfNumber {

    public static List<Integer> divisors(int num){
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i*i < num; i++) {
            if (num % i == 0){
                list.add(i);
            }

            if (num/i != i){
                list.add(num/i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int num = 100;
        System.out.println(divisors(num));
    }
}
