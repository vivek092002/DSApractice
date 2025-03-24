package com.takeyouforward.bitManipulation;

import java.util.ArrayList;

public class sieveOfEratosthenes {

    public static ArrayList<Integer> primes(int num){
        ArrayList<Integer> list = new ArrayList<>();
        boolean prime[] = new boolean[num+1];
        for (int i = 0; i < num; i++) {
            prime[i] = true;
        }

        for (int i = 2; i*i <= num ; i++){
            if (prime[i] == true){
                for (int j = i*i; j <= num; j+=i) {
                    prime[j] = false;
                }
            }
        }
        for (int i = 2; i <= num; i++) {
            if (prime[i] == true){
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int num = 10;
        System.out.println(primes(num));
    }
}
