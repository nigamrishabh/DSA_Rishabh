package com.rishabh.dsa.sorting;

import java.util.Arrays;

public class CyclicSort {


    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
    }


}


