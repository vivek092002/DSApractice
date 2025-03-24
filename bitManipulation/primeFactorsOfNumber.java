package com.takeyouforward.bitManipulation;

import java.util.*;


//Algorithm
//Step 1: Initialise an empty array to store the prime factors of n.
//Step 2: Start a loop from 1 to the square root of n and iterate through each number i. At each step:
//Check if n is divisible by i without any remainder.
//          If it is divisible, push it into the array to store the prime factors of n.
//          Enter a while loop to continuously divide n by i until its no longer divisible.
//          This eliminates repeat factors and ensures each prime factor is included only once.
//Step 3: After iterating through potential factors of n,
//      return the array containing all the unique prime factors of n.

public class primeFactorsOfNumber {

    public static List<Integer> primeFactors(int num){
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                list.add(i);
            }

            while (num % i == 0){
                 num = num / i;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int num = 100;
        System.out.println(primeFactors(num));
    }
}
