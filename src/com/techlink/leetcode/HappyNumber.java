package com.techlink.leetcode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while(n != 1 && !set.contains(n)) {
            set.add(n);
            n = getDigitsSum(n);
        }

        return n == 1;
    }

    private static int getDigitsSum(int n) {
        int result = 0;
        while(n != 0) {
            int digit = n % 10;
            result = result + digit * digit;
            n = n/10;
        }

        return result;
    }

    public static void main(String[] args) {
        HappyNumber happyNumber = new HappyNumber();
        System.out.println(happyNumber.isHappy(4));
        System.out.println(happyNumber.isHappy(2));
        System.out.println(happyNumber.isHappy(19));
    }

}
