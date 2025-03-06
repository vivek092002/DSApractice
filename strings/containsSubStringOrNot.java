package com.takeyouforward.strings;

public class containsSubStringOrNot {
    public static void main(String[] args) throws java.lang.Exception {
        String str = "takeyouforward";
        String pattern = "forward";

        System.out.println(foundPatter(str,pattern));

    }

    public static int foundPatter(String str, String pattern){
        int n = str.length();
        int m = pattern.length();

        for (int i = 0; i < n; i++) {
            int temp = i;
            int j = 0;
            for (j = 0; j < m; j++) {
                if (str.charAt(temp) != pattern.charAt(j)){
                    break;
                }
                temp++;
            }
            if (j == m){
                return i;
            }
        }
        return -1;
    }
}
