package com.techlink.leetcode;

public class ThreeConsecutiveOdd {

    public static boolean threeConsecutiveOdds(int[] arr) {

        if(arr.length < 3) return false;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] % 2 != 0 &&
                    (i+1) < arr.length &&
                    arr[i+1] % 2 != 0 &&
                    (i+2) < arr.length &&
                    arr[i+2] % 2 != 0
            ) {
                    return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,34,3,4,5,7,23,12};
        System.out.println(threeConsecutiveOdds(nums));

        int[] nums1 = {2,6,4,1};
        System.out.println(threeConsecutiveOdds(nums1));
    }

}
