package com.takeyouforward.strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class leftMostRepeatingCharacter {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(leftMostRepeating3(str));
    }

    //brute force approach
    public static int leftMostRepeating(String str){
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)){
                    return i;
                }
            }
        }
        return -1;
    }

    static final int CHAR = 256;
    //better approach
    public static int leftMostRepeating2(String str){
        int[] count = new int[CHAR];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] > 0){
                return i;
            }
        }
        return -1;
    }

    //optimal approach
    public static int leftMostRepeating3(String str){
        boolean[] visited = new boolean[CHAR];
        int res = -1;
        for (int i = str.length()-1; i > 0 ; i--) {
            if (visited[str.charAt(i)]){
                res = i;
            } else {
                visited[str.charAt(i)] = true;
            }
        }
        return res;
    }
}
