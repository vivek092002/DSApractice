package com.takeyouforward.bitManipulation;

public class kthBitIsSetOrNot {
    public static void main(String[] args) {
        int n = 13;
        int k = 2;
        System.out.println(setOrNot(n,k));
    }

    //The idea is to leverage bitwise operations to check if a specific bit is set.
    // Create a number that has only the k-th bit set (by left-shifting 1 by k positions).
    // Then we perform a bitwise AND operation between this number and the given number n.
    // If the result is non-zero, it means the k-th bit in n is set to 1, otherwise it’s 0.
    public static boolean setOrNot(int n, int k){
        int mask = 1 << k;
        if ((n & mask) > 0){
            return true;
        } else {
            return false;
        }
    }
}
