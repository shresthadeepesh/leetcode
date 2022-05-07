package com.techlink.leetcode;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class ArrayToRank {

    public static int[] arrayRankTransform(int[] arr) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        // loop through each array element and insert to tree map with value 0
        for(int num: arr) {
            treeMap.put(num, 0);
        }

        // set the value of the tree an index pointer.
        int i = 1;
        for(Map.Entry<Integer, Integer> entry: treeMap.entrySet()) {
            entry.setValue(i);
            i++;
        }

        // get the value by searching from it key and set the index rank as the replacement.
        for(int j=0; j<arr.length; j++) {
            if(treeMap.containsKey(arr[j])) {
                arr[j] = treeMap.get(arr[j]);
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {37,12,28,9,100,56,80,5,12};
        System.out.println(Arrays.toString(arrayRankTransform(nums)));

        int[] nums1 = {40,10,20,30};
        System.out.println(Arrays.toString(arrayRankTransform(nums1)));
    }

}
