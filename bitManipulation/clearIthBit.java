package com.takeyouforward.bitManipulation;

public class clearIthBit {
    public static void main(String[] args) {
        int n = 13;
        int k = 2;

        System.out.println(clearBit(n,k));
    }
    /*
    To clear the bit at the ith index to 0, we need to first target the ith position.
    This can be done by creating a mask using 1 << i, this shifts 1 to the left i times setting the
    ith bit to 1 and all other bits to 0. We negate this mask to make all bits 1 except for the ith bits, which is now 0.
    Now that we have the inverted mask, we perform a bitwise AND operation between n and the inverted mask.
    This operation clears the ith bit of n to 0 while leaving all other bits unchanged.
    Finally, we assign the result of the bitwise AND operation back to n, effectively updating n with the ith bit cleared.
     */
    public static int clearBit(int n, int k){
        int mask = ~(1 << k);

        return n & mask;
    }
}
