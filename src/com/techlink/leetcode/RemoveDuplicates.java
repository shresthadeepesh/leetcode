package com.techlink.leetcode;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] nums = {98, 99, 99, 100};

        int replace = 12700;

        for(int i = 0; i<nums.length; i++) {
            for(int j = i + 1; j<nums.length; j++) {
                if(nums[i] == nums[j] && nums[i] != replace) {
                    nums[j] = replace;
                }
            }
        }
        int total = 0;
        for(int num: nums) {
            if(num != replace) {
                total++;
            }
        }

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(total);
    }

}
