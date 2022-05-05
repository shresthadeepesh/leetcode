package com.techlink.leetcode;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
//        int unique = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            unique ^= nums[i];
//        }
//        return unique;

        for(int i=0; i<nums.length; i++) {
            int found = 0;
            for(int j=0; j<nums.length; j++) {
                if(nums[i] == nums[j]) {
                    found++;
                }
            }

            if(found == 1) {
                return nums[i];
            }
        }

        return nums[0];
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1};
        System.out.println(singleNumber(nums));
    }

}
