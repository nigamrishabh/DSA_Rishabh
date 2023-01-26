package com.rishabh.dsa.array;

import java.util.Scanner;

public class PalindromicArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            System.out.println(palinArray(a, n));
        }
    }

    public static int palinArray(int[] a, int n) {
        int temp, count = 0, sum = 0;
        for (int i = 0; i < a.length; i++) {
            temp = a[i];
            sum = 0;
            while (temp != 0) {
                sum = sum * 10 + temp % 10;
                temp /= 10;
            }
            if (sum == a[i])
                count++;
        }
        if (count == n)
            return 1;
        return 0;
    }
}



