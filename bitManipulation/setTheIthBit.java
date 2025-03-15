package com.takeyouforward.bitManipulation;

public class setTheIthBit {
    public static void main(String[] args) {
        int n = 9;
        int k = 2;

        System.out.println(setBit(n,k));
    }

//    set a specific bit in a decimal number to 1 at a given index,
//    we generate a mask with a 1 at the index position and 0s elsewhere.
//    We then perform a bitwise OR operation between the original number and the mask to set the desired bit.
//    For all positions except the ith index, the corresponding bits in the number remain unchanged because
//    ORing with 0 does not change the value. At the ith index, the bit in the number will be set to 1 if it
//    was previously 0, and it will remain 1 if it was already 1.
    public static int setBit(int n, int k){
        int mask = 1 << k;

        return n | (mask);
    }
}
