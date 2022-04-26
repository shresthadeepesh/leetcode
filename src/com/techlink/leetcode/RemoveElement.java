package com.techlink.leetcode;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

        int counter = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != val) {
                nums[counter] = nums[i];
                counter++;
            }
        }

        System.out.println(Arrays.toString(nums));
        System.out.println(counter);

    }

}
