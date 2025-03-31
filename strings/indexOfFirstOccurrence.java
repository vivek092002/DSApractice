package com.takeyouforward.strings;


public class indexOfFirstOccurrence {
    public static void main(String[] args) {
        String str = "sadbutsad";
        String str2 = "sad";
        System.out.println(checkOccurrence(str,str2));
    }

    //Naive Approach
    public static int checkOccurrence(String str, String str2){
        int n = str.length();
        int m = str2.length();

        for (int i = 0; i <= n-m; i++) {
            int j;
            for (j = 0 ; j < m ; j++){
                if (str2.charAt(j) != str.charAt(i+j)){
                    break;
                }
            }
            if (j == m){
                return i;
            }
        }
        return -1;
    }
}
