package com.rishabh.dsa.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 6, -91, -89};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] > arr[j - 1]) {
                    break;
                } else {
                    swap(arr, j, j - 1);
                }
            }

        }
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[end];
        arr[end] = arr[start];
        arr[start] = temp;
    }


}
