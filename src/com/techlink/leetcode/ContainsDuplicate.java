package com.techlink.leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

//    public boolean containsDuplicate(int[] nums) {
//        //Time complexity = log(n^2);
//        for(int i=0; i<nums.length; i++) {
//            for(int j=i + 1; j<nums.length; j++) {
//                if(nums[i] == nums[j]) {
//                    return true;
//                }
//            }
//        }
//
//        return false;
//    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();

        int[] nums = {1,3,3,4,3,2,4,2};

        System.out.println(containsDuplicate.containsDuplicate(nums));
    }

}
