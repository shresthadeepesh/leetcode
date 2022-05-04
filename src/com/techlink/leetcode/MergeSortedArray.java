package com.techlink.leetcode;

import java.util.Arrays;

public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m, j = 0;

        while(j != nums2.length) {
            nums1[i++] = nums2[j++];
        }

        Arrays.sort(nums1);

        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();

        int[] first = {1,2,3,0,0,0};
        int m = 3;
        int[] second = {2,5,6};
        int n =3;

        mergeSortedArray.merge(first, m, second, n);
        mergeSortedArray.merge(first, m, second, n);
    }

}
