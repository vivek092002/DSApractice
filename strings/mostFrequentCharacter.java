package com.takeyouforward.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class mostFrequentCharacter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), 1);
            } else {
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }
        }

        int maxCount = 0;
        char maxChar = 'z';
        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            int count = entry.getValue();
            char ch = entry.getKey();

            if ((count > maxCount) || (count == maxCount && ch < maxChar)){
                maxCount = count;
                maxChar = ch;
            }
        }

        System.out.println(maxChar);
    }
}
