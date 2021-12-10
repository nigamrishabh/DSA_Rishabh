package com.rishabh.dsa;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {

        char[] str = {'r','i','s','h'};
        reverseString(str);
    }
    public static void reverseString(char[] s) {

        char temp;
            int i = 0;
            int j = s.length-1;
            while(i<j){
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        System.out.println(s);
    }

}