package com.techlink.leetcode;

public class ClimbingStairs {

    //a fibonacci series like structure where 1,1,2,3,5,8,13,21,.....
    public int climbStairs(int n) {
        int[] ways = new int[n+1];
        ways[0] = 1;
        ways[1] = 1;

        for(int i=2;i<ways.length; i++) {
            ways[i] = ways[i-1] + ways[i-2];
        }

        return ways[ways.length-1];
    }

    public static void main(String[] args) {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        System.out.println(climbingStairs.climbStairs(3));
    }

}
