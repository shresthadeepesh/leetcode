package com.techlink.leetcode;

public class SearchInsert {

    public int searchInsert(int[] nums, int target) {

        //bubble search
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == target) {
                return i;
            }
        }

        if(nums[0] > target) {
            return 0;
        }

        //else the target value lies between
        for(int i=0; i<nums.length - 1; i++) {
            if(nums[i] < target && nums[i+1] > target) {
                return i + 1;
            }
        }

        return nums.length;
    }

    public static void main(String[] args) {
        SearchInsert searchInsert = new SearchInsert();

        int[] nums = {1,3,5,6};
        int target = 0;

        int output = searchInsert.searchInsert(nums, target);

        System.out.println(output);
    }

}
