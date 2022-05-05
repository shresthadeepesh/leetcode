package com.techlink.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SetMismatch {

    public static int[] findErrorNums(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] == nums[j]) {
                    list.add(j);
                    list.add(j+1);
                }
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));

        int[] nums1 = {2,2};
        System.out.println(Arrays.toString(findErrorNums(nums1)));
    }

}
