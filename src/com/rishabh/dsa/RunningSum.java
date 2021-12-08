package com.rishabh.dsa;

import java.util.Arrays;

public class RunningSum {

    public static void main(String[] args) {

        int[] input = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(input)));

    }
    public static int[] runningSum(int[] nums) {
        int sum = 0;
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
           sum +=nums[i];
           ans[i] = sum;
        }

        return ans;

    }
}
