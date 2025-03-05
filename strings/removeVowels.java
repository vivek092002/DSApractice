package com.takeyouforward.strings;

import java.util.HashSet;
import java.util.Scanner;

public class removeVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "take u forward";
        System.out.println(removeVowel2(str));
        sc.close();
    }

    public static String removeVowel2(String str){
        HashSet<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('o');
        set.add('i');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('O');
        set.add('I');
        set.add('U');
        StringBuffer sb = new StringBuffer();
        for(char c : str.toCharArray()){
            if (!set.contains(c)){
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String removeVowel(String str){
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                str = str.substring(0,i) + str.substring(i+1);
                i--;
            }
        }
        return str;
    }
}
