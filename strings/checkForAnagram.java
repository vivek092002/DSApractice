package com.takeyouforward.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class checkForAnagram {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String str2 = br.readLine();
        System.out.println(checkAnagram2(str,str2));
    }

    //brute force approach
    public static boolean checkAnagram(String str, String str2){
        if (str.length() != str2.length()){
            return false;
        }
        char[] s1Array = str.toCharArray();
        char[] s2Array = str2.toCharArray();
        Arrays.sort(s1Array);
        Arrays.sort(s2Array);

        return Arrays.equals(s1Array, s2Array);
    }

    //optimal approach
    //counting techniques - is one char is present in s1 then put +1 in its frequency and if it is present
    // in the other string then put -1.
    public static boolean checkAnagram2(String str, String str2){
        if (str.length() != str2.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i) , map.getOrDefault(str.charAt(i) , 0) + 1);
        }
        for (int i = 0; i < str2.length(); i++) {
            map.put(str2.charAt(i) , map.getOrDefault(str2.charAt(i) , 0) - 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if (entry.getValue() != 0){
                return false;
            }
        }
        return true;
    }
}
