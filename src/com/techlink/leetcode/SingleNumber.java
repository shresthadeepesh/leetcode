package com.techlink.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        int unique = nums[0];
        for (int i = 1; i < nums.length; i++) {
            System.out.println(unique ^= nums[i]);
            unique ^= nums[i];
        }
        return unique;
    }

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }

}
